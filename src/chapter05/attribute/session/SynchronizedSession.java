package chapter05.attribute.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/synchronizedsession")
public class SynchronizedSession extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("test session attributes <br>");
		HttpSession session = req.getSession();
		
		synchronized (session) {	// synchronize on the HTTPSession object, to protect the session attributes
			session.setAttribute("foo", "12");
			session.setAttribute("boo", "42");
			
			out.println(session.getAttribute("foo"));
			out.println(session.getAttribute("boo"));
		}
	}
}
