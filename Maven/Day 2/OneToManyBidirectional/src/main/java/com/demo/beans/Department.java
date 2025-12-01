package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	int dId;
	String dName;
	String dLoc;
	@OneToMany(mappedBy = "dept")
	Set<Employee> eset ;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int dId, String dName, String dLoc, Set<Employee> eset) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dLoc = dLoc;
		this.eset = eset;
	}
	
	
	public Department(int dId, String dName, String dLoc) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dLoc = dLoc;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdLoc() {
		return dLoc;
	}
	public void setdLoc(String dLoc) {
		this.dLoc = dLoc;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dLoc=" + dLoc + ", eset=" + eset + "]";
	}
	
	
	
	
	

}
