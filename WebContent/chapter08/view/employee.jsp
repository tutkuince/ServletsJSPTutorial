<%@page import="chapter09.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee emp = (Employee) request.getAttribute("employee");
	%>
	<h1>With Java Expression</h1>
	Id
	<%=emp.getId()%>
	<br /> Name
	<%=emp.getName()%>
	<br /> Surname
	<%=emp.getSurname()%>
	<br /> Department Id
	<%=emp.getDepartment().getId()%>
	<br /> Department Name
	<%=emp.getDepartment().getName()%>

	<!-- 
		EL = Expression Language
		${employee.id}
	 -->

	<h1>With Expression Language</h1>
	Id
	${employee.id} <br/>
	Name
	${employee.name} <br/>
	Surname
	${employee.surname} <br/>
	Department ID
	${employee.department.id } <br/>
	Department Name
	${employee.department.name }
	
	<h1>With EL Map</h1>
	${salaries.emp1 }
	${salaries.emp2 }
	${salaries.emp3 }

</body>
</html>