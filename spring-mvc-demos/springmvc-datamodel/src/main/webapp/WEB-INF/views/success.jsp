<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>访问成功</h4>
	name:${requestScope.name}<br/>
	user:${requestScope.user}<br/>
	
	<c:forEach items="${userList}" var="user">
		<c:out value="${user}"></c:out>
	</c:forEach>
	
	<br/>
	
	<c:forEach items="${userMap}" var="user">
		<c:out value="${user.value.username}"></c:out>
	</c:forEach>
</body>
</html>