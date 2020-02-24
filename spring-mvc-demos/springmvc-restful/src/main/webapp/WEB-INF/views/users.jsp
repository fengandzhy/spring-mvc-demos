<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery/jquery-1.12.4.js"></script>
<script type="text/javascript" >
	$(function(){
		$(".del").click(function(){
			alert("abcd");
			debugger;
			//var href = this.href;
			var href = $(this).attr('href');
			console.log(href);
			var delform = $('#delform');
			delform.attr('action', href);
			delform.submit();
			
			return false;
		});
	});
</script>
</head>
<body>
	<form id="delform" action="" method="post">
		<input type="hidden" name="_method" value="delete">
	</form>
	<h4>显示所有用户的信息</h4>
	<table width="80%" border="1" cellpadding="0" cellspacing="0" >
		<tr>
			<td>用户ID</td>
			<td>用户名</td>
			<td>用户密码</td>
			<td>部门</td>
			<td></td>
		</tr>
		<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.dpt.dptName}</td>
			<td><a href="${pageContext.request.contextPath}/restfultest/users/${user.id}">修改</a>
			&nbsp;<a class="del" href="${pageContext.request.contextPath}/restfultest/user/${user.id}">删除</a></td>
		</tr>
		</c:forEach>		
	</table>
</body>
</html>