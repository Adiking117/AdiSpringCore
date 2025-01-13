<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        
        String username = (String) session.getAttribute("username");
        if (username == null || username.isEmpty()) {
            response.sendRedirect("login.jsp");
            return;
        }
    %>
    
    Welcome, <c:out value="${sessionScope.username}"/><br/>
    
    <a href="videos.jsp">Videos</a><br/>
    
    <form action="Logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
