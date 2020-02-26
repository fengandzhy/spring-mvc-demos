<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增用户</title>
</head>
<body>
	<h4>新增用户</h4>
	<form action="${pageContext.request.contextPath}/initbinder/test" method="post">		
		产品名：<input type="text" name="prodName" />
		产品日期：<input type="text" name="prodDate" />
		价格：<input type="text" name="prodPrice" />
		<input type="submit" value="添加商品"/>
	</form>
</body>
</html>