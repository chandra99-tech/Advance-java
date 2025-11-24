package dao;

import beans.MyUsers;

public interface LoginDao {

	MyUsers checkUser(String uname, String password);

}
