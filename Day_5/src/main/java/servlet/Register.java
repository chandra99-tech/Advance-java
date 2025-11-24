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

import beans.MyUsers;
import service.RegisterService;
import service.RegisterServiceImpl;

public class Register extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String fullName = req.getParameter("fullname");
		String uName = req.getParameter("uname");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String dt = req.getParameter("dob");
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		String gen = req.getParameter("gender");
		String role = req.getParameter("role");
		
		MyUsers u = new MyUsers(fullName, uName, password,email,ldt,gen,role);
		RegisterService rs=new RegisterServiceImpl();
		boolean status = rs.add(u);
		if(status) {
			System.out.println("Registered Successfully!");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		else {
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.forward(req, resp);
		}
		
		
	}
}
