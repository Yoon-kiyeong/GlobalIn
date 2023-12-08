package com.globalin.biz.board;

import java.util.List;

import com.globalin.biz.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) {
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO vo = new BoardVO();
		vo.setTitle("MyBatis 제목입니다...");
		vo.setWriter("독고준");
		vo.setContent("MyBatis 내용입니다...");
		boardDAO.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		for(BoardVO board : boardList) {
			System.out.println("--->>>> "+board.toString());
		}

	}

}
