package com.dbex;

import java.sql.*;

public class JdbcEx01 {	// 데이터 저장(insert)

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String id = "soctt";
//			String password = "tiger";

			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement(); // Statement 객체 얻기

			StringBuffer sql = new StringBuffer(); // 쿼리문 임시 저장

			// SQL 쿼리문 작성
			sql.append("insert into department ");
			sql.append("values(203, '제어계측공학과', 200, '7호관')");

			int result = stmt.executeUpdate(sql.toString());
			// 추가, 수정, 삭제일 경우 데이터베이스에 변화가 일어남
			// executeQuery(); 데이트베이스에 변화가 없음
			// 단지 조회일 경우 사용함

//			System.out.println("DB연결 성공");
			System.out.println(result + "개의 행이 추가되었습니다");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 데이터베이스를 사용한 후 반드시 해제해야함
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
