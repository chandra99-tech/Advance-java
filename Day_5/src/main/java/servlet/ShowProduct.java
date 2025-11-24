package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Product;
import service.ProductService;
import service.ProductServiceImpl;

public class ShowProduct extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		ProductService pservice = new ProductServiceImpl();
		List<Product> plist = pservice.displayAllProduct();
		out.println("<table border='2'> <tr><th>Id</th><th>Prouct Name</th><th>Quantity</th><th>Price</th><th>Expiry Date</th><th>Customer Id</th><th>Action</th></tr>");
		for(Product p : plist) {	
			out.println("<tr><td>"+p.getpId()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td><td>"+p.getExpdate()+"</td><td>"+p.getcId()+"</td>");
			out.println("<td><a href='#'>Delete</a> <a href='#'>Edit</a></td></tr>");
		}
		out.println("</table>");
		out.println("<a href='addProduct.html'>Add New Product</a>");	
	}
}
