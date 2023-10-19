package com.dbex;

import java.sql.*;

public class JdbcEx08 {
	public static void main(String[] args) {
		/*
		 * 트랜잭션(transaction) : 논리적인 작업 단위 insert, delete, update등의 작업들을 하나의 논리적인 단위로 묶어서
		 * 쿼리 실행시 모든 작업이 정상처리된 경우에는 commit을 실행해서 데이터베이스에 반영하고, 쿼리 실행 중 하나라도 오류가 발생하면
		 * rollback을 실행해서 작업단위 내의 모든 작업을 취소함
		 *
		 */
		Connection con = null;
		PreparedStatement pstmt = null;

		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");

		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ? ");

		try {
			///////////////////////// 트랜잭션 시작
			// 하나의 작업 단위 시작
			con = ConnUtil.getConnection();

			// autoCommit 기능을 비활성화 시킴
			con.setAutoCommit(false);

			// -- 첫번째 작업 --
			pstmt = con.prepareStatement(sql1.toString());

			// 쿼리의 ?(바인딩 변수)에 대입할 실제 데이터값 지정
			pstmt.setInt(1, 255);
			pstmt.setString(2, "AI공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			
			pstmt.executeUpdate();
			// 쿼리를 실행 해서 rs객체에 결과 저장

			// -- 첫번째 작업 끝 --

			// -- 두번째 작업 --
			pstmt = con.prepareStatement(sql2.toString());
			// 쿼리의 ?(바인딩 변수)에 대입할 실제 데이터값 지정
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			
			pstmt.executeUpdate();
			// -- 두번째 작업 끝 --

			// 쿼리가 정상적으로 실행된 경우 데이터베이스에 반영됨
			con.commit();
			System.out.println("데이터베이스에 정상적으로 반영 됨");
		} catch (SQLException e) {
			try {
				con.rollback(); // DB에러 발생시 롤백이 됨
				System.out.println("데이터베이스에 반영이 취소 됨");
			} catch (SQLException s) {
				s.printStackTrace();
			}
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
