package com.hibernate.demo.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.first.modal.student;

public class App 
{
    public static void main( String[] args )
    {
        /*student s1 = new student();
        s1.setId(102);
        s1.setName("Ghanshyam Sahu");
        s1.setRoll_no(36);
        s1.set_class("MCA-3");*/
        student obj = null;
        Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        session.save(s1);
//        session.persist(s1);
        
        obj = (student)session.get(student.class, 102);
        tx.commit();
        System.out.println("this is app.java "+obj);
        
    }
}
