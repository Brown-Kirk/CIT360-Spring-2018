/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped
/**
 *
 * @author reddo
 */
public class Data {
    
    private categories c;
    private HibernateUtil helper;
    private Session session;
    
    public void addCategory() {
        c = new categories("food");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }
    
    public static void main(String[] args) {
        Data datanew = new Data();
        datanew.addCategory();
        System.exit(0);
    }
}
