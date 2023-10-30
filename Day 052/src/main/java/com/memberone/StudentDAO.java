package com.memberone;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.*;

public class StudentDAO {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();
		} catch (Exception e) {
			System.out.println("Connection 생성 실패");
		}

		return con;
	}

	// 입력받은 id값을 데이터베이스에 저장되어 있는 id값과 베교해서 중복이 되는지를 확인함
	public boolean idCheck(String id) {

		boolean result = true;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from student where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (!rs.next()) {
				result = false;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ss) {

				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ss) {

				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException ss) {

				}
			}
		}

		return result;
	} // end idCheck

	// 우편번호를 데이터베이스에서 검색해서 Vector에 저장해서 리턴해주는 메소드 구현
	public Vector<ZipcodeVO> zipcodeRead(String dong) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Vector<ZipcodeVO> vecList = new Vector<ZipcodeVO>();

		try {
			con = getConnection();

			String sql = "select * from zipcode where dong like '%" + dong + "%'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ZipcodeVO tempZipcode = new ZipcodeVO();
				tempZipcode.setZipcode(rs.getString("zipcode"));
				tempZipcode.setSido(rs.getString("sido"));
				tempZipcode.setGugun(rs.getString("gugun"));
				tempZipcode.setDong(rs.getString("dong"));
				tempZipcode.setRi(rs.getString("ri"));
				tempZipcode.setBunji(rs.getString("bunji"));
				vecList.addElement(tempZipcode);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		return vecList;
	}

	// 회원가입 폼에서 회원가입 버튼을 누르면 실제 데이터베이스로 회원정보가 저장될 수 있는 기능을 구현
	public boolean memberInsert(StudentVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;

		try {
			con = getConnection();
			String sql = "insert into student values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getEmail());
			pstmt.setString(8, vo.getZipcode());
			pstmt.setString(9, vo.getAddress1());
			pstmt.setString(10, vo.getAddress2());

			int count = pstmt.executeUpdate();
			if (count > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		return flag;

	}

}