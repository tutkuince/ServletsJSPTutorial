<%@page import="jsptags.core.Student"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		// just create some sample data
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Tutku", "Ince", true));
		studentList.add(new Student("Ugur", "Batikan", false));
		studentList.add(new Student("Emin", "Koklu", true));
		studentList.add(new Student("Utku", "Ince", false));
		studentList.add(new Student("Alper", "Omeroglu", false));

		pageContext.setAttribute("myStudents", studentList);
	%>

	<table cellpadding="5px" cellspacing="5px" border="1px"
		bordercolor="blue">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gold Customer</th>
			</tr>
		</thead>
		<c:forEach var="student" items="${myStudents}">

			<tr>
				<td>${student.firstName }</td>
				<td>${student.lastName }</td>
				<td>
					<c:if test="${student.goldCustomer }">
						Special Discount
					</c:if>
					
					<c:if test="${not student.goldCustomer }">
						-
					</c:if>
				</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>