package chapter04;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/requestmethods")
public class RequestMethods extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// String hostName = req.getHeader("host");
		// System.out.println("Host: " + hostName);

		Enumeration<String> headerNames = req.getHeaderNames();

		while (headerNames.hasMoreElements()) {
			String header = headerNames.nextElement();
			String headerValue = req.getHeader(header);
			System.out.println(header + ": " + headerValue);
		}

		System.out.println(req.getRemotePort()); // Returns the Internet Protocol (IP) source port of the client or last
													// proxy that sent the request.
		System.out.println(req.getLocalPort()); // Returns the Internet Protocol (IP) address of the client or last
												// proxy that sent the request.
		System.out.println(req.getRemoteAddr()); // Returns the Internet Protocol (IP) address of the client or last
													// proxy that sent the request.
		System.out.println(req.getLocalAddr()); // Returns the Internet Protocol (IP) address of the interface on which
												// the request was received.
	}
}
