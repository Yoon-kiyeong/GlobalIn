<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String memberid = (String)session.getAttribute("MEMBERID");
	String name = (String)session.getAttribute("NAME");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션에 정보를 가져옴<br>
Member ID : <%=memberid %><br>
Name : <%=name %>
</body>
</html>