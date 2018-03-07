package chapter08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chapter08.model.Person;

@SuppressWarnings("serial")
@WebServlet("/usebeanservlet")
public class UseBeanServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person = new Person("Tutku", "Ince", 27);
		
		// set data to request scope
		// this data will show in view layer.
		req.setAttribute("person", person);
		
		// RequestDispatcher dispatcher = req.getRequestDispatcher("chapter07/person.jsp");
		RequestDispatcher dispatcher = req.getRequestDispatcher("chapter07/personusebean.jsp");
		dispatcher.forward(req, resp);
	}
}
