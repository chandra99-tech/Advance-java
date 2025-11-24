package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn=null;
	static PreparedStatement selprod, add;
	static {
		try {
			conn=DBUtil.getMyConnection();
			selprod=conn.prepareStatement("select * from product1");
			add=conn.prepareStatement("insert into product1 values(?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = selprod.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDate(5).toLocalDate(), rs.getInt(6)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean save(Product p) {
		try {
			add.setInt(1, p.getpId());
			add.setString(2, p.getPname());
			add.setInt(3, p.getQty());
			add.setDouble(4, p.getPrice());
			add.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
			add.setInt(6, p.getcId());
			
			int n = add.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
