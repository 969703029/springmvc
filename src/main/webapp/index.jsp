<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery-3.2.1.min.js" charset="utf-8"></script>
<script type="text/javascript" src="static/js/index.js" charset="utf-8"></script>


</head>
<body>
	
	<button id="btn">点击</button>
	<button id="btn02">rest</button>
	
	<br/>
	
	<form action="sys/login09" method="post">
		<table>
			<tr>
				<td>登录名：</td>
				<td><input type="text" name="loginName"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
				<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>

</body>
</html>