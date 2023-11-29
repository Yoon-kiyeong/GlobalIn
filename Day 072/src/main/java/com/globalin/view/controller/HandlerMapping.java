package com.globalin.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.globalin.view.board.DeleteBoardController;
import com.globalin.view.board.GetBoardController;
import com.globalin.view.board.GetBoardListController;
import com.globalin.view.board.InsertBoardController;
import com.globalin.view.board.UpdateBoardController;

/*
 * 모든 Controller 객체들을 저장하고 있다가, 사용자의 요청이 들어오면
 * 요청을 처리할 특정 Controller를 검색하는 기능을 제공하는 클래스이다.0
 * 
 */

import com.globalin.view.user.LoginController;
import com.globalin.view.user.LogoutController;

public class HandlerMapping {
	// Map을 이용해서 요청이 들어올 시 컨트롤러를 찾는 것
	private Map<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}

	// path를 통해 경로를 잡음
	public Controller getController(String path) {
		return mappings.get(path);
	}

}
