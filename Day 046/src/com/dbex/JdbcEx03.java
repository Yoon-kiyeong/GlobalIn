package com.dbex;

import java.sql.*;

public class JdbcEx03 { // delete
	public static void main(String[] args) {
		Connection con = null; // �����ͺ��̽��� ������ ����ϴ� ��ü
		// Connection ��ü�� �̿��ؼ� �������� ����, ������ �� �ִ� Statement ��ü�� ���� �� ����
		Statement stmt = null;

		// SQL ������ �ۼ�
		String sql = "delete from department where dname = '��ǻ�Ͱ��а�'";

//		StringBuffer sql = new StringBuffer();
//		sql.append("delete from department ");
//		sql.append("where dname = '��ǻ�Ͱ��а�'");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			// DriverManager Ŭ������ static �޼ҵ��� getConnection()�޼ҵ带 �̿��ؼ� �����ͺ��̽��� �����
			// Connection ��ü�� ��ȯ��
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement(); // Statement ��ü ����

			int i = stmt.executeUpdate(sql.toString());

			System.out.println(i + "���� ���� �����Ǿ����ϴ�");

		} catch (ClassNotFoundException e) {
			System.out.println("Class ����");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL ����");
		} finally { // �����ͺ��̽��� ����� �� �ݵ�� �����ؾ� ��
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
