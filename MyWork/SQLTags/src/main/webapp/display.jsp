<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ketakidb" user="root" password="Test@123" />

<sql:query var="rs" dataSource="${db}">select * from gadgets</sql:query>

<c:forEach items="${rs.rows}" var="row">
    <c:out value="${row.gid}"></c:out> :  <c:out value="${row.gname}"></c:out> : <c:out value="${row.price}"></c:out> <br>
    
</c:forEach>
</body>
</html>