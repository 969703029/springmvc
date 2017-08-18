<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="registers/regist" method="get">
	
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName"/></td>
			</tr>
			
			<tr>
				<td>出生日期：</td>
				<td><input type="text" name="birthday"/></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" name="age"/></td>
			</tr>
			
			<tr>
				<td>个人收入：</td>
				<td><input type="text" name="income"/></td>
			</tr>
			
			<tr>
				<td>是否婚配：</td>
				<td>
					<input type="radio" name="marry" value="true" checked="checked"/>未婚
					<input type="radio" name="marry" value="false"/>已婚
				</td>
			</tr>
			
			<tr>
				<td>兴趣爱好：</td>
				<td>
					<input type="checkbox" name="interest" value="0"/>中日韩文化交流
					<input type="checkbox" name="interest" value="1"/>洗脚，按摩
					<input type="checkbox" name="interest" value="2"/>打麻将，斗地主
					<input type="checkbox" name="interest" value="3"/>撸代码
				</td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="注册"/></td>
			</tr>
			
		</table>
	</form>





</body>
</html>