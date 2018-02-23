package chapter01;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Ch1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		LocalDateTime date = LocalDateTime.now();
		
		out.println("<htlm>"
				+ "<body>"
				+ "<h1>Chapter 1 Servlet</h1>"
				+ "<br>" + date
				+ "</body>"
				+ "</html>");
	}
}
