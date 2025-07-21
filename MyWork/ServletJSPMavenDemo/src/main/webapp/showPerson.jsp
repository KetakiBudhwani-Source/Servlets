<%@page import="com.ketaki.web.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
 
<%
    Person p =(Person) session.getAttribute("person") ;//request.getAttribute("person");
    out.println(p);
%>
</body>
</html>