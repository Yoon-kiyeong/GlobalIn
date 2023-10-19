package com.dbex;

import java.sql.*;

public class JdbcEx01 {	// ������ ����(insert)

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String id = "soctt";
//			String password = "tiger";

			con = DriverManager.getConnection(url, "scott", "tiger");
			stmt = con.createStatement(); // Statement ��ü ���

			StringBuffer sql = new StringBuffer(); // ������ �ӽ� ����

			// SQL ������ �ۼ�
			sql.append("insert into department ");
			sql.append("values(203, '����������а�', 200, '7ȣ��')");

			int result = stmt.executeUpdate(sql.toString());
			// �߰�, ����, ������ ��� �����ͺ��̽��� ��ȭ�� �Ͼ
			// executeQuery(); ����Ʈ���̽��� ��ȭ�� ����
			// ���� ��ȸ�� ��� �����

//			System.out.println("DB���� ����");
			System.out.println(result + "���� ���� �߰��Ǿ����ϴ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // �����ͺ��̽��� ����� �� �ݵ�� �����ؾ���
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
