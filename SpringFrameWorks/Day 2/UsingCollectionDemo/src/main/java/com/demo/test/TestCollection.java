package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Order;

public class TestCollection {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Order ord1 = (Order) ctx.getBean("ord1");
		System.out.println(ord1);

	}

}
