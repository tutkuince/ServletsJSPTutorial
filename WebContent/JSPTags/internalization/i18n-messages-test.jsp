<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" scope="session"/>
<fmt:setLocale value="${theLocale }" />
<fmt:setBundle basename="resources.mylabels" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="i18n-messages-test.jsp?theLocale=en_US">English(US)</a>
	|
	<a href="i18n-messages-test.jsp?theLocale=es_ES">Spanish(ES)</a>
	|
	<a href="i18n-messages-test.jsp?theLocale=de_DE">German(DE)</a>
	|
	<a href="i18n-messages-test.jsp?theLocale=tr_TR">Turkish(TR)</a>
	<hr/>
	<fmt:message key="label.greeting" />
	<br /> <br />
	<fmt:message key="label.firstName" />
	<i>Tutku</i>
	<br />
	<fmt:message key="label.lastName" />
	<i>Ince</i>
	<br />
	<fmt:message key="label.welcome" />
	<br />
	<hr/>
	Selected locale: ${theLocale}
</body>
</html>