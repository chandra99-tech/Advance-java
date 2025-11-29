package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class TestMyFacultyGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		System.out.println("Before Get");
		Faculty f1=session.get(Faculty.class, 201);
		Course c1 = session.get(Course.class, 1);
		
		System.out.println("After Get");
		tr.commit();
		System.out.println(f1);
		System.out.println(c1);
		System.out.println(c1.getFac());
		session.close();
		sf.close();
		
	}
}
