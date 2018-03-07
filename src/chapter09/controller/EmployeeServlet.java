package chapter09.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chapter09.model.Department;
import chapter09.model.Employee;

@SuppressWarnings("serial")
@WebServlet("/employeeservlet")
public class EmployeeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee employee = new Employee(100, "Tutku", "Ince");
		Department deprartment = new Department(200, "IT Department");
		employee.setDepartment(deprartment);

		req.setAttribute("employee", employee);
		
		Map<String, Integer> empSalaries = new HashMap<String, Integer>();
		empSalaries.put("emp1", 1000);
		empSalaries.put("emp2", 1000);
		empSalaries.put("emp3", 1000);
		
		req.setAttribute("salaries", empSalaries);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("chapter08/view/employee.jsp");
		dispatcher.forward(req, resp);
	}
}
