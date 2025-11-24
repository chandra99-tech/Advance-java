package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.MyUsers;

public class LoginDaoImpl implements LoginDao {
	static Connection conn=null;
	static PreparedStatement seluser;
	static {
		try {
			conn=DBUtil.getMyConnection();
			seluser=conn.prepareStatement("select userName, password, role from users where userName=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public MyUsers checkUser(String uname, String password) {
		try {
			seluser.setString(1, uname);
			seluser.setString(2, password);
			ResultSet rs=seluser.executeQuery();
			if(rs.next()) {
				MyUsers user = new MyUsers(rs.getString(1), rs.getString(2), rs.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
