<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="view/color.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션을 이용한 로그인</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="<%=bodyback_c %>">
	<form action="sessionMemberLoginOk.jsp" method="post">
		<table width="300" border="1" align="center">
			<tr>
				<td colspan="2" bgcolor="<%=title_c%>">
					<div align="center">로그인</div>
				</td>
			</tr>

			<tr>
				<td width="100" bgcolor="<%=title_c%>">아이디</td>
				<td width="200" bgcolor="<%=value_c %>">
					<input type="text" name="id">
			</tr>
			
			<tr>
				<td width="100" bgcolor="<%=title_c %>">비밀번호</td>
				<td width="200" bgcolor="<%=value_c %>">
					<input type="password" name="passwd">
			</tr>
						
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인">
					&nbsp;&nbsp;&nbsp;
					<input type="reset" value="다시 작성">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>