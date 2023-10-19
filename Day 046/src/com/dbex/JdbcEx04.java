package com.dbex;

import java.sql.*;

/*
 * ResultSet
 * 	- �������� �������� �� ����� ������ ���� ��ü
 *  - ������տ��� data�� ������ �� �ִ� �پ��� �޼ҵ�� cursor�� ����
 *  
 *  next() : ResultSet���� Ŀ���� ���� ������ �̵�
 *  		���� �����ϸ� true, �������� ������ false�� ��ȯ��
 *  close() : ResultSet ��ü�� ������
 *  
 *  getInt(int columnIndex) 
 *  getInt(String columnName) -> ��ȯ�� int
 *  - ResultSet ��ü�� Ŀ���� ����Ű�� ���� �࿡�� �÷��ε����� �ش��ϴ� �������� ��ȯ
 *  - ResultSet ��ü�� Ŀ���� ����Ű�� ���� �࿡�� �÷��̸��� �ش��ϴ� �������� ��ȯ  
 *  getString(int columnIndex)
 *  getString(String columnName) -> ��ȯ�� : String
 *  - ResultSet ��ü�� Ŀ���� ����Ű�� ���� �࿡�� �÷��ε����� �ش��ϴ� String ��ȯ
 *  - ResultSet ��ü�� Ŀ���� ����Ű�� ���� �࿡�� �÷��̸��� �ش��ϴ� String ��ȯ
 *   				
 *   executeQuery()
 *   - �����ϰ��� �ϴ� �������� select���� ��� ���� ������ ������ ���� ���� �� �ִ�.
 *   
 *   resultSet ��ü�κ��� �����͸� ����
 *   next()�޼ҵ�� Ŀ���� ���� ������ �̵���Ŵ
 *   �̵��� ��ġ�� ���� �����ϸ� true, ���� �������� ������ false�� ��ȯ
 *   ���� �����ϴ� ���ȿ��� ����ؼ� ������ ����
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
			stmt = con.createStatement(); // Statement ��ü ����
			rs = stmt.executeQuery("select * from department");

//			StringBuffer sql = new StringBuffer();
//			sql.append("select deptno, dname, college, loc from department");
//			rs = stmt.executeQuery(sql);

			while(rs.next()) { //��� ���տ� ���� �����ϸ� ������ ����
				// Ŀ���� ��ġ�� ���� ������ Į�� ���� ����
				int i = rs.getInt(1); //rs.getInt("deptno");
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class ����");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL ����");
		} finally { // �����ͺ��̽��� ����� �� �ݵ�� �����ؾ� ��
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
