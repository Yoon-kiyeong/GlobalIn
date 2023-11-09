<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%
/*
	쿠키는 웹 브라우저가 보관하고 있는 데이터로써 웹 서버에 요청을 보낼 때 함께 전송한다.
	
	쿠키의 동작
	1. 쿠키 생성
		- 쿠키를 먼저 생성한다.
		- 웹 서버에서 쿠키를 생성하고, 자바스크립트에서 사용자 측에서 쿠키를 생성하기도 함
	2. 쿠키 저장
		- 응답 데이터에 포함된 쿠키를 쿠키 저장소에 보관함
	3. 쿠키 전송
		- 한번 저장된 쿠키를 매번 요청이 있을 때마다 웹 서버에 전송함
*/
	Cookie cookie = new Cookie("name", URLEncoder.encode("test","UTF-8"));
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
<%=cookie.getName() %> 쿠키의 값 =<%=cookie.getValue() %>
</body>
</html>