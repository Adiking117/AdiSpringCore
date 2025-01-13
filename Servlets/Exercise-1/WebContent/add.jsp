<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<%@ page
	import = "java.util.*"
%>
<!-- Directive -> used for importing packages/ directives
-->


<%!

	int value = 1;

%>
<!-- Declaration -> used for declaring instance varibles insie the class
-->

<% 
	pageContext.setAttribute("name","ADITYA",PageContext.SESSION_SCOPE);
	// The session scope means the attribute will be available across
	// multiple requests and pages as 
	// long as the session is active.
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int result = i+j;
	
%>	
<!-- Scriptlet -> whatever is placed in <% %> all the objects and methods
 are given by tomacat and will go inside service method
this is called as implicit objects
A servlet file is created and class name is add_jsp
-->

<%=result
%>
<!-- Expression -> used for out.println 
-->

<h1>Welcome, <%= session.getAttribute("name") %>!</h1>

	
</body>
</html>