<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Login</title>
</head>
<body>
	<form action="#" method="post">
		<table width="300" border="1">
			<tr>
				<td align="center" colspan="2">회원 로그인</td>
			</tr>
			
			<tr>
				<td width="100" align="right"> 아이디</td>
				<td width="200">&nbsp;&nbsp;
					<input type="password" name="pass" size="20">
				</td>
			</tr>
			
			<tr>
				<td width="100" align="right"> 비밀번호</td>
				<td width="200">&nbsp;&nbsp;
					<input type="password" name="pass" size="20">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인">&nbsp;&nbsp;
					<input type="button" value="회원가입" onclick="javascript:window.location='regform.jsp'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>