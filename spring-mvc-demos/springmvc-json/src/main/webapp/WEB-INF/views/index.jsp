<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery/jquery-1.12.4.js"></script>
<script type="text/javascript" >
$(function(){
	$(".del").click(function(){
		alert();
		
		var href = $(this).attr('href');
		$.post(href,{},function(data){
			console.log(data);
		});
		
		
		return false;
	});
});
</script>
</head>
<body>
	<a href="${pageContext.request.contextPath}/json/test">查询用户</a>
	<a class="del" href="${pageContext.request.contextPath}/json/test2">查询用户2</a>
</body>
</html>