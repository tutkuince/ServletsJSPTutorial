<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- read the favorite programming language cookie -->
	
	<%
		// the default... if there are no cookies
		String favLang = "Java";
	
		// get the cookies from the browser request
		Cookie[] cookies = request.getCookies();
		
		// find our favorite language cookie
		if(cookies != null){
			
			for(Cookie cookie : cookies){
				if("myApp.favoriteLanguage".equals(cookie.getName())){
					favLang = cookie.getValue();
					break;
				}
			}
		}
	%>
	
	<h1>Training Portal</h1>
	
	<h2>New books for <%= favLang %> </h2>
	<ul>
		<li>Go go go</li>
		<li>Go go go</li>
	</ul>
	
	<h2>Latest news report for <%= favLang %> </h2>
	<ul>
		<li>Go go go</li>
		<li>Go go go</li>
	</ul>
	
	<h2>Hot jobs for <%= favLang %> </h2>
	<ul>
		<li>Go go go</li>
		<li>Go go go</li>
	</ul>
	
	<a href="cookies-personalize-form.html">Personalize this page</a>
</body>
</html>