<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
	속성(attribute)은 PageContext, HttpServletRequest, HttpSession, ServletContext 객체 중 하나에 설정해 놓은 객체를 의미함
	속성은 이들 객체에 Map 객체와 마찬가지로 이름/쌍으로 저장되어 있다.
	각각의 객체에 저장된 속성들은 서로 다른 생존 범위를 가진
	
	속성들의 생존 범위
	PageContext : 해당 JSP 페이지 내에서만 유효
	HttpServletRequest : 어플리케이션에서 요청 객체가 유지되는 동안 유효
	HttpSession : 특정 세션에 접근할 수 있는 서블릿이나 JSP
	ServletContext : 어플리케이션내의 모든 것들을 의미함
 -->

<%
// pageContext Scope에 속성 저장
pageContext.setAttribute("pageAttribute", "홍길동");
// pageContext.setAttribute("pageAttribute","홍길동",PageContext.PAGE_SCOPE);

// request Scope에 속성 저장
request.setAttribute("requestAttribute", "010-1111-1234");
// pageContext.setAttribute("pageAttribute","010-1111-1234", PageContext.PAGE_SCOPE, PageContext.REQUEST_SCOPE);

// session Scope에 속성 저장
session.setAttribute("sessionAttribute", "hong@naver.com");
// pageContext.setAttribute("sessionAttribute","hong@naver.com", PageContext.SESSION_SCOPE);

// application Scope에 속성 저장
application.setAttribute("applicationAttribute", "Global In");
// pageContext.setAttribute("applicationAttribute", "Global In", PgeContext.APPLICATION_SCOPE);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>이름 : <%=pageContext.getAttribute("pageAttribute")%></li>
		<li>전번 : <%=request.getAttribute("requestAttribute")%></li>
		<li>메일 : <%=session.getAttribute("sessionAttribute")%></li>
		<li>회사 : <%=application.getAttribute("applicationAttribute")%></li>
	</ul>
</body>
</html>