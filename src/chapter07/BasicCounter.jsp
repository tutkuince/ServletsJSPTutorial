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
		// <% % >     	-> Scriptlet
		// <%@ % >		-> Directive
		// <%= % >		-> Expression
	%> 
	
	<%
		// out.println(Counter.getCount());	// Not working
		out.println(chapter07.Counter.getCount());
	%>
	
	<%= 27 %>
	<%= "27" %>
	<!-- < % = String s = "foo" %> CANNOT BE -->
	<%= 42*20 %>
	
	<%= 5 > 3 %>
	<%= false %>
</body>
</html>