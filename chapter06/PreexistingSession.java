package chapter06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/preexsistingsession")
public class PreexistingSession extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("test session <br>");

		HttpSession session = req.getSession(false); // returns pre-existing session or null if there was no session
														// associated with this client
		
		if(session == null) {
			out.print("no session was available");
			out.print("making one...");
			session = req.getSession();	// making new session
		} else {
			out.println("there was a session!");
		}
	}
}
