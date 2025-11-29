package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyUserGetData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		System.out.println("Before Get");
		MyUser u1 = session.get(MyUser.class, 1);
		Address a1 = session.get(Address.class, 9);
		
		System.out.println("After Get");
		
		tr.commit();
		System.out.println(u1);
		System.out.println(a1);
		System.out.println(a1.getUser());
		session.close();
		sf.close();

	}

}
