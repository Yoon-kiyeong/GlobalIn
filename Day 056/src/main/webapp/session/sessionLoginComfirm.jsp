<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="view/color.jsp"%>
<%
try {
	if(session.getAttribute("memId") == null) {
		response.sendRedirect("sessionLogin.jsp");
	}
} catch(Exception e) {
	e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="<%=bodyback_c%>">
	<form action="sessionLogOut.jsp" method="post">
		<table width="300" border="1" align="center">
			<tr>
				<td align="center" bgcolor="<%=value_c%>">
					<b><%=session.getAttribute("memId") %></b>님이 로그인 하셨습니다.
				</td>
			</tr>
			
			<tr>
				<td align="center" bgcolor="<%=value_c %>">
					<input type="submit" value="로그아웃">
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>