<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.globalin.biz.board.impl.BoardDAO"%>
<%@ page import="com.globalin.biz.board.BoardVO"%>
<%
	// 1. 사용자 입력 정보 추출
	String seq = request.getParameter("seq");

	// 2. 데이터 베이스 연동 처리
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO dao = new BoardDAO();
	dao.deleteBoard(vo);
	
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp");
%>