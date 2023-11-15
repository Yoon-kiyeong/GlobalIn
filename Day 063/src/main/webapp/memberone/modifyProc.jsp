<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.memberone.*" %>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="dao" class="com.memberone.StudentDAO" />
<jsp:useBean id="vo" class="com.memberone.StudentVO">
<jsp:setProperty name="vo" property="*"/>
</jsp:useBean>
<%
	String loginID = (String)session.getAttribute("loginID");
	vo.setId(loginID);
	dao.updateMemeber(vo);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Refresh" content="3;url=login.jsp">
<title>회원정보 수정 처리</title>
</head>
<body>
<div>
<font size="7">입력하신 내용대로 <b>회원정보가 수정 되었습니다</b><br>
3초 후에 Login Page로 이동합니다
</font>
</div>
</body>
</html>