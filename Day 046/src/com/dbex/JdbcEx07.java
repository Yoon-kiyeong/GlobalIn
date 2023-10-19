package com.dbex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx07 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno = ?");

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			// 쿼리의 ?(바인딩 변수)에 대입할 실제 데이터값 지정
			pstmt.setInt(1, 204);

			// 쿼리를 실행 해서 rs객체에 결과 저장
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("position") + "\t");
				System.out.println(rs.getString("dname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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