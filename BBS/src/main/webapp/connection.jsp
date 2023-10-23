<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
Connection conn = null;
try { String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
String user = "scott";
String password = "tiger";
Class.forName("oracle.jdbc.driver.OracleDriver");
conn = DriverManager.getConnection(url, user, password);
out.print("데이터베이스 연결에 성공했습니다");
} catch(SQLException e) {
	out.print("데이터베이스 연결에 실패했습니다");
	out.print("SQLException : " + e.getMessage());
} finally {
	if(conn != null) {
		conn.close();
	}
}
%>
</body>
</html>