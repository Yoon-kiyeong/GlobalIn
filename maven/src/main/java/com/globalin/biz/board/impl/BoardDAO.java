package com.globalin.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.util.SqlSessionFactoryBean;

public class BoardDAO {

	private SqlSession mybatis;

	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}

	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard", vo);
		mybatis.commit();
	}

	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
	}

	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard", vo);
		//selectOne : 하나의 값만 가져올 때 사용
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("BoardDAO.getBoardList", vo);
		//selectList : 여러값을 가져올 때 사용
	}
}
