<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<body>

    <sql:setDataSource var="jdbc_db" driver="com.mysql.cj.jdbc.Driver" 
                       url="jdbc:mysql://localhost:3306/jdbc_db" 
                       user="root" password="Aditya@2003" />
    
    <sql:query var="rs" dataSource="${jdbc_db}">
        SELECT * FROM register
    </sql:query>
    
    <c:forEach var="row" items="${rs.rows}">
        Roll Number: ${row.email}, Name: ${row.name}<br>
    </c:forEach>
    
    <c:set var="str" value="Adi banega java dev" />
    Length: ${fn:length(str)}
    
    <c:forEach items="${fn:split(str,' ')}" var="s">
    <br/>
    </c:forEach>
    
    Index: ${fn:indexOf(str,"av")}
    
    <c:if test="${fn:contains(str,'jav')}">
    	java is there
    </c:if>
       

</body> 
</html>
