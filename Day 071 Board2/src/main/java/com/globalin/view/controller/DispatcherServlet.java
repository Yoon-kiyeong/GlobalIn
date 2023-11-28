package com.globalin.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;
import com.globalin.biz.user.UserVO;
import com.globalin.biz.user.impl.UserDAO;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 사용자의 요청 경로를 추출함
		String url = request.getRequestURI();
		String path = url.substring(url.lastIndexOf("/"));
		System.out.println(path);

		// 2. 사용자 요청 경로에 따라 적절히 분기 처리 함
		if (path.equals("/login.do")) {
			System.out.println("로그인 처리");
			// 1. 사용자 입력 정보 추출
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			// 2. 데이터베이스 연동처리
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);

			UserDAO userDAO = new UserDAO();
			UserVO user = userDAO.getUser(vo);

			// 3. 화면 네비게이션 처리
			if (user != null) {
				response.sendRedirect("getBoardList.do");
			} else {
				response.sendRedirect("login.jsp");
			}
		} else if (path.equals("/logout.do")) {
			System.out.println("로그아웃 처리");
			// 1. 브라우저와 연결된 세션 객체를 강제로 종료함
			HttpSession session = request.getSession();
			session.invalidate();

			// 2. 세선 종료 후, 메인 화면으로 이동함
			response.sendRedirect("login.jsp");
			
		} else if (path.equals("/insertBoard.do")) {
			System.out.println("글 등록 처리");
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
			response.sendRedirect("getBoardList.do");
		} else if (path.equals("/updateBoard.do")) {
			System.out.println("글 수정 처리");
			// 1. 사용자 입력 정보 추출
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String seq = request.getParameter("seq");
			
			// 2. 데이터베이스 연동 처리
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setContent(content);
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO dao = new BoardDAO();
			dao.updateBoard(vo);
			
			// 3. 화면 네비게이션
			response.sendRedirect("getBoardList.do");
		} else if (path.equals("/deleteBoard.do")) {
			System.out.println("글 삭제 처리");
			// 1. 사용자 입력 정보 추출
			String seq = request.getParameter("seq");

			// 2. 데이터 베이스 연동 처리
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO dao = new BoardDAO();
			dao.deleteBoard(vo);
			
			// 3. 화면 네비게이션
			response.sendRedirect("getBoardList.do");
		} else if (path.equals("/getBoard.do")) {
			System.out.println("글 상세보기 처리");
			// 1. 검색할 게시글 번호 추출
			String seq = request.getParameter("seq");

			// 2. 데이터베이스 연동 처리
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));

			BoardDAO dao = new BoardDAO();
			BoardVO board = dao.getBoard(vo);
			
			// 검색 결과를 세션에 저장하고 목록 화면으로 이동처리함
			HttpSession session = request.getSession();
			session.setAttribute("board", board);
			response.sendRedirect("getBoard.jsp");
		} else if (path.equals("/getBoardList.do")) {
			// DB 연동 처리
			System.out.println("글 목록 보기 처리");
			BoardVO vo = new BoardVO();
			BoardDAO dao = new BoardDAO();
			List<BoardVO> boardList = dao.getBoardList(vo);

			// 검색 결과를 세션에 저장하고 목록 화면으로 이동처리함
			HttpSession session = request.getSession();
			session.setAttribute("boardList", boardList);
			response.sendRedirect("getBoardList.jsp");

		}

	}
}
