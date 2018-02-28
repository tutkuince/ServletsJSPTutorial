package chapter05.attribute.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextattribute")
@SuppressWarnings("serial")
public class ContextAttributeServlet extends HttpServlet{	// It is the biggest scope.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = req.getServletContext();
		
		context.setAttribute("contextAttrKey", "contextAttrValue");
		
	}
}
