<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>测试首页</title>
</head>
<body>
    <h1>欢迎来到spring mvc 的世界</h1>
    <a href="${s:mvcUrl('getNames').arg(0,'3').arg(1,'5').build()}">测试一下</a>
</body>
</html>
