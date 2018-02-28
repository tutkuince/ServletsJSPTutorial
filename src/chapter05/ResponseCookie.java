package chapter05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/responsecookie")
public class ResponseCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie nameCookie = new Cookie("name", "Tutku");
		nameCookie.setMaxAge(10);	// after 10 seconds cookie will be deleted
		
		Cookie pwdCookie = new Cookie("pwd", "123456");
		
		resp.addCookie(nameCookie);
		resp.addCookie(pwdCookie);
	}
}
