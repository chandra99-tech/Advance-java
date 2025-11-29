package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class TestMyFaculty {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Course c1 = new Course(1,101,"Java");
		Faculty f1 = new Faculty(201, "Kishori", "Advance Java", c1);
		c1.setFac(f1);
		
		session.save(c1);
		session.save(f1);
		tr.commit();
		session.close();
		sf.close();

	}

}
