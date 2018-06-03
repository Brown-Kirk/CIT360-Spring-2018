/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@SessionScoped
/**
 *
 * @author reddo
 */
public class Data {
    
    private HibernateUtil helper;
    private Session session;
    
    public void addCategory() {
        categories c = new categories("food");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
    
    public void getCategory() {
        session = helper.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Query query = session.createQuery("FROM categories");
        List<categories> list = query.list();
        for(categories c : list) {
            System.out.println("Category Name: " + c.getCategoryName());
            System.out.println("Category ID:   " + c.getCategoryId());
        }
        t.commit();
        session.close();
        }
    
    public static void main(String[] args) {
        Data datanew = new Data();
        datanew.getCategory();
        System.exit(0);
    }
}
