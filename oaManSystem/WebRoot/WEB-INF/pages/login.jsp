<%@ page language="java" isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>登录</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<style type="text/css">
#msg {
	color: red;
}

label {
	width: 60px;
	text-align: right;
	float: left;
}

input {
	width: 100px;
}

p {
	margin: 0;
}
</style>
	</head>
	<body>

		<form action="login.action" method="post">
			<p>
				<label for="username">
					用户名
				</label>
				<input type="text" id="username" name="userInfo.userLoginname" />
			</p>
			<p>
				<label for="password">
					密码
				</label>
				<input type="password" id="password" name="userInfo.userPassword" />
			</p>
			<input type="submit" value="登录" />
		</form>
		<s:actionerror />
	</body>
</html>
