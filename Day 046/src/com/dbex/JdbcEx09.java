package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx09 { // properties 파일을 FileInputStream하여 사용하기
	public static void main(String[] args) throws IOException, SQLException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();
			// department.properties 파일에 정의된 SQL를 가져와서 preparedstatement 만들기
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// 바인딩 변수 설정
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "10호관");

			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 항이 추가되었습니다");
		} catch (SQLException e) {
			try {
				con.rollback();
				System.out.println("데이테베이스 반영이 취소됨");
			} catch (SQLException s) {
				s.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				if (con != null)
					con.close();
			}
		}
	}
}
