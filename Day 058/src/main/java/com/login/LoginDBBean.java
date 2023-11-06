package com.login;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class LoginDBBean {
	private static LoginDBBean instance = new LoginDBBean();
	private LoginDBBean() {}
	public static LoginDBBean getInstance() {
		return instance;
	}

	private Connection getConnection() throws Exception {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		return ds.getConnection();
	}

	public int userCheck(String id, String passwd) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = ""; // 데이터베이스에 저장된 비밀번호 저장변수

		int x = -1; // 아이디 존재 하지 않음
		try {
			con = getConnection();
			pstmt = con.prepareStatement("select passwd from tempmember where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) { // 아이디가 존재할 경우
				dbpasswd = rs.getString("passwd");
				if (dbpasswd.equals("passwd")) {
					x = 1; // 로그인 성공
				} else {
					x = 0; // 비밀번호 오류(로그인 실패)
				}
			} else { // 아이디가 존재하지 않을 경우
				x = -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return x;
	}
}
