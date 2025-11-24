package dao;

import java.time.LocalDate;

import beans.MyUsers;

public interface RegisterDao {

//	MyUsers save(String fullName, String uName, String password, String email, LocalDate ldt, String gen, String role);

	boolean register(MyUsers u);

}
