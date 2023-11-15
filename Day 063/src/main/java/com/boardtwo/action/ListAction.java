package com.boardtwo.action;

import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import com.boardtwo.BoardDAO;
import com.boardtwo.BoardVO;
import com.boardtwo.controller.CommandAction;

public class ListAction implements CommandAction { // 글 목록 처리 클래스

	@Override
	public String requestPro(HttpServlet request, HttpServletResponse response) throws Throwable {
		// 2. 파라미터 받아옴
//		String pageNum = request.getParameter("pageNum");
//		
//		if (pageNum == null) {
//			pageNum = "1";
//		}
//
//		// 폼에서 가져온 파라미터 값을 한글로 변환처리 함
//		int pageSize = 3;
//		int currentPage = Integer.parseInt(pageNum);
//		int startRow = (currentPage - 1) * pageSize + 1;
//		int endRow = currentPage * pageSize;
//
//		int count = 0;
//		int number = 0;
//		List<BoardVO> articleList = null;
//
//		BoardDAO dbPro = BoardDAO.getInstance();
//
//		// 검색이 아니면 전체 목록을 보여주고 검색이면 검색한 내용을 보여줌
//
//		if (searchText == null) {// 검색이 아닐 경우
//
//			count = dbPro.getArticleCount();
//			if (count > 0) {
//				articleList = dbPro.getArticle(startRow, endRow);// 3
//			}
//
//		} else {// 검색일 경우
//			articleList = Collections.emptyList();
//		}
//
//		number = count - (currentPage - 1) * pageSize;
//
//		request.setAttribute("currentPage", new Integer(currentPage));
//		request.setAttribute("start", new Integer(currentPage));
//		request.setAttribute("currentPage", new Integer(currentPage));
//		request.setAttribute("currentPage", new Integer(currentPage));

		return null;
	}

}
