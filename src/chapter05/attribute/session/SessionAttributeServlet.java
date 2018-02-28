package chapter05.attribute.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/sessionattribute")
public class SessionAttributeServlet extends HttpServlet{	// Just same session scope!

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		List<String> myList = new ArrayList<>();
		myList.add("val1");
		myList.add("val2");
		myList.add("val3");
		
		session.setAttribute("sessionAttr", myList);
	}
}
