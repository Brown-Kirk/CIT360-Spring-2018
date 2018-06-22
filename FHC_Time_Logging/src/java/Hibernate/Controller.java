/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author reddo
 */
public class Controller {
    
    private HibernateUtil helper;
    private Session session;
    
    public String addNewPatron(String firstName, String lastName, boolean isMember) {
        String message = "";
        boolean successful = false;
        try {
            boolean nameExists = checkFirstLastExists(firstName,lastName);
            if (nameExists == true) {
                message = "Error: " + firstName + " " + lastName + " already exists.";
            } else {
                Patron p = new Patron();
                p.setPatronFirstName(firstName);
                p.setPatronLastName(lastName);
                p.setPatronMember(isMember);
                session = helper.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(p);
                session.getTransaction().commit();
                message = "Successfully added " + firstName + " " + lastName + " to the database.";
            }
        } catch (HibernateException ex) {
            //log exception, but how?
        } finally {
            session.close();
        }
        return message;
        
    }
    
        public String addNewLogInTime(int patronId, int actionId) {
        String message = "Values sent were patronId: " + patronId + "and actionId: " + actionId;
        boolean successful = false;
        try {
            TimeLog timeLog = new TimeLog();
            timeLog.setTimeLogActionId(actionId);
            timeLog.setTimeLogPatronId(patronId);
            session = helper.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(timeLog);
            session.getTransaction().commit();
            message = "Successfully added time entry.";
        } catch (HibernateException ex) {
            //log exception, but how?
            message = ex.toString();
        } finally {
            session.close();
        }
        return message;
        
    }
    
    public boolean checkFirstLastExists(String firstName, String lastName) {
        boolean nameExists = true;
        session = helper.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Query query = session.createQuery("FROM Patron WHERE patronFirstName = :patronFirstName AND patronLastName = :patronLastName");
        query.setParameter("patronFirstName", firstName);
        query.setParameter("patronLastName", lastName);
        List<Patron> list = query.list();
        t.commit();
        if(list.size()==0) {
            nameExists = false;
        } else {
            nameExists = true;
        }
        return nameExists;
    }
    
    public List<Patron> getPatronList() {
        
        session = helper.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        //Query query = session.createQuery("FROM Patron");
        Query query = session.createQuery("FROM Patron");
        List<Patron> list = query.list();
        t.commit();
        session.close();
        return list;
    }
    
    public Patron getPatron(int patronId) {
        
        session = helper.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        //Query query = session.createQuery("FROM Patron");
        Query query = session.createQuery("FROM Patron WHERE patronId = :patronId");
        query.setParameter("patronId", patronId);
        List<Patron> list = query.list();
        Patron patron = list.get(0);
        t.commit();
        session.close();
        return patron;
    }
    
    public List patronTimeReportQuery(int timeLogPatronId) {
        boolean nameExists = true;
        session = helper.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Query query = session.createQuery("FROM TimeLog WHERE timeLogPatronId = :timeLogPatronId");
        query.setParameter("timeLogPatronId", timeLogPatronId);
        List<TimeLog> list = query.list();
        t.commit();
        session.close();
        return list;
    }
    
    public static void main(String[] args) {
    }
    
}
