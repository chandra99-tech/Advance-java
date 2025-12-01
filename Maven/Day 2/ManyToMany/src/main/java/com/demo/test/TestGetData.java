package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee1;
import com.demo.beans.Project;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		System.out.println("Before getting Project");
		Project p1 = session.get(Project.class, 21);
		System.out.println(p1);
		System.out.println("After Getting Project");
		
		System.out.println("----------------------------------------");
		
		System.out.println("Before Getting Employee");
		Employee1 e1 = session.get(Employee1.class, 1);
		
		System.out.println(e1);
		
		System.out.println(e1.getPset());
		
		System.out.println("After Getting Employee");
		
		tr.commit();
		session.close();
		sf.close();
	}

}
