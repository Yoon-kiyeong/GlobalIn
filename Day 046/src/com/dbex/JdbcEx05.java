package com.dbex;

import java.sql.*;

/*
 * ����
 * PreparedStatement
 * - sql ���´� ������ �����ϳ� �����̳� �������� �ٸ� ������ ���ε������� ����ؼ� ���� ó�������ν� �׻� ������ sql���� �����ϰ� ó�� �� �� �ִ�.
 * 
 * PreparedStatement ��ü�� ���� �� ���ε� ���� ���
 * - ���ε� ������ ���������� ��ü�� �κп� ����ϴ� ������ => ?
 * String sql = "insert into department values(?,?,?,?);
 * 
 * PreparedStatement pstmt = con.prepareStatement(sql);
 * 
 * ���ε�����(?)�� ������ŭ ������� �ش� ������ ������ ���� ��������
 * ���ε������� ���� ������ �� PreparedStatement ��ü���� �������ִ� setXXX()�Լ��� Ȱ����
 * pstmt.setInt(1,203);
 * pstmt.setString(2, "������а�");
 * pstmt.setInt(3, 200);
 * pstmt.setString(4, "6ȣ��");
 * 
 * - ���ε� ������ �÷����� ���� ����� �� ����
 */

public class JdbcEx05 {
	public static void main(String[] args) {
		/*
		 * PreparedStatment ��ü�� ����ϴ� ��� �������� ���� ������ ��ü�� �κ��� ?�� ó���� ?�� �����ͺ��̽����� sql ����ÿ�
		 * ���� ����Ǵ� ������ ��ü(����)��
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
			// ������ ?(���ε� ����)�� ������ ���� �����Ͱ� ����
			pstmt.setInt(1, 9921);
			pstmt.setString(2, "���浿");
			pstmt.setString(3, "kildong");
			pstmt.setString(4, "���ӱ���");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 205);

			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� �߰��Ǿ����ϴ�");
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
