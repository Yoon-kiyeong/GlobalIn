package com.globalin.biz.board.impl;

import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAO {
	
	private final String BOARD_MAIN = "select *from board where no=?";

}
