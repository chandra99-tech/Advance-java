package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestMyEmployee {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Department d1 = new Department(11,"Gaming","Mumbai");
		Department d2 = new Department(12,"Designer","Pune");
		Employee  e1 = new Employee(1,"Ayush",LocalDate.of(2025, 11, 21),40000,d1); 
		Employee  e2 = new Employee(2,"Chandrakant",LocalDate.of(2024, 1, 21),30000,d1); 
		Employee  e3 = new Employee(3,"Amol",LocalDate.of(2025, 10, 21),40000,d2); 
		Employee  e4 = new Employee(4,"Chinmay",LocalDate.of(2024, 10, 2),50000,d2);
		
		Set<Employee> set1 = new HashSet<>();
		set1.add(e1);
		set1.add(e2);
		Set<Employee> set2 = new HashSet<>();
		set2.add(e3);
		set2.add(e4);
		
		d1.setEset(set1);
		d2.setEset(set2);
		
		session.save(d1);
		session.save(d2);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		tr.commit();
		session.close();
		sf.close();
		
		
	}

}
