package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private int sId;
	private String sName;
	private String email;
	private String userName;
	private String password;
	private String course;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, String email, String userName, String password, String course,
			LocalDate dob) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.course = course;
		this.dob = dob;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", email=" + email + ", userName=" + userName
				+ ", password=" + password + ", course=" + course + ", dob=" + dob + "]";
	}
	
	
}
