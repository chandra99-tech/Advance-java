package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value("1")
	private int pId;
	@Value("Table")
	private String pName;
	@Value("55")
	private int qty;
	@Value("10.00")
	private double price;
	@Autowired
	private Category category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pId, String pName, int qty, double price, Category category) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.qty = qty;
		this.price = price;
		this.category = category;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
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
		return "Product [pId=" + pId + ", pName=" + pName + ", qty=" + qty + ", price=" + price + ", category="
				+ category + "]";
	}
	
	
}
