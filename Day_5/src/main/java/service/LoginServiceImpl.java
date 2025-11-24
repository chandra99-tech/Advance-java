package service;

import beans.MyUsers;
import dao.LoginDao;
import dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	LoginDao ldao;

	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public MyUsers validateUser(String uname, String password) {
		return ldao.checkUser(uname, password);
	}
	
	
	
	
	
}
