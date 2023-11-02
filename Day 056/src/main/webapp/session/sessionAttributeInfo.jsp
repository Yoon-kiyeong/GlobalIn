<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
session.setAttribute("MEMBERID","test");
session.setAttribute("NAME","테스트");
session.setMaxInactiveInterval(60);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션에 정보를 저장 하였습니다
</body>
</html>