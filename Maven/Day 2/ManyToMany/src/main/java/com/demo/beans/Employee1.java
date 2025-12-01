package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee1 {
	@Id
	int eId;
	String eName;
	LocalDate hireDate;
	double Sal;
	@ManyToMany
	Set<Project> pset;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int eId, String eName, LocalDate hireDate, double sal, Set<Project> pset) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.hireDate = hireDate;
		Sal = sal;
		this.pset = pset;
	}
	public Employee1(int eId, String eName, LocalDate hireDate, double sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.hireDate = hireDate;
		Sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public Set<Project> getPset() {
		return pset;
	}
	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", hireDate=" + hireDate + ", Sal=" + Sal + "]";
	}
	
	
}
