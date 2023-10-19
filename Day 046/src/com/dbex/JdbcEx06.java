package com.dbex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		StringBuffer sql = new StringBuffer();
		sql.append("update professor set sal = ? ");
		sql.append("where name = ?");

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			// 쿼리의 ?(바인딩 변수)에 대입할 실제 데이터값 지정
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");

			// 쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 변경되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
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
