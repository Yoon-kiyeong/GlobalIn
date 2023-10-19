package com.dbex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		StringBuffer sql = new StringBuffer();
		sql.append("update professor set sal = ? ");
		sql.append("where name = ?");

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			// ������ ?(���ε� ����)�� ������ ���� �����Ͱ� ����
			pstmt.setInt(1, 500);
			pstmt.setString(2, "ȫ�浿");

			// ���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i + "���� ���� ����Ǿ����ϴ�");
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
