package com.boardone;

public class BoardDAO {

	private static BoardDAO instance = null;
	
	private BoardDAO() {}
	
	public static BoardDAO getInstance() {
		if(instance == null) {
			synchronized(BoardDAO.class) {
				instance = new BoardDAO();
			}
		}
		return instance;
	}
	
	// 이곳에 게시판 작업에 필요한 기능을 하나하나 메소드로 작성해서 추가해 나가면 됨
}
