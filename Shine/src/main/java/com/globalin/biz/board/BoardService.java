package com.globalin.biz.board;

import java.util.List;

public interface BoardService {
	// 글 동륵
	public void insertBoard(BoardVO vo);
	// 글 수정
	public void updateBoard(BoardVO vo);
	// 글 삭제
	public void deleteBoard(BoardVO vo);
	// 글 상세조회
	public void BoardVO(BoardVO vo);
	// 글 전체조회
	public List<BoardVO> getBoardList(BoardVO vo);
}
