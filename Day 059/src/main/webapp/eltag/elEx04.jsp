<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%
	request.setAttribute("name","홍길동");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Object</title>
</head>
<body>
요청 URI : ${pageContext.request.requestURI} <br><br>
request의 name 속성 : ${requestScope.name }<br>
code 파라미터 : ${param.code }<br>
</body>
</html>