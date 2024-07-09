package com.hibernate.demo.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.first.modal.student;
import com.hibernate.demo.first.modal.studentAddress;

public class App 
{
    public static void main( String[] args )
    {
        student s1 = new student();
        studentAddress s1A = new studentAddress();
        s1A.setCity("Baloda Bazar");
        s1A.setState("chhattisgarh");
        s1A.setStreet("road line");
        s1A.setPincode(493526);
        
        s1.setId(102);
        s1.setName("Gulshan verma");
        s1.setAddress(s1A);
        s1.setRoll_no(0);
        s1.set_class(null);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        session.save(s1);
        session.persist(s1);
        

        tx.commit();
        System.out.println("this is app.java");
        
    }
}
