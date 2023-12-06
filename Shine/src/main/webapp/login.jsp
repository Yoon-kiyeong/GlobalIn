<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.login-box {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 400px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: #3D9970;
	box-sizing: border-box;
	box-shadow: 0 15px 25px #3D9970;
	border-radius: 10px;
}

.login-box h2 {
	margin: 0 0 30px;
	padding: 0;
	color: #fff;
	text-align: center;
}

.login-box .user-box {
	position: relative;
}

.login-box .user-box input {
	width: 100%;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	margin-bottom: 30px;
	border: none;
	border-bottom: 1px solid #fff;
	outline: none;
	background: transparent;
}

.login-box .user-box label {
	position: absolute;
	top: 0;
	left: 0;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	pointer-events: none;
	transition: .5s;
}

.login-box .user-box input:focus ~ label, .login-box .user-box input:valid 
	 ~ label {
	top: -20px;
	color: #fff;
	left: 0;
	font-size: 12px;
}

.login-box form #submit {
	position: relative;
	display: inline-block;
	padding: 10px 20px;
	color: #3D9970;
	font-size: 16px;
	text-decoration: none;
	text-transform: uppercase;
	overflow: hidden;
	transition: .5s;
	margin-top: 40px;
	letter-spacing: 4px;
	border-color: #fff;
}

.login-box #submit:hover {
	background: #3D9970;
	color: #fff;
	border-radius: 5px;
}
</style>
</head>
<body>
	<div class="login-box">
		<h2>Login</h2>
		<form method="post" action="login.do">
			<div class="user-box">
				<input type="text" name="id" required=""><label>Username</label>
			</div>
			<div class="user-box">
				<input type="password" name="password" required=""><label>Password</label>
			</div>
			<input type="submit" id="submit" value="login">
		</form>
	</div>
</body>
</html>