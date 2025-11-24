package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import beans.MyUsers;

public class RegisterDaoImpl implements RegisterDao {
	static Connection conn=null;
	static PreparedStatement reg;
	static {
		try {
			conn=DBUtil.getMyConnection();
			reg=conn.prepareStatement("insert into users values(?,?,?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Override
//	public MyUsers save(String fullName, String uName, String password, String email, LocalDate ldt, String gen,
//			String role) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean register(MyUsers u) {
		try {
			reg.setInt(1, u.getId());
			reg.setString(2, u.getName());
			reg.setString(3, u.getUname());
			reg.setString(4, u.getPassword());
			reg.setString(5, u.getEmail());
			reg.setDate(6, java.sql.Date.valueOf(u.getDob()));
			reg.setString(7,u.getGen());
			reg.setString(8, u.getRole());
			
			int n = reg.executeUpdate();
			return n>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
