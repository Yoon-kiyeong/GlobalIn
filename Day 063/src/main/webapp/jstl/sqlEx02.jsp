<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource dataSource="jdbc/myoracle" var="ds"
		scope="application" />
	<sql:update dataSource="${ds }">
		update tempmember set passwd=? where id=?
	<sql:param value="${3456 }" />
	<sql:param value="${'test' }" />
	</sql:update>
	
	<sql:query var="rs" dataSource="${ds }">
	select * from tempmember
	</sql:query>

	<table border="1">
		<tr>
			<%-- 필드명 출력 --%>
			<c:forEach var="columnName" items="${rs.columnNames }">
				<th><c:out value="${columnName }" /></th>
			</c:forEach>
		</tr>
		<%--레코드 수만큼 반복 수행하여 출력함 --%>
		<c:forEach var="row" items="${rs.rowsByIndex }">
			<tr>
				<c:forEach var="column" items="${row}" varStatus="i">
					<td><c:if test="${column != null }">
							<c:out value="${column }" />
						</c:if> <c:if test="${column == null }">
							&nbsp;
						</c:if></td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
</body>
</html>