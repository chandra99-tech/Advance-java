package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Faculty {
	@Id
	int tid;
	String tname;
	String spec;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cid")
	Course cour;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int tid, String tname, String spec, Course cour) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.spec = spec;
		this.cour = cour;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public Course getCour() {
		return cour;
	}
	public void setCour(Course cour) {
		this.cour = cour;
	}
	@Override
	public String toString() {
		return "Faculty [tid=" + tid + ", tname=" + tname + ", spec=" + spec + ", cour=" + cour + "]";
	}
	
	
}
