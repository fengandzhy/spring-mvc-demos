<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="${pageContext.request.contextPath}/datamodel/modelandview" method="post">
		username:<input type="text" name="username"/><br/>
		age:<input type="text" name="age"/>
		<input type="submit" value="提交"></input>
	</form>
	
	<form action="${pageContext.request.contextPath}/datamodel/map" method="post">
		username:<input type="text" name="username"/><br/>
		age:<input type="text" name="age"/>
		<input type="submit" value="提交"></input>
	</form>
	
	
	<form action="${pageContext.request.contextPath}/datamodel/model" method="post">
		username:<input type="text" name="username"/><br/>
		age:<input type="text" name="age"/>
		<input type="submit" value="提交"></input>
	</form>
	
	<form action="${pageContext.request.contextPath}/session/model" method="post">
		username:<input type="text" name="username"/><br/>
		age:<input type="text" name="age"/>
		<input type="submit" value="提交"></input>
	</form>
</body>
</html>