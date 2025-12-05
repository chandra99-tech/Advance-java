package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Product {
	@Value("${prod.pid}")
	private int pid;
	@Value("${prod.pname}")
	private String name;
	@Value ("${prod.qty}")
	private int qty;
	@Value ("${prod.price}")
	private double price;
	@Autowired
	private Category category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String name, int qty, double price, Category category) {
		super();
		this.pid = pid;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.category = category;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty + ", price=" + price + ", category=" + category
				+ "]";
	}
	

}
