package servletreview;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/mvcdemoservlet")
public class MvcDemoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Step 0: Add data
		String[] students = { "Tutku", "Ugur", "Emino", "Alper" };
		req.setAttribute("studentList", students);
		
		// Step 1: Get request dispatcher
		RequestDispatcher dispatcher = req.getRequestDispatcher("servlets/view_students.jsp");
		
		// Step 2: forward the request to JSP
		dispatcher.forward(req, resp);
	}
}
