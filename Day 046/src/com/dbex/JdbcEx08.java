package com.dbex;

import java.sql.*;

public class JdbcEx08 {
	public static void main(String[] args) {
		/*
		 * Ʈ�����(transaction) : ������ �۾� ���� insert, delete, update���� �۾����� �ϳ��� ������ ������ ���
		 * ���� ����� ��� �۾��� ����ó���� ��쿡�� commit�� �����ؼ� �����ͺ��̽��� �ݿ��ϰ�, ���� ���� �� �ϳ��� ������ �߻��ϸ�
		 * rollback�� �����ؼ� �۾����� ���� ��� �۾��� �����
		 *
		 */
		Connection con = null;
		PreparedStatement pstmt = null;

		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");

		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ? ");

		try {
			///////////////////////// Ʈ����� ����
			// �ϳ��� �۾� ���� ����
			con = ConnUtil.getConnection();

			// autoCommit ����� ��Ȱ��ȭ ��Ŵ
			con.setAutoCommit(false);

			// -- ù��° �۾� --
			pstmt = con.prepareStatement(sql1.toString());

			// ������ ?(���ε� ����)�� ������ ���� �����Ͱ� ����
			pstmt.setInt(1, 255);
			pstmt.setString(2, "AI���а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9ȣ��");
			
			pstmt.executeUpdate();
			// ������ ���� �ؼ� rs��ü�� ��� ����

			// -- ù��° �۾� �� --

			// -- �ι�° �۾� --
			pstmt = con.prepareStatement(sql2.toString());
			// ������ ?(���ε� ����)�� ������ ���� �����Ͱ� ����
			pstmt.setString(1, "������а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 255);
			
			pstmt.executeUpdate();
			// -- �ι�° �۾� �� --

			// ������ ���������� ����� ��� �����ͺ��̽��� �ݿ���
			con.commit();
			System.out.println("�����ͺ��̽��� ���������� �ݿ� ��");
		} catch (SQLException e) {
			try {
				con.rollback(); // DB���� �߻��� �ѹ��� ��
				System.out.println("�����ͺ��̽��� �ݿ��� ��� ��");
			} catch (SQLException s) {
				s.printStackTrace();
			}
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
