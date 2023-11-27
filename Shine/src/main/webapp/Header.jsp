<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<style>
.header-right{
	float:right;
}

.button {
	background-color: #3D9970;
	color:white;
	border: 2px solid #3D9970;
	border-radius:15px;
	padding:13px 13px;
	font-size:16px;
}

.button:hover{
	background-color:white;
	color:#3D9970;
	transition-duration: 0.3s;
	border:2px solid #3D9970;
	cursor:pointer;
}
</style>
</head>
<body>
<a href="Main.jsp"><img src="Logo.png"></a>
<div class="header-right"> 
님
<button class="button">로그아웃</button>
</div>
</body>
</html>