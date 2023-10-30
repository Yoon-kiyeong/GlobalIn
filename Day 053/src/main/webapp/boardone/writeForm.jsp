<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file ="view/color.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Board</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="script/js"></script>
</head>
<body bgcolor="<%=bodyback_c %>">
<div align="center">
<b>글 쓰기</b>
</div><br>
<form action="" method="post" name="writeForm" onsubmit="return writeSave()">
<table width="400" border="1" cellpadding="0" cellspacing="0" align="center" bgcolor="<%=bodyback_c%>">
	<tr>
		<td align="right" colspan="2" bgcolor="<%=value_c%>">
			<a href="list.jsp">글 목록</a>
		</td>
	</tr>
	
	<tr>
		<td width="70" bgcolor="<%=value_c%>" align="center">이름</td>
		<td width="330">
			<input type="text" size="12" maxlength="12" name="writer">
		</td>
	</tr>
	
	<tr>
		<td width="70" bgcolor="<%=value_c%>" align="center">이메일</td>
		<td width="330">
			<input type="text" size="30" maxlength="30" name="email">
		</td>
	</tr>
	
	<tr>
		<td width="70" bgcolor="<%=value_c%>" align="center">제목</td>
		<td width="330">
			<input type="text" size="50" maxlength="50" name="subject">
		</td>
	</tr>
	
	<tr>
		<td width="70" bgcolor="<%=value_c%>" align="center">내용</td>
		<td width="330">
			<textarea rows="15" cols="50" name="content"></textarea>
		</td>
	</tr>
	
	<tr>
		<td width="70" bgcolor="<%=value_c%>" align="center">비밀번호</td>
		<td width="330">
			<input type="password" size="10" maxlength="10" name="pass">
		</td>
	</tr>
	
	<tr>
		<td colspan="2" bgcolor="<%=value_c %>" align="center">
			<input type="submit" value="글쓰기">
			<input type="reset" value="다시 작성">
			<input type="button" value="목록" onclick="window.location='list.jsp'">
		</td>
	</tr>
</table>
</form>
</body>
</html>