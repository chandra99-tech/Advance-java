package test;

import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPrepareStatement {

	public static void main(String[] args) {
		Connection conn=null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.117:3306/dac14?useSSL=false";
			
			conn=DriverManager.getConnection(url,"dac14","welcome");
			
			PreparedStatement pst=conn.prepareStatement("select * from product");
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				System.out.println("PRODID :"+rs.getInt(1));
				System.out.println("DESC :"+rs.getString(2));
				System.out.println("Price :"+ rs.getInt(3));
			}
			
			PreparedStatement pst1=conn.prepareStatement("insert into product values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product ID :");
			int prodId =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product Name :");
			String prodName = sc.nextLine();
			System.out.println("Enter Product Price :");
			int price = sc.nextInt();
			
			pst1.setInt(1, prodId);
			pst1.setString(2, prodName);
			pst1.setInt(3, price);
			
			int n = pst1.executeUpdate();
			if(n>0) {
				System.out.println("Insert Successfully");
			}
			else {
				System.out.println("error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try{
				conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
