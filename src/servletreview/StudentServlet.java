package servletreview;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/studentservlet")
public class StudentServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		
		PrintWriter out = resp.getWriter();
		out.println("The Student is confirmed: " + firstName + " " + lastName);
	}
}
