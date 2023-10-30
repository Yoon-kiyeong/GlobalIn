package com.jdbc;

import java.sql.*;
import java.util.*;

public class TempMemberDAO {
//
//	private final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
//	private final String JDBC_URL="jdbc:oracle:thin:@localhost:1521:xe";
//	private final String USER="scott";
//	private final String PASS="tiger";
//	
//	public TempMemberDAO() {
//		
//		try {
//			Class.forName(JDBC_DRIVER);
//		}catch(ClassNotFoundException cf) {
//			System.out.println("오라클 드라이브 로딩 실패!!!");
//		}
//	}

	public Vector<TempMemberVO> getMemberList() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Vector<TempMemberVO> vecList = new Vector<TempMemberVO>();

		try {
//	    	con = DriverManager.getConnection(JDBC_URL,USER,PASS);

			con = ConnUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select*from tempmember");

			while (rs.next()) {
				TempMemberVO vo = new TempMemberVO();
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString("name"));
				vo.setMem_num1(rs.getString("mem_num1"));
				vo.setMem_num2(rs.getString("mem_num2"));
				vo.setE_mail(rs.getString("e_mail"));
				vo.setPhone(rs.getString("phone"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setAddress(rs.getString("address"));
				vo.setJob(rs.getString("job"));

				vecList.add(vo);
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ss) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException ss) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ss) {
				}
		}
		return vecList;
	}
}
