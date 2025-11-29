package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Myuser2")
public class MyUser {
	
	@Id
	int uid;
	String name;
	String mob;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "addrid")
	Address addr ;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(int uid, String name, String mob, Address addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.mob = mob;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", name=" + name + ", mob=" + mob + ", addr=" + addr + "]";
	}
	

}
