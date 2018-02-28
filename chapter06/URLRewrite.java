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
@WebServlet("/urlrewrite")
public class URLRewrite extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.setAttribute("key", "object value");
		
		PrintWriter out = resp.getWriter();
		
		String url = "urlwriter";
		String encodeURL = resp.encodeURL("urlwriter");	// URLRewriting process. Append the JSessionID to url
		
		out.println("<a href=\""+ url + "\">Click Me</a>");
		out.println("<a href=\""+ encodeURL + "\">Click Me Encoded</a>");
	}
}
