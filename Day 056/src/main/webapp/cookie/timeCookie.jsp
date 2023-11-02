<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
	Cookie cookie = new Cookie("hour","1time");
	cookie.setMaxAge(60); // 60초 = 1분
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
유효시간이 2분인 hour 쿠키생성
</body>
</html>