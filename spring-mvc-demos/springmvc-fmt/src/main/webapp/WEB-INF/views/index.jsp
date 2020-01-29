<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="${pageContext.request.contextPath}/datamodel/modelandview" method="post">
		<fmt:message key="i18n.username"></fmt:message>:<input type="text" name="username"/><br/>
		<fmt:message key="i18n.password"></fmt:message>:<input type="password" name="age"/>
		<input type="submit" value="提交"></input>
	</form>
	
	
</body>
</html>