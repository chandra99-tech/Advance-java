package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MyUsers;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String uname = req.getParameter("uname");
		String password = req.getParameter("password");
		LoginService lservice = new LoginServiceImpl();
		MyUsers user = lservice.validateUser(uname,password);
		if(user!=null) {
			RequestDispatcher rd=req.getRequestDispatcher("showproduct");
			rd.forward(req, resp);
		}
		else {
			out.println("<h1>Invalid Credentails</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}

}
