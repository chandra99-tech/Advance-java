package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address a1 = new Address(12,"S.B.Road","Pune","411016");
		MyUser u1 = new MyUser(1,"Ayush","123456789",a1);
		
//		session.save(a1);
		session.save(u1);
		tr.commit();
		session.close();
		sf.close();

	}

}
