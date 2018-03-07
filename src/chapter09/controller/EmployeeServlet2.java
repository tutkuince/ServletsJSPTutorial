package chapter09.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chapter09.model.Department;
import chapter09.model.Employee;

@SuppressWarnings("serial")
@WebServlet("/employeeservlet2")
public class EmployeeServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee = new Employee(100, "Tutku", "Ince");
		Department deprartment = new Department(200, "IT Department");
		employee.setDepartment(deprartment);

		req.setAttribute("employee2", employee);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("chapter08/view/employeebracket.jsp");
		dispatcher.forward(req, resp);
	}
}
