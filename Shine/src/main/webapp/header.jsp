<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/header.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<title>Insert title here</title>
<style>
.logout {
	background-color: #3D9970;
	color: white;
	border: 2px solid #3D9970;
	border-radius: 15px;
	padding: 13px 15px;
	font-size: 16px;
}

.logout:hover {
	background-color: white;
	color: #3D9970;
	transition-duration: 0.3s;
	border: 2px solid #3D9970;
	cursor: pointer;
}
</style>
</head>
<body>
	<a href="main.jsp"><img class="logo" src="Logo1 (2).png"></a>
	<div class="header-right">
		${userName}님
		<button class="logout" onclick="location.href='/logout.jsp';">로그아웃</button>
	</div>
</body>
</html>