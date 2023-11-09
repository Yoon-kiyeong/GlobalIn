<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: "Lato", sans-serif;
}

.sidenav {
	height: 100%;
	width: 200px;
	position: fixed;
	z-index: 1;
	top: 10%;
	height: 50%;
	left: 0;
	background-color: #3D9970;;
	overflow-x: hidden;
	padding-top: 20px;
}

.sidenav a, .dropdown-btn {
	padding: 6px 8px 6px 16px;
	text-decoration: none;
	font-size: 20px;
	color: #fff;
	display: block;
	border: none;
	background: none;
	width: 100%;
	text-align: left;
	cursor: pointer;
	outline: none;
}

.sidenav a:hover, .dropdown-btn:hover {
	background-color: #fff;
	color: #3D9970;
}

.active {
	background-color: #3D9970;;
	color: #fff;
}

.dropdown-container {
	display: none;
	background: #3D9970;
	padding-left: 8px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div class="sidenav">
		<a href="#">마이 페이지</a>
		<button class="dropdown-btn">근태관리</button>
		<div class="dropdown-container">
			<ul>
				<li><a href="#">일간근태관리</a></li>
				<li><a href="#">주간근태관리</a></li>
				<li><a href="#">월간근태관리</a></li>
				<li><a href="#">연차현황</a></li>
			</ul>
		</div>
		<a href="#">일정관리</a> <a href="#">전자결재</a> <a href="#">공지사항</a> <a
			href="#">주소록</a>
	</div>
	<script>
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
</script>
</body>
</html>