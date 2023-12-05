package com.globalin.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.globalin.biz.board.BoardService;

public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	public BoardServiceImpl() {
		
	}
	
	@Override
	public void insertBoard(com.globalin.biz.board.BoardVO vo) {
//		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(com.globalin.biz.board.BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(com.globalin.biz.board.BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BoardVO(com.globalin.biz.board.BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<com.globalin.biz.board.BoardVO> getBoardList(com.globalin.biz.board.BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
