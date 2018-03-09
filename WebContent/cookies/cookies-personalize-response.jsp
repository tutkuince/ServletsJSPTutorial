<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Confirmation</title>
</head>
<body>
	<%
		// read from data
		String myLang = request.getParameter("favoriteLanguage");
	
		// create the cookie
		Cookie cookie = new Cookie("myApp.favoriteLanguage", myLang);
		
		// set the life span . . .  total number of seconds
		cookie.setMaxAge(60 * 60 * 24 * 365);	// expire time is 365 days.
		
		// send cookie to the browser
		response.addCookie(cookie);
	%>
	
	Thanks! We set your favorite language to : ${param.favoriteLanguage }
	<br/> <br/>
	<a href="cookies-homepage.jsp">Return to home page.</a>
	
	
</body>
</html>