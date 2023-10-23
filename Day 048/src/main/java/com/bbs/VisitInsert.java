package com.bbs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bbs/VisitInsert")
public class VisitInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 사용자가 요청한 값 읽기
		String writer = request.getParameter("writer");
		String memo = request.getParameter("memo");
//		System.out.println("작성자 : " + writer);
//		System.out.println("내용 : " + memo);
		// 데이터베이스에 작성자와 내용을 저장하는 쿼리문 작성
		try {
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
}
