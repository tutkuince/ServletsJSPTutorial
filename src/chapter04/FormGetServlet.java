package chapter04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/requestGet")
public class FormGetServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String gender = req.getParameter("gender");
		String status = req.getParameter("status");
		String[] langs = req.getParameterValues("lang");
		
		PrintWriter out = resp.getWriter();
		
		out.write("Name: " + name);
		out.write("Surname: " + surname);
		out.write("Gender: " + gender);
		out.write("Status: " + status);
		out.write("Langs: " + Arrays.asList(langs));
	}
}
