<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<%
Date time = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션 ID :
	<%=session.getId()%><br>

	<%
	// 세션은 웹 서버 쪽의 웹 컨테이너에 상태를 유지하기 위한 정보를 저장한다
	time.setTime(session.getCreationTime());
	//1970년 1월 1일 이후 시간을 의미하며 단위는 1/1000초임
	%>
	세션 생성 시간 :
	<%=formatter.format(time)%><br>

	<%
	time.setTime(session.getLastAccessedTime());
	// 웹 브라우저가 세션에 가장 마지막에 접근한 시간
	%>
	최근 접근 시간 :
	<%=formatter.format(time)%>
	<br>

</body>
</html>