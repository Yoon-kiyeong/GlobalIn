package com.dbex;

import java.sql.*;

public class JdbcEx03 { // delete
	public static void main(String[] args) {
		Connection con = null; // 데이터베이스와 연결을 담당하는 객체
		// Connection 객체를 이용해서 쿼리문을 전송, 실행할 수 있는 Statement 객체를 얻을 수 이음
		Statement stmt = null;

		// SQL 쿼리문 작성
		String sql = "delete from department where dname = '컴퓨터공학과'";

//		StringBuffer sql = new StringBuffer();
//		sql.append("delete from department ");
//		sql.append("where dname = '컴퓨터공학과'");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			// DriverManager 클래스는 static 메소드인 getConnection()메소드를 이용해서 데이터베이스와 연결된
			// Connection 객체를 반환함
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement(); // Statement 객체 열기

			int i = stmt.executeUpdate(sql.toString());

			System.out.println(i + "개의 행이 삭제되었습니다");

		} catch (ClassNotFoundException e) {
			System.out.println("Class 에러");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 에러");
		} finally { // 데이터베이스를 사용한 후 반드시 해제해야 함
			try {
				if (stmt != null)
					stmt.close();
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
