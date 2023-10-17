<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	String selectQuery = "SELECT * FROM MEMBER2";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="400" border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>등급</td>
			<td>전화번호</td>
		</tr>
		<%
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement(); // 쿼리 호출받아주고
				rs = stmt.executeQuery(selectQuery); // 쿼리를 집어넣음
				
				while(rs.next()) { // 값이 있을경우
		%>
		<tr>
			<td><%= rs.getString("ID") %></td>
			<!-- get메서드로 값을 불러옴 -->
			<td><%= rs.getString("NAME") %></td>
			<td>
				<%  
								int n_class = rs.getInt("CLASS"); 
								if(n_class == 1) {
									out.print("일반회원");
								} else {
									out.print("교수님");
								}
							%>
			</td>
			<td><%= rs.getString("TEL") %></td>
		</tr>
		<%					
				}
			} catch(SQLException se) {
				se.printStackTrace();
			} finally {
				try{
					if(rs != null) rs.close();
					if(stmt != null) rs.close();
					if(conn != null) rs.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		%>
	</table>
</body>
</html>