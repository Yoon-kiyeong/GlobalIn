package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		try {
			HttpSession session = request.getSession(false);

			if (session != null) {
				String sessionID = session.getId();
				System.out.println("세션 아이디 : " + sessionID);
				String user = (String)session.getAttribute("user");
				out.println("<html>");
				out.println("<body>");
				out.println("<table border='1' width=300>");
				
				out.println("<tr>");
				out.println("<td width='300' align='center'>" + user + "님이 로그인 되었습니다");
				out.println("</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td align='center'>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td align='center'>");
				out.println("<a href='#'>회원정보</a>");
				out.println("<a href='Logout'>로그아웃</a>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
			} else {

			}
		} finally {
			out.close();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
