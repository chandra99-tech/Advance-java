package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee1;
import com.demo.beans.Project;

public class TestEmpPro {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee1  e1 = new Employee1(1,"Ayush",LocalDate.of(2025, 11, 21),40000); 
		Employee1  e2 = new Employee1(2,"Chandrakant",LocalDate.of(2024, 1, 21),30000); 
		Employee1  e3 = new Employee1(3,"Amol",LocalDate.of(2025, 10, 21),40000); 
		Employee1  e4 = new Employee1(4,"Chinmay",LocalDate.of(2024, 10, 2),50000);
		
		Set<Employee1> eset1 = new HashSet<>();
		eset1.add(e1);
		eset1.add(e2);
		eset1.add(e3);
		Set<Employee1> eset2 = new HashSet<>();
		eset2.add(e4);
		eset2.add(e2);
		eset2.add(e1);
		
		Project p1 = new Project(21, "P1" , LocalDate.of(2025, 10, 10), eset1);
		Project p2 = new Project(22, "P2" , LocalDate.of(2025, 9, 19), eset2);
		Project p3 = new Project(23, "P3" , LocalDate.of(2024, 12, 12), eset1);
		
		Set<Project> pset1 = new HashSet<>();
		pset1.add(p1);
		pset1.add(p2);
		e1.setPset(pset1);
		
		Set<Project> pset2 = new HashSet<>();
		pset2.add(p3);
		pset2.add(p1);
		e2.setPset(pset2);
		
		Set<Project> pset3 = new HashSet<>();
		pset3.add(p2);
		pset3.add(p3);
		e3.setPset(pset3);
		e4.setPset(pset3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
