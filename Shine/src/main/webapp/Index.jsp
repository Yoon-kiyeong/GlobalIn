<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="login-box">
		<h2>Login</h2>
		<form method="post" action="Login">
			<div class="user-box">
				<input type="text" name="ID" required=""> <label>Username</label>
			</div>
			<div class="user-box">

				<input type="password" name="password" required=""> <label>Password</label>
			</div>
			<input type="submit" id="submit" value="login">
		</form>
	</div>

</body>
</html>