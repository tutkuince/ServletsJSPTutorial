package chapter05.attribute.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/lockcontextscope")
public class LockContextScope extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("test context attr<br>");
		
		synchronized (getServletContext()) {	// lock on context
												// this is the way to protect context attribute state
			getServletContext().setAttribute("foo", "22");
			getServletContext().setAttribute("bar", "42");
		}
	}
}
