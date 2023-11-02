<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.login.LoginDBBean" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	LoginDBBean manager = LoginDBBean.getInstance();
	
	int check = manager.userCheck(id, passwd);
	
	if(check == 1) {
		Cookie cookie = new Cookie("memId",id);
		cookie.setMaxAge(20 * 60);
		response.addCookie(cookie);
		response.sendRedirect("cookieLoginConfirm.jsp");
	} else if(check == 0){
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
alert("비밀번호가 일치하지 않습니다");
history.go(-1);
</script>
<%} else {%>
<script type="text/javascript">
alert("아이디가 존재하지 않습니다");
history.go(-1);
</script>
<%} %>
</body>
</html>