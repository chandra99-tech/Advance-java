package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Project {
	@Id
	int pId;
	String pName;
	LocalDate startDate;
	@ManyToMany (mappedBy = "pset", cascade = CascadeType.ALL)
	Set<Employee1> eset;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pId, String pName, LocalDate startDate, Set<Employee1> eset) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.startDate = startDate;
		this.eset = eset;
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public Set<Employee1> getEset() {
		return eset;
	}
	public void setEset(Set<Employee1> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", startDate=" + startDate + ", eset=" + eset + "]";
	}
	
	
}
