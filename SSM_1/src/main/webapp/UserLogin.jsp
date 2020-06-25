<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="">点击验证</a>
<%--name属性对应javabean的属性 应用外部bean --%>
<%--
<form action="LoginCl/saveAccount" method="post">
请输入您的名字:<input name="name"><br>
请输入您的密码:<input name="pwd"><br>
请输入您的金额:<input name="monery"><br>
用户的bean的名字：<input name="User.name"><br>
用户bean的年龄：<input name="User.age"><br>
<input type="submit" value="登陆">
</form>
 --%>
 <%--
 <form action="LoginCl/saveAccount" method="post">
请输入您的名字:<input name="name"><br>
请输入您的密码:<input name="pwd"><br>
请输入您的金额:<input name="monery"><br>
用户的bean的名字：<input name="list[0].name"><br>
用户bean的年龄：<input name="list[0].age"><br>
用户的bean的名字：<input name="map['one'].name"><br>
用户bean的年龄：<input name="map['one'].age"><br>
<input type="submit" value="登陆">
</form>--%>

<%-- <form action="LoginCl/saveUser" method="post">
请输入您的名字:<input name="name"><br>
年龄<input name="age"><br>
生日<input name="date"><br>
<input type="submit" value="登陆"><br>
</form>
<a href="LoginCl/testServlet"> 点击获取servlet</a>--%>
<%--<form action="LoginCl/saveUser" method="post">
请输入您的名字:<input name="name"><br>
年龄<input name="age"><br>
生日<input name="date"><br>
<input type="submit" value="登陆"><br>
</form>
<a href="LoginCl/testServlet"> 点击获取servlet</a> --%>
<%--
测试RequestParam
 --%>
 <%--<a href="LoginCl/testRequestParam?name=jiao">测试RequestParam</a> --%>
 <%--测试请求体 --%>
 <%-- <form action="LoginCl/testRequestBody" method="post">
请输入您的名字:<input name="name"><br>
年龄<input name="age"><br>
<input type="submit" value="登陆"><br>
</form>--%>
<%--测试PathVariable--%>
<%--<a href="LoginCl/testPathVariable/10">restful风格</a> --%>
<%-- <form action="LoginCl/testModelAttribute" method="post">
请输入您的名字:<input name="name"><br>
年龄<input name="age"><br>
<input type="submit" value="登陆"><br>
</form>
 --%>
 <a href="LoginCl/testSessionAttribute">测试testSessionAttribute</a>
 <a href="LoginCl/setSessionAttribute">测试setSessionAttribute</a>
 <a href="LoginCl/getSessionAttribute">测试getSessionAttribute</a>
</body>
</html>