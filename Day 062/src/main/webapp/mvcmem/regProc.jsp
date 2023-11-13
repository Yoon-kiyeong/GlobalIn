<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.mvcmem.model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/script.js"></script>
<title>회원가입 확인</title>
</head>
<body bgcolor="tomato">
	<c:set var="flag" value="${flag }" />
	<br>
	<div align="center">
		<c:choose>
			<c:when test="${flag }">
				<b>회원 가입을 진심으로 축하드립니다</b>
				<a href='member.mdo?cmd=login'>로그인</a>
			</c:when>
			<c:otherwise>
				<b>회원 가입에 성공하지 못했습니다. 다시 입력 바랍니다</b>
				<a href='member.mdo?cmd=regForm'>다시 가입</a>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>
