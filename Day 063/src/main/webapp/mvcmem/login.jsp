<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="loginID" value="${sessionScope.loginID }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Login</title>
</head>
<body>
<c:choose>
<c:when test="${loginID ne null }">
	<table width="300" border="1">
		<tr>
			<td colspan="3" align="center"><c:out value="${loginID }"/>님 환영합니다</td>
		</tr>
		<tr>
			<td width="100" align="center">
				<a href="member.mdo?cmd=modifyForm">정보수정</a>
			</td>
			
			<td width="100" align="center">
				<a href="member.mdo?cmd=deleteForm">회원탈퇴</a>
			</td>
			<td width="100" align="center">
				<a href="member.mdo?cmd=logout">로그아웃</a>
			</td>
		
		</tr>
	</table>
</c:when>
<c:otherwise >
<c:if test="${requestScope.check eq 0 }">
	<script type="text/javascript">
		alert("비밀번호가 틀렸습니다");
	</script>
</c:if>

<c:if test="${requestScope.check eq -1 }">
	<script type="text/javascript">
		alert("아이디가 존재하지 않습니다");
	</script>
</c:if>
	<form action="member.mdo?cmd=loginProc" method="post">
		<table width="300" border="1">
			<tr>
				<td align="center" colspan="2">회원 로그인</td>
			</tr>

			<tr>
				<td width="100" align="right">아이디</td>
				<td width="200">&nbsp;&nbsp; 
					<input type="text" name="id" size="20">
				</td>
			</tr>

			<tr>
				<td width="100" align="right">비밀번호</td>
				<td width="200">&nbsp;&nbsp; <input type="password" name="pass"
					size="20">
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인">&nbsp;&nbsp;
					<input type="button" value="회원가입"
					onclick="javascript:window.location='member.mdo?cmd=regform'"></td>
			</tr>
		</table>
	</form>
</c:otherwise>
</c:choose>
</body>
</html>