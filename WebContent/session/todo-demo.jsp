<%@ page import="java.util.*"%>

<html>
<head>
<title>TO DO List</title>
</head>
<body>

	<!-- Step 1: Create HTML form -->
	<form action="todo-demo.jsp">
		Add new item: <input type="text" name="theItem" /> 
		<input type="submit" value="Submit" />
	</form>

	<!-- Step 2: Add new item to "To Do" list -->
	<%
		// get the TO DO items from the session
		@SuppressWarnings("unchecked")
		List<String> items = (List<String>) session.getAttribute("myToDoList");

		// if the TO DO items doesn't exist, then create a new one
		if (items == null) {
			items = new ArrayList<String>();
			session.setAttribute("myToDoList", items);
		}

		// see if there is form data to add
		String theItem = request.getParameter("theItem");
		if (theItem != null) {
			items.add(theItem);
		}
	%>

	<!-- Step 3: Display all "To Do" item from session -->
	<hr>
	<b>To List Items:</b>
	<br />

	<ol>
		<%
			for (String temp : items) {
				out.println("<li>" + temp + "</li>");
			}
		%>
	</ol>

</body>
</html>