package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 파라미터값 읽어와서 저장할 변수
	private String company;
	private String manager;
	private String tel;
	private String email;

	public void init() throws ServletException {
		System.out.println("초기화 메소드 수행");

		// ServletContext의 초기 파라미터 값 읽기
		company = getServletContext().getInitParameter("company");
		manager = getServletContext().getInitParameter("manager");
		
		// ServletConfig의 초기 파라미터 값 읽기
		tel = getServletConfig().getInitParameter("tel");
		email = getServletConfig().getInitParameter("email");

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li> 회사명 : " + company + "</li>");
		out.println("<li> 관리자 : " + manager + "</li>");
		out.println("<li> 연락처 : " + tel + "</li>");
		out.println("<li> 이메일 : " + email + "</li>");
		
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
