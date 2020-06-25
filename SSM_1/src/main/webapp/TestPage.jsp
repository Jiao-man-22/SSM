<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>TestPage</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
//页面加载绑点击事件
$(function(){
	$("#btn").click(function(){
		//alert("你好");
		$.ajax({
			//编写json属性和值
			url:"LoginCl/testAjax",
			contentType:"application/json;charset=UTF-8",
			data:'{"name":"haha","age":30}',
			dataType:"json",
			type:"post",
			success:function(data){
				alert(data)
				alert(data.name)
			
			}
		})
		
	});
})
</script>
</head>
<body>
<button id="btn">点击发送ajax</button>
<a href="Exeception/testExeception">点击testExcpetion</a>
<a href="Exeception/testExeception">点击testExcpetion</a>
<a href="AccountController/findAll">spring整合springmvc</a>
</body>
</html>