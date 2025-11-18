package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCreateStatement {

    public static void main(String[] args) {
        Connection conn = null;
 
            try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.117:3306/dac14?useSSL=false";
		           
	            conn = DriverManager.getConnection(url, "dac14", "welcome");

	            if (conn != null) {
	                System.out.println("Connection Successful!");
	            }
	            else {
	            	System.out.println("Connection Failed!");
	            }
	            
	            Statement st= conn.createStatement();
	            ResultSet rs = st.executeQuery("select * from product");
	            while(rs.next()) {
	            	System.out.println("PRODID :" + rs.getInt(1));
	            	System.out.println("DESCRIP : " + rs.getString(2));
	            	System.out.println("PRICE : " + rs.getDouble(3));
	            }
	            
	            int prodid = 102;
	            String descrip = "Pen";
	            double price = 50.5;
	            
	            String query = "insert into product values("+prodid+",'"+descrip+"',"+price+")";
	            System.out.println(query);
	            int n = st.executeUpdate(query);
	            if(n>0) {
	            	System.out.println("Insertion Done");
	            }
	            else {
	            	System.err.println("error");
	            }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
            finally {
            	try {
            		conn.close();
            	}
            	catch (SQLException e) {
					e.printStackTrace();
				}
            }        
    }
}