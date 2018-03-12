package servletreview;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/studentsservlet")
public class StudentsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Step 1: get the student data from helper class (model) 
		List<Student> studentList = StudentDataUtil.getStudents();
		
		// Step 2: add the studentList to request object
		req.setAttribute("studentList", studentList);
		
		// Step 3: get request dispatcher
		RequestDispatcher dispatcher = req.getRequestDispatcher("servlets/view/view-student.jsp");
		
		// Step 4: now forward to JSP
		dispatcher.forward(req, resp);
	}
}
