package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	@Value("101")
	private int cId;
	@Value("Furniture")
	private String cName;
	@Value("Elegent")
	private String discription;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int cId, String cName, String discription) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.discription = discription;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Category [cId=" + cId + ", cName=" + cName + ", discription=" + discription + "]";
	}
	
	
}
