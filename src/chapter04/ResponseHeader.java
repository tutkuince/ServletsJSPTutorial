package chapter04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseheader")
public class ResponseHeader extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("header1", "oldvalue");
		resp.setHeader("header1", "newvalue");	// update oldvalue to newvalue
		resp.addHeader("header1", "secondvalue");	// add new header1 obj to response header
	}
}
