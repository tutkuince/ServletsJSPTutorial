package chapter04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/lifecycleservlet")
public class LifeCycleServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("--- doGet() ---");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("--- init() ---");
		// for configuration
	}
	
	@Override
	public void destroy() {
		System.out.println("--- destroy() ---");
	}
}
