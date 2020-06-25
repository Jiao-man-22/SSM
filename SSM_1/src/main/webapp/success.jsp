<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>success</title>
</head>
<body>
<!-- 使用相对路径 -->
<%--<a href="hello">springmvc程序入门</a> --%>
<h2>RequestMappin测试成功</h2>
${requestScope.msg}
${SessionScope}
</body>
</html>