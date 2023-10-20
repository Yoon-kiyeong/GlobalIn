package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	// form 태그 필요
//		System.out.println("Hello Servlet 요청 .......");
		// 인코딩 설정
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		Date date = new Date();
		
		out.println("<html>");

		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("My Love Servlet Programing !!!");
		out.println("<br>");
		out.println(date.toString());
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	// form 태그 불필요

	}

}
