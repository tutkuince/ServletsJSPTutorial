package chapter05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/requestreadcookie")
public class RequestReadCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		
		if(cookies != null) {
			for (Cookie c : cookies) {
				System.out.println(c.getName());
				System.out.println(c.getValue());
				System.out.println(c.getMaxAge());
			}
		}
	}
}
