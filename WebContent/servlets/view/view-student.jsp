<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">Student List</h1>
	<hr/>
	<table cellpadding="5" cellspacing="5" align="center" border="1" bordercolor="blue">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>E-mail</th>
		</tr>
		<c:forEach var="student" items="${studentList }">
			<tr>
				<td>${student.firstName }</td>
				<td>${student.lastName }</td>
				<td>${student.mail }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>