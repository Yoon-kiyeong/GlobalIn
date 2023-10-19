package com.dbex;

import java.sql.*;

public class ConnUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pass = "tiger";
		return DriverManager.getConnection(url, id, pass);
	}
}