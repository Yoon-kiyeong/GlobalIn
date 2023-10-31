<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.boardone.BoardDAO" %>
<%@ page import="com.boardone.BoardVO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ include file="view/color.jsp" %>
<%!
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
int count = 0;
int number = 0;
List<BoardVO> articleList = null;

BoardDAO dbPro = BoardDAO.getInstance();
count = dbPro.getArticleCount();

if(count > 0) {
	articleList = dbPro.getArticles();	
}
number = count;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="<%=bodyback_c %>">
<div align="center"><b>글 목록(전체 글 : <%=count %>)</b>
	<table width="700">
		<tr>
			<td align="right" bgcolor="<%=value_c %>">
				<a href="writeForm.jsp">글쓰기</a>
			</td>
		</tr>
	</table>

<%
	if(count == 0) {
%>
<table width="700" border="1" cellpadding="1" cellspacing="0">
	<tr>
		<td>
			게시판에 저장된 글이 없습니다
		</td>
	</tr>
</table>
<%} else {%>
	<table width="700" border="1" cellpadding="1" cellspacing="0" align="center">
		<tr height="30" bgcolor="<%=value_c %>">
			<td align="center" width="50">번호</td>
			<td align="center" width="250">제목</td>
			<td align="center" width="150">작성자</td>
			<td align="center" width="150">작성일</td>
			<td align="center" width="50">조회</td>
			<td align="center" width="100">IP</td>
		</tr>

	<%
		for(int i = 0; i < articleList.size(); i++) {
			BoardVO article = (BoardVO)articleList.get(i);
		
	%>	
		<tr height="30">
			<td width="50" align="center"><%=number-- %> </td>
			<td width="250">
				<a href="content.jsp?num=<%=article.getNum()%>&pageNum=1">
				<%=article.getSubject() %></a>
				<%if(article.getReadcount() >= 5) { %>
				<img src="img/hot.gif" border="0" height="16">
				<%} %>
			</td>			
			<td width="150" align="center">
				<a href="mailto:<%=article.getEmail() %>">
				<%=article.getWriter() %></a>
			</td>
			<td width="150" align="center">
				<%=sdf.format(article.getRegdate()) %>
			</td>
			<td width="50" align="center">
				<%=article.getReadcount() %>
			</td>
			<td width="100" align="center">
				<%=article.getIp() %>
			</td>
		</tr>	
		<%} %>
	</table>
<%} %>
</div>
</body>
</html>