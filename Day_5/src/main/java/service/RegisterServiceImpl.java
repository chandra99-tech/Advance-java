package service;

import java.time.LocalDate;

import beans.MyUsers;
import dao.RegisterDao;
import dao.RegisterDaoImpl;
import servlet.Register;

public class RegisterServiceImpl implements RegisterService {
	RegisterDao rdao;
	
	

	public RegisterServiceImpl() {
		super();
		rdao=new RegisterDaoImpl();
	}



	@Override
	public boolean add(MyUsers u) {
		return rdao.register(u);
	}

}
