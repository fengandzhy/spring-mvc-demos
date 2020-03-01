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
	
	<form action="${pageContext.request.contextPath}/upload/test" method="post" enctype="multipart/form-data">
		文件说明：<input type="text" name="mark"/><br/>
		上传文件:<input type="file" name="file"/><br/>		
		<input type="submit" value="提交"></input>
	</form>
	
</body>
</html>