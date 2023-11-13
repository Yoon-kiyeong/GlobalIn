<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	FileReader reader = null;
	try {
		String path = request.getParameter("path");
		reader = new FileReader(getServletContext().getRealPath(path));
	%>
	<pre>
소스 코드 = <%=path%>
<c:out value="<%=reader%>" />
</pre>

	<%
	} catch (IOException e) {
	%>
	에러 :
	<%=e.getMessage()%>
	<%
	} finally {
	if (reader != null)
		try {
			reader.close();
		} catch (IOException ee) {
			ee.printStackTrace();
		}
	}
	%>

</body>
</html>