package chapter05.attribute.request.dispatch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chapter05.attribute.request.dispatch.model.Person;

@SuppressWarnings("serial")
@WebServlet("/person")
public class PersonController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Controller > Service Layer > DAO
		
		Person p1 = new Person("Tutku", "Ince");
		Person p2 = new Person("Utku", "Ince");
		Person p3 = new Person("Test", "Test");
		
		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		req.setAttribute("personList", personList);	// add to request attribute
		
		// When you handle request, you can use servlets and jsp.
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/person/personview.jsp");
		dispatcher.forward(req, resp);
	}
}
