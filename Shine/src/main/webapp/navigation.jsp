<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/darkmode.css" type="text/css">
<link rel="stylesheet" href="css/navigation.css" type="text/css">
<script type="text/javascript" src="js/darkmode.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="sidenav">
		<b><a href="myPage.jsp">마이 페이지</a></b>
		<button class="dropdown-btn"><b>근태관리</b></button>
		<div class="dropdown-container">
		<ul>
			<li><b><a href="#">일간근태관리</a></b></li>
			<li><b><a href="#">주간근태관리</a></b></li>
			<li><b><a href="#">월간근태관리</a></b></li>
			<li><b><a href="#">연차현황</a></b></li>
		</ul>
	</div>
	<b><a href="calender.jsp">캘린더</a></b>
	<b><a href="approval.jsp">전자결재</a></b>
	<b><a href="notice.jsp">공지사항</a></b>
	<b><a href="address.jsp">조직도</a></b>
	<div class="darkmode_div">
		<b>다크모드</b><input role="switch" type="checkbox" class="darkmode" onclick="darkMode()">
	</div>
	</div>
	
	<script>
	// dropdown script
	var dropdown = document.getElementsByClassName("dropdown-btn");
	var i;
	
	for (i = 0; i < dropdown.length; i++) {
		dropdown[i].addEventListener("click",function() {
			this.classList.toggle("active");
			var dropdownContent = this.nextElementSibling;
			if(dropdownContent.style.display === "block") {
				dropdownContent.style.display = "none";
			} else {
				dropdownContent.style.display = "block";
			}
		});
	}
	
	
	</script>
</body>
</html>