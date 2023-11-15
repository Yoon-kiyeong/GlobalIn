<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.memberone.*"%>
<jsp:useBean id="dao" class="com.memberone.StudentDAO" />
<%
	String id = (String)session.getAttribute("loginID");
	String pass = request.getParameter("pass");
	
	int check = dao.deleteMember(id, pass);
	
	if (check == 1) {
		session.invalidate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Refresh" content="3;url=login.jsp">
<title>회원탈퇴</title>
</head>
<body>
	<div align="center">
		<font size="7" face="궁서체"> 회원정보가 삭제되었습니다. </font>
	</div>
	<%} else { %>
	<script type="text/javascript">
	alert("비밀번호가 틀렸습니다");
	history.go(-1);
	</script>

	<%} %>
</body>
</html>