<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forTokens var="car" items="Sprinter Trueno AE86,RX-7 Savanna FC3S,Lancer Evolution III, RX-7 Efini FD3S" delims=",">
자동차 이름 : <c:out value="${car }"></c:out><br>
</c:forTokens>
<br>
<h3>콤마와 점을 구분자로</h3>
<br>
<c:forTokens var="token" items="Red, Orange, Yellow, Green, Blue, Navy, Purple" delims=",.">
${token }<br>
</c:forTokens>
</body>
</html>