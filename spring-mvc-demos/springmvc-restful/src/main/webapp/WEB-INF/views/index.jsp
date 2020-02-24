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
	<form action="${pageContext.request.contextPath}/restfultest/testPut" method="post">
		id:<input type="text" name="id"/><br/>
		username:<input type="text" name="username"/><br/>
		password:<input type="password" name="password"/><br/>
		email:<input type="text" name="email"/><br/>
		<input type="hidden" name="_method" value="put">
		<input type="submit" value="提交"></input>
	</form>
	
	<%-- <a href="${s:mvcUrl('RMC#nameTest').build()}">test name</a> --%>
	<%-- <a href="${s:mvcUrl('yyyy').build()}">test name</a> --%>
</body>
</html>