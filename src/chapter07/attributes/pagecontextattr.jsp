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
		Float one = new Float(4.2);
		pageContext.setAttribute("foo", one); // setting a page scope attribute
	%>

	<%
		// getting a page-scoped attribute
		pageContext.getAttribute("foo");
	%>


	<!-- // using the pageContext to get a session-scoped attribute. it is identical -->
	<%= pageContext.getAttribute("foo", PageContext.SESSION_SCOPE) %>
	
	<!-- using pageContext to get an application-scoped attribute -->
	E-mail is:
	<%= pageContext.getAttribute("mail", PageContext.APPLICATION_SCOPE) %>
	
	<!-- Using the pageContext to find an attribute when you don't know the scope -->
	<%= pageContext.findAttribute("foo") %>

</body>
</html>