<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.globalin.biz.user.impl.UserDAO"%>
<%@ page import="com.globalin.biz.user.UserVO"%>

<%
// 1. 사용자 입력 정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
// 2. 데이터베이스 연동처리
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPw(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
// 3. 화면 네비게이션 처리
if(user != null) {
	response.sendRedirect("main.jsp");
} else {
	response.sendRedirect("index.jsp");
}

%>