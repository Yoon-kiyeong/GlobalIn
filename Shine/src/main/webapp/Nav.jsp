<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/Darkmode.css" type="text/css">
<style>
body {
color:#3D9970;
}
button {
background-color:white;
}
.sidenav {
	border: 2px solid #3D9970;
	border-radius: 20px;
	width: 200px;
	position: fixed;
	z-index: 1;
	top: 11%;
	height: 70%;
	left: 10px;
	overflow-x: hidden;
	padding-top: 20px;
}

.sidenav a{
	padding: 10px 0 10px 0;
	text-decoration: none;
	font-size: 20px;
	color: #3D9970;
	display: block;
	border: none;
	width: 100%;
	text-align: center;
	cursor: pointer;
	outline: none;
}

.dropdown-btn {
 	padding: 10px 0 10px 0;
	text-decoration: none;
	font-size: 20px;
	color: #3D9970;
	display: block;
	border: none;
	width: 100%;
	text-align: center;
	cursor: pointer;
	outline: none;
}
 
.sidenav a:hover, .dropdown-btn:hover {
	background-color: #3D9970;
	color: white;
}

.active {
	background-color: #3D9970;
	color: white;
}

.dropdown-container {
	display: none;
	padding-left: 8px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div class="sidenav">
		<b><a href="#">마이 페이지</a></b>
		<button class="dropdown-btn"><b>근태관리</b></button>
		<div class="dropdown-container">
			<ul >
				<li><b><a href="#">일간근태관리</a></b></li>
				<li><b><a href="#">주간근태관리</a></b></li>
				<li><b><a href="#">월간근태관리</a></b></li>
				<li><b><a href="#">연차현황</a></b></li>
			</ul>
		</div>
		<b><a href="#">일정관리</a></b> 
		<b><a href="#">전자결재</a></b> 
		<b><a href="#">공지사항</a></b> 
		<b><a href="#">주소록</a></b>	 
	<div class="darkmode_div">
			<b>다크모드</b><input role="switch" type="checkbox" class="darkmode" onclick="darkMode()">
		</div>
	</div>
	<script>
	
	//dropdown Script
	var dropdown = document.getElementsByClassName("dropdown-btn");
	var i;

	for (i = 0; i < dropdown.length; i++) {
	  dropdown[i].addEventListener("click", function() {
	    this.classList.toggle("active");
	    var dropdownContent = this.nextElementSibling;
	    if (dropdownContent.style.display === "block") {
	      dropdownContent.style.display = "none";
	    } else {
	      dropdownContent.style.display = "block";
	    }
	  });
	}

	
	function darkMode(){
		var dropdown = document.querySelector(".dropdown-btn");
		var element = document.body;
		element.classList.toggle('on');
		dropdown.classList.toggle('on');
	}
	
	
</script>
</body>
</html>