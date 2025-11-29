package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	@Id
	int cid;
	int code;
	String cname;
	@OneToOne(mappedBy = "cour", fetch = FetchType.LAZY)
	
	Faculty fac;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, int code, String cname, Faculty fac) {
		super();
		this.cid = cid;
		this.code = code;
		this.cname = cname;
		this.fac = fac;
	}
	
	
	
	public Course(int cid, int code, String cname) {
		super();
		this.cid = cid;
		this.code = code;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Faculty getFac() {
		return fac;
	}
	public void setFac(Faculty fac) {
		this.fac = fac;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", code=" + code + ", cname=" + cname + "]";
	}
	
	
	
}
