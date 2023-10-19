package com.dbex;

import java.sql.*;

/*
 * ResultSet
 * 	- 쿼리문을 실행했을 때 결과를 저장해 놓은 객체
 *  - 결과집합에서 data를 가져올 수 있는 다양한 메소드와 cursor를 포함
 *  
 *  next() : ResultSet에서 커서를 다음 행으로 이동
 *  		행이 존재하면 true, 존재하지 않으면 false를 반환함
 *  close() : ResultSet 객체를 해제함
 *  
 *  getInt(int columnIndex) 
 *  getInt(String columnName) -> 반환형 int
 *  - ResultSet 객체의 커서가 가리키는 현재 행에서 컬럼인덱스에 해당하는 정수값을 반환
 *  - ResultSet 객체의 커서가 가리키는 현재 행에서 컬럼이름에 해당하는 정수값을 반환  
 *  getString(int columnIndex)
 *  getString(String columnName) -> 반환형 : String
 *  - ResultSet 객체의 커서가 가리키는 현재 행에서 컬럼인덱스에 해당하는 String 반환
 *  - ResultSet 객체의 커서가 가리키는 현재 행에서 컬럼이름에 해당하는 String 반환
 *   				
 *   executeQuery()
 *   - 실행하고자 하는 쿼리문이 select문인 경우 쿼리 실행결과 집합을 리턴 받을 수 있다.
 *   
 *   resultSet 객체로부터 데이터를 추출
 *   next()메소드는 커서를 다음 행으로 이동시킴
 *   이동된 위치에 행이 존재하면 true, 행이 존재하지 않으면 false를 반환
 *   행이 존재하는 동안에는 계속해서 데이터 추출
 */
public class JdbcEx04 { // select
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement(); // Statement 객체 열기
			rs = stmt.executeQuery("select * from department");

//			StringBuffer sql = new StringBuffer();
//			sql.append("select deptno, dname, college, loc from department");
//			rs = stmt.executeQuery(sql);

			while(rs.next()) { //결과 집합에 행이 존재하면 데이터 추출
				// 커서가 위치한 행의 각각의 칼럼 값을 추출
				int i = rs.getInt(1); //rs.getInt("deptno");
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class 에러");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 에러");
		} finally { // 데이터베이스를 사용한 후 반드시 해제해야 함
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con != null)
					con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
