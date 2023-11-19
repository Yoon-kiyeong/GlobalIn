<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/nav.css" type="text/css">
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
		
		<div class="darkmode">
			다크모드
			<input type="checkbox" id="toggle" class="theme-toggler_checkbox" checked />
			<span aria-hidden="true" class="theme-toggler__switch"></span>
		</div>
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