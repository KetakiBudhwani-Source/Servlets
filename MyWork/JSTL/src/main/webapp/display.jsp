<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<!--%
    String name = request.getAttribute("name").toString();
    out.println(name);

%-->
 <!-- you will get error directly using ${student.name}<br> you should use getters and setters in Student class -->
 
<!--  ${student.name}<br> -->

<!--<c:out value="${name}"/>-->

<!-- ${student} -->
${students}

<c:forEach items="${students}" var="s">
  ${s.name} <br/>

</c:forEach>
</body>
</html>