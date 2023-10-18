package com.dbex;

import java.sql.*;

public class Dbtest02 { // ������ ����(Update)
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement();
			StringBuffer sql = new StringBuffer();

			sql.append("update department ");
			sql.append("set dname = '��ǻ�Ͱ��а�' where deptno = 203");
			
			int result = stmt.executeUpdate(sql.toString());
			
			System.out.println(result + "���� ���� ������Ʈ�Ǿ����ϴ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
