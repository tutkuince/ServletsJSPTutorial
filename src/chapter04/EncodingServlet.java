package chapter04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/encodingservlet")
public class EncodingServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// resp.setCharacterEncoding("ISO-8859-9");
		resp.setCharacterEncoding("UTF-8");	// it must be same as charset!
		String charEncoding = resp.getCharacterEncoding();	// default -> ISO-8859-1
		
		PrintWriter out = resp.getWriter();
		out.println(charEncoding);
		out.println("<html> <head> <meta charset='UTF-8'> </head> <body>");
		out.println("şçŞÇĞğİüÜı");	
		out.println("</body> </html>");
		
		
	}
}
