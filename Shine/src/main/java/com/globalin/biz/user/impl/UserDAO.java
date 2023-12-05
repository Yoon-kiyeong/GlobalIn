package com.globalin.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.common.JDBCUtil;
import com.globalin.biz.user.UserVO;

@Repository("UserDAO")
public class UserDAO {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// SQL 관련 변수
	private final String USER_GET = "select * from employee where id = ? and pw = ?";

	// CRUD 기능의 메소드 구현
	// 회원 검색
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		try {
			System.out.println("====> JDBC로 getUser(*) 기능 처리");
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				user = new UserVO();
				user.setNo(rs.getInt("no"));
				user.setId(rs.getString("id"));
				user.setPw(rs.getString("pw"));
				user.setName(rs.getString("name"));
				user.setPosition(rs.getString("position"));
				user.setPhone(rs.getString("phone"));
				user.setCall(rs.getString("call"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setBirth(rs.getString("birth"));
				user.setDeptname(rs.getString("deptname"));
				user.setDeptno(rs.getInt("deptno"));
				user.setHiredate(rs.getDate("hiredate"));
				user.setExitdate(rs.getDate("exitdate"));
				user.setStatus(rs.getString("status"));
				user.setPhoto(rs.getBytes("photo"));	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,pstmt,conn);
		}
		return user;
	}

	public List<BoardVO> getBoardList(UserVO vo) {
		return null;
	}
}
