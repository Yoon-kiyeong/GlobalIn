<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.globalin.biz.board.BoardVO"%>
<%
	// 세션에 저장된 게시글 정보를 추출함
	BoardVO board = (BoardVO)session.getAttribute("board");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세 보기</title>
</head>
<body>
<div align="center">
	<a href="logout.do">Log-out</a>
<hr>
<form action="updateBoard.do" method="post">
	<input type="hidden" name="seq" value="<%=board.getSeq() %>">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange" width="70">제목</td>
				<td align="left">
					<input type="text" name="title" value="<%=board.getTitle() %>">
				</td>
			</tr>
			<tr>
				<td bgcolor="orange">작성자</td>
				<td align="left">
					<%=board.getWriter() %>
				</td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">내용</td>
				<td align="left">
				<textarea rows="10" cols="40" name="content"><%=board.getContent() %></textarea>			
				</td>
			</tr>
			<tr>
				<td bgcolor="orange">등록일</td>
				<td align="left">
					<%=board.getRegDate() %>
				</td>
			</tr>
			<tr>
				<td bgcolor="orange">조회수</td>
				<td align="left">
					<%=board.getCnt() %>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="글 수정">
				</td>
			</tr>
		</table>
	</form>
<hr>

<a href="insertBoard.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=<%=board.getSeq()%>">글 삭제</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.do">글 목록보기</a>&nbsp;&nbsp;&nbsp;

</div>
</body>
</html>