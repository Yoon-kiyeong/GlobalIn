<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.boardtwo.BoardDAO" %>
<%@ page import="com.boardtwo.BoardVO" %>
<%@ page import="java.sql.Timestamp" %>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="article" class="com.boardtwo.BoardVO">
	<jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
	String pageNum = request.getParameter("pageNum");
	BoardDAO dbPro = BoardDAO.getInstance();
	int check = dbPro.updateArticle(article);
	if(check == 1) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Refresh" content="0;url=list.jsp?PageNum=<%=pageNum%>">
<title>Insert title here</title>
</head>
<body>
<%} else {// 0일 경우 (비밀번호 오류일 경우) %>
<script type="text/javascript">
	alert("비밀번호가 맞지 않습니다");
	history.go(-1);
</script>
<%} %>
</body>
</html>