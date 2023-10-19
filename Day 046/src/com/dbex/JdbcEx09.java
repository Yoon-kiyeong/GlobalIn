package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx09 { // properties ������ FileInputStream�Ͽ� ����ϱ�
	public static void main(String[] args) throws IOException, SQLException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnUtil.getConnection();
			// department.properties ���Ͽ� ���ǵ� SQL�� �����ͼ� preparedstatement �����
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));

			// ���ε� ���� ����
			pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "10ȣ��");

			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰��Ǿ����ϴ�");
		} catch (SQLException e) {
			try {
				con.rollback();
				System.out.println("�����׺��̽� �ݿ��� ��ҵ�");
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
