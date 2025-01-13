<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Aditya@2003");
		
		Statement st = con.createStatement();
		
		String sql = "select * from register";
		
		ResultSet rs = st.executeQuery(sql);
		rs.next();
	%>
		
		Name: <%= rs.getString("name") %><br>
		Email: <%= rs.getString("email") %><br>
	
</body>
</html>