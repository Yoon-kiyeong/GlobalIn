<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.globalin.biz.board.impl.BoardDAO" %>
<%@ page import="com.globalin.biz.board.BoardVO" %>
<%
	// 1. 사용자 입력 정보 추출
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	
	// 2. 데이터베이스 연동 처리
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setWriter(writer);
	vo.setContent(content);
	
	BoardDAO dao = new BoardDAO();
	dao.insertBoard(vo);
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp");
%>
