<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.globalin.biz.board.impl.BoardDAO"%>
<%@ page import="com.globalin.biz.board.BoardVO"%>
<%
// 1. 검색할 게시글 번호 추출
	String seq = request.getParameter("seq");

// 2. 데이터베이스 연동 처리
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO dao = new BoardDAO();
	BoardVO board = dao.getBoard(vo);
	
// 3. 응답화면 구성
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세 보기</title>
</head>
<body>
<div align="center">
	<a href="logoutProc.jsp">Log-out</a>
<hr>
<form action="updateBoard_proc.jsp" method="post">
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
<a href="deleteBoard_proc.jsp?seq=<%=board.getSeq()%>">글 삭제</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.jsp">글 목록보기</a>&nbsp;&nbsp;&nbsp;

</div>
</body>
</html>