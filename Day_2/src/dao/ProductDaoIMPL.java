package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import beans.Product;

public class ProductDaoIMPL implements ProductDao {
	static Connection conn;
	static PreparedStatement insProd, displayAllProduct,removeProduct,updateById,searchById,sortByPrice;
	
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			insProd=conn.prepareStatement("insert into product values(?,?,?)");
			displayAllProduct=conn.prepareStatement("select * from product");
			removeProduct=conn.prepareStatement("delete from product where prodId=?");
			updateById=conn.prepareStatement("update product set descrip=?,price=? where PRODID=?");
			searchById=conn.prepareStatement("select * from product where PRODID=?");
			sortByPrice=conn.prepareStatement("select * from product order by price");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public boolean save(Product p) {
		try {
			insProd.setInt(1, p.getProdID());
			insProd.setString(2, p.getDesc());
			insProd.setInt(3, p.getPrice());
			
			int n = insProd.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public List<Product> displayAllProduct() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = displayAllProduct.executeQuery();
			while(rs.next()) {
				plist.add(new Product (rs.getInt(1),rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(plist.size()>0) {
			return plist;
		}
		return null;
		
	}


	@Override
	public boolean removeProduct(int pid) {
		try {
			removeProduct.setInt(1, pid);
			int n=removeProduct.executeUpdate();
			if(n>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public void closeConnection() {
		DBUtil.closeMyConnection();
		
	}


	@Override
	public boolean updateById(int pId, String pname, int price) {
		try {
			updateById.setString(1, pname);
			updateById.setInt(2, price);
			updateById.setInt(3, pId);
			
			int n=updateById.executeUpdate();
			if(n>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public Product searchById(int pId) {
		Product P=null;
		try {
			searchById.setInt(1, pId);
			ResultSet rs=searchById.executeQuery();
			
			if(rs.next()) {
				P=new Product(rs.getInt(1),rs.getString(2), rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return P;
	}


	@Override
	public List<Product> arrangeByPrice() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = sortByPrice.executeQuery();
			while(rs.next()) {
				plist.add(new Product (rs.getInt(1),rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(plist.size()>0) {
			return plist;
		}
		return null;
	}

}
