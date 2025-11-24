package service;

import beans.MyUsers;

public interface LoginService {

	MyUsers validateUser(String uname, String password);

}
