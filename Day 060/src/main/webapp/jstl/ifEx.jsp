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
<c:if test="${3 > 4 }">
이 내용은 화면에 나타나지 않습니다
</c:if>

<c:if test="${param.type eq'guest' }">
홈페이지 방문을 환영합니다.<br>
회원가입을 하시기 바랍니다
</c:if>

<c:if test="${param.type eq'member' }">
회원님의 방문을 환영합니다.<br>
즐거운 시간 되십시오
</c:if>
</body>
</html>