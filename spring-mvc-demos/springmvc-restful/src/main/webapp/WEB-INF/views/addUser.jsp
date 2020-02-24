<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增用户</title>
</head>
<body>
	<h4>新增用户</h4>
	<form:form action="${pageContext.request.contextPath}/restfultest/user" method="post">
		<!-- path属性就相当于普通form的name和 id 的组和,必须和类中属性名字一致-->
		用户名：<form:input path="username" />
		密码：<form:input path="password"/>
		所属部门：<form:select path="dpt.id" itemValue="id" itemLabel="dptName" items="${dpts}"></form:select>
		<input type="submit" value="添加用户"/>
	</form:form>
</body>
</html>