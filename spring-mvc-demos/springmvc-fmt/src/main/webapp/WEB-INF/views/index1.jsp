<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="${pageContext.request.contextPath}/datamodel/modelandview" method="post">		
		username:<input type="text" name="username" value=""/><br/>
		password:<input type="password" name="password"/>
		<input type="submit" value="提交"></input>
	</form>
	
	
</body>
</html>