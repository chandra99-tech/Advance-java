package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.getCurrentSession();
		Transaction tr = session.beginTransaction();
		System.out.println("Before Getting Department");
		
		Department d = session.get(Department.class, 11);
		System.out.println(d);
		System.out.println("After Get Department");
		System.out.println("---------------------------------------");
		System.out.println("Before Getting Employee");
		Employee e = session.get(Employee.class, 2);
		Employee e1 = session.get(Employee.class,4);
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e.getDept().getdName());
		System.out.println("After Getting Employee");

	}

}
