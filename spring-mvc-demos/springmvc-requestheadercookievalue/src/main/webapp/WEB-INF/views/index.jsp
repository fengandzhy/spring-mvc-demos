<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/requestmapping/testProduces" method="post">
		<input type="text" name="username"/>
		<input type="submit" value="提交"></input>
	</form>
	
	<form action="${pageContext.request.contextPath}/requestparam/testParams" method="post">
		username:<input type="text" name="username"/><br/>
		age:<input type="text" name="age"/>
		<input type="submit" value="提交"></input>
	</form>
</body>
</html>