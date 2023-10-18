package user;

import java.sql.*;

public class UserDAO {
	private Connection con;
	private Statement pstmt;
	private ResultSet rs;

	public UserDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "globalin";
			String password = "1234";
			con = DriverManager.getConnection(url, id, password);
			pstmt = con.createStatement();
			StringBuffer sql = new StringBuffer();
			sql.append("select userPassword ");
			sql.append("from userTable WHERE userID = ?");
			
			int result = pstmt.executeUpdate(sql.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int login(String userID, String userPassword) {
		String SQL = "SELECT userPassword from userTable WHERE userID = ?";
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPassword))
					return 1; // 로그인 성공
				else
					return 0; // 비밀번호 불일치
			}
			return -1; // 아이디가 없음
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류
	}
}
