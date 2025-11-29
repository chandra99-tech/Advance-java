package com.demo.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MyUser1")
public class MyUser {
	@Id
	int uid;
	String uname;
	String mob;
	@Embedded
	Address adrs;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(int uid, String uname, String mob, Address adrs) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mob = mob;
		this.adrs = adrs;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mob=" + mob + ", adrs=" + adrs + "]";
	}
	
	
}
