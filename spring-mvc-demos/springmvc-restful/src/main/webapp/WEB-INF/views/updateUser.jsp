<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改用户</title>
</head>
<body>
	<h4>修改表单标签</h4>
	<form:form action="${pageContext.request.contextPath}/restfultest/users" method="put" modelAttribute="user">
		<!-- path属性就相当于普通form的name和 id 的组和,必须和类中属性名字一致-->
		<form:hidden path="id" />
		<form:input path="password"/>
		<form:select path="dpt.id" itemValue="id" itemLabel="dptName" items="${dpts}"></form:select>
		<input type="submit" value="修改"/>
	</form:form>
</body>
</html>