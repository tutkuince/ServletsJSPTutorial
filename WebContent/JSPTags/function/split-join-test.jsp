<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="data" value="Izmir, Ankara, Istanbul, Antalya, Benane"/>
	<h3>Split Demo</h3>
	<c:set var="citiesArray" value="${fn:split(data, ',') }"/>
	
	<ul>
		<c:forEach var="city" items="${citiesArray }">
			<li>${city }</li>
		</c:forEach>
	</ul>
	
	<h3>Join Demo</h3>
	<c:set var="fun" value="${fn:join(citiesArray, '*') }" />
	Result of joining: ${fun }
	
</body>
</html>