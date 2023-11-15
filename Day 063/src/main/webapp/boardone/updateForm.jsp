<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.boardtwo.BoardDAO" %>
<%@ page import="com.boardtwo.BoardVO" %>
<%@ include file="view/color.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<script type="text/javascript" src="script.js"></script>
</head>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String pageNum = request.getParameter("pageNum");
	
	try {
		BoardDAO dbPro = BoardDAO.getInstance();
		BoardVO article = dbPro.updateGetArticle(num);
%>
<body bgcolor="<%=bodyback_c %>">
<div align="center"><b>글 수정</b>
<form action="updateProc.jsp?pageNum=<%=pageNum%>"onsubmit="return writeSave()" method="post" name="writeForm">
	<table width="400" border="1" cellspacing="0" cellpadding="0" bgcolor="<%=value_c%>" align="center">
		<tr>
			<td width="70" bgcolor="<%=value_c%>" align="center">이름</td>
			<td width="330" align="left">
				<input type="text" size="10" maxlength="10" name="writer" value="<%=article.getWriter() %>">
				<input type="hidden" name="num" value="<%=article.getNum() %>">
			</td>
		</tr>
		
		<tr>
			<td width="70" bgcolor="<%=value_c%>" align="center">제목</td>
			<td width="330" align="left">
				<input type="text" size="50" maxlength="50" name="subject" value="<%=article.getSubject() %>">
				<input type="hidden" name="num" value="<%=article.getNum() %>">
			</td>
		</tr>
		
		<tr>
			<td width="70" bgcolor="<%=value_c%>" align="center">Email</td>
			<td width="330" align="left">
				<input type="text" size="50" maxlength="50" name="email" value="<%=article.getEmail() %>">
				<input type="hidden" name="num" value="<%=article.getNum() %>">
			</td>
		</tr>
		
		<tr>
			<td width="70" bgcolor="<%=value_c%>" align="center">내용</td>
			<td width="330" align="left">
				<textarea rows="15" cols="50" name="content"><%=article.getContent()%></textarea>
			</td>
		</tr>
		
		<tr>
			<td width="70" bgcolor="<%=value_c%>" align="center">비밀번호</td>
			<td width="330" align="left">
				<input type="password" size="12" maxlength="12" name="pass">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" bgcolor="<%=value_c%>" align="center">
			<input type="submit" value="글 수정">
			<input type="reset" value="다시작성">
			<input type="button" value="목록보기" onclick="document.location.href='list.jsp?pageNum=<%=pageNum%>'">
			</td>
		</tr>
				
		
	</table>
</form>

</div>
<% } catch(Exception e) {e.printStackTrace();} %>
</body>
</html>