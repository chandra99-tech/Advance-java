package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Product;
import service.ProductService;
import service.ProductServiceImpl;

public class AddProduct extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String pname=req.getParameter("pname");
		int qty = Integer.parseInt(req.getParameter("pqty"));
		double price = Double.parseDouble(req.getParameter("price"));
		String dt = req.getParameter("expdate");
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		int cid = Integer.parseInt(req.getParameter("cid"));
		Product p = new Product(pname, qty, price, ldt, cid);
		ProductService pservice = new ProductServiceImpl();
		boolean status = pservice.addNewProduct(p);
		if(status) {
			System.out.println("Added");
			RequestDispatcher rd = req.getRequestDispatcher("showproduct");
			rd.include(req, resp);
		}
		else {
		RequestDispatcher rd = req.getRequestDispatcher("showproduct");
		rd.forward(req, resp);
		}
	}
}
