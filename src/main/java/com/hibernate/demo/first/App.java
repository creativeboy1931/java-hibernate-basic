package com.hibernate.demo.first;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.demo.first.modal.marks;
import com.hibernate.demo.first.modal.studentResult;

public class App 
{
    public static void main( String[] args )
    {
    	studentResult str = new studentResult();
    	marks mark = new marks();
    	mark.setId(102);
    	mark.setHindi(72);
    	mark.setEnglish(60);
    	mark.setMaths(62);
    	mark.setScience(62);
    	
    	str.setResult(true);
    	str.setStudentMarks(mark);
    	
        Configuration con = new Configuration().configure().addAnnotatedClass(studentResult.class).addAnnotatedClass(marks.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(mark);
        session.persist(str);
        studentResult re = session.get(studentResult.class, 2);
        tx.commit();
        System.out.println("this is app.java"+re.toString());
        
    }
}
