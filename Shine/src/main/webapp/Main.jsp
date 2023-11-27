<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" type="text/css">
<script	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"	charset="utf-8"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/easy-pie-chart/2.1.6/jquery.easypiechart.min.js" charset="utf-8"></script>
<title>Insert title here</title>
<style>
.MainContainer {
	position: fixed;
	width: 1000px;
	height: 250px;
	left: 30%;
	border: 2px solid #3D9970;
	border-radius: 13px;
}

.main2 {
	top: 40%;
	height: 200px;
}

.main3 {
	top: 65%;
	height: 150px;
}

.box {
	width: 100%;
}

.box h2 {
	position: relative;
	top: 10px;
	left: 60px;
}

.box .chart {
	position: relative;
	width: 100%;
	height: 100%;
	line-height: 160px; 
	height 160px;
	color: #fff;
}

.box canvas {
	color: #3D9970;
	position: absolute;
	top: 0;
	left: 20px;
	width: 15%;
}
</style>
<jsp:include page="Header.jsp" />
<jsp:include page="Nav.jsp" />
</head>
<body>
	<div class=main>
		<div class="MainContainer main1">
			<a href="#"><b>근태관리</b></a>
			<div class="box">
				<h2>00:00</h2>
				<div class="chart"></div>
			</div>
			<div class="commute">
			<b>00:00</b>
			<button class="inButton">출근</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<b>00:00</b>
			<button class="outButton">퇴근</button>			
			</div>
		</div>
		<div class="MainContainer main2">
			<a href="#"><b>공지게시판</b></a>
		</div>
		<div class="MainContainer main3">
			<a href="#"><b>전자결재</b></a>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			$('.chart').easyPieChart({
				size : 160,
				barColor : "#36e617",
				scaleLength : 0,
				lineWidth : 15,
				trackColor : "#525151",
				lineCap : "circle",
				animate : 2000,
			});
		});
	</script>
</body>
</html>