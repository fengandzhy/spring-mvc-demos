<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form:form action="${pageContext.request.contextPath}/validator/valid" method="post">
		<!-- path属性就相当于普通form的name和 id 的组和,必须和类中属性名字一致-->
		用户名：<form:input path="username" />
		密码：<form:input path="password"/>
		生日：<form:input path="birthday"/>
		邮箱：<form:input path="email"/>
		身高：<form:input path="height"/>		
		<input type="submit" value="添加用户"/>
	</form:form>
	
	<%-- <a href="${s:mvcUrl('RMC#nameTest').build()}">test name</a> --%>
	<%-- <a href="${s:mvcUrl('yyyy').build()}">test name</a> --%>
</body>
</html>