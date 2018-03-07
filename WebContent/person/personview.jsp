<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="chapter05.attribute.request.dispatch.model.Person"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		@SuppressWarnings("unchecked")
		List<Person> personList = (List<Person>) request.getAttribute("personList");
	%>
	<table border="1px">
		<%
			for (Person p : personList) {
		%>
		<tr>
			<td>Name</td>
			<td>
				<%=
					p.getName()
				%>
			</td>
		</tr>
		<tr>
			<td>Surname</td>
			<td>
				<%=
					p.getSurname()
				%>
			</td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>