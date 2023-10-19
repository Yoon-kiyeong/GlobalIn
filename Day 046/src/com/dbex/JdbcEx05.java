package com.dbex;

import java.sql.*;

/*
 * 동적
 * PreparedStatement
 * - sql 형태는 정적과 동일하나 조건이나 변수값이 다른 문장을 바인딩변수를 사용해서 변수 처리함으로써 항상 동일한 sql문을 동일하게 처리 할 수 있다.
 * 
 * PreparedStatement 객체의 생성 및 바인딩 변수 사용
 * - 바인딩 변수는 실제값으로 대체될 부분에 사용하는 변수임 => ?
 * String sql = "insert into department values(?,?,?,?);
 * 
 * PreparedStatement pstmt = con.prepareStatement(sql);
 * 
 * 바인딩변수(?)의 개수만큼 순서대로 해당 변수에 대입할 값을 지정해줌
 * 바인딩변수에 값을 대입할 때 PreparedStatement 객체에서 제공해주는 setXXX()함수를 활용함
 * pstmt.setInt(1,203);
 * pstmt.setString(2, "생명공학과");
 * pstmt.setInt(3, 200);
 * pstmt.setString(4, "6호관");
 * 
 * - 바인딩 변수는 컬럼명에는 절대 사용할 일 없음
 */

public class JdbcEx05 {
	public static void main(String[] args) {
		/*
		 * PreparedStatment 객체를 사용하는 경우 쿼리에서 실제 값으로 대체될 부분을 ?로 처리함 ?는 데이터베이스에서 sql 실행시에
		 * 실제 저장되는 값으로 대체(변경)됨
		 * 
		 */
		Connection con = null;
		PreparedStatement pstmt = null;

		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values (?,?,?,?,?,sysdate,?,?)");
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			// 쿼리의 ?(바인딩 변수)에 대입할 실제 데이터값 지정
			pstmt.setInt(1, 9921);
			pstmt.setString(2, "가길동");
			pstmt.setString(3, "kildong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 205);

			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가되었습니다");
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
