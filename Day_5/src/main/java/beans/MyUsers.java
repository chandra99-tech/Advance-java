package beans;

import java.time.LocalDate;

public class MyUsers {
	int id;
	String name;
	String uname;
	String password;
	String email;
	LocalDate dob;
	String gen;
	String role;
	
	public MyUsers() {
		super();
	}
	
	public MyUsers(String uname, String password, String role) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
	}
	
	
	
	public MyUsers(int id, String name, String uname, String password, String email, LocalDate dob, String gen,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.gen = gen;
		this.role = role;
	}
	
	

	public MyUsers(String name, String uname, String password, String email, LocalDate dob, String gen, String role) {
		super();
		this.name = name;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.gen = gen;
		this.role = role;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MyUsers [id=" + id + ", name=" + name + ", uname=" + uname + ", password=" + password + ", email="
				+ email + ", dob=" + dob + ", gen=" + gen + ", role=" + role + "]";
	}

	
	
	
	
	
}
