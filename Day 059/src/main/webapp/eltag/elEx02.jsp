<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ page import="com.actiontag.Customer, java.util.ArrayList" %>
<% 
	ArrayList<String> singer = new ArrayList<String>();
	singer.add("뉴진스");
	singer.add("르세라핌");
	request.setAttribute("singer",singer);
	
	Customer[] customer = new Customer[2];	
	customer[0] = new Customer();
	customer[0].setName("홍길동");
	customer[0].setEmail("hong@naver.com");
	customer[0].setPhone("010-1234-5678");

	customer[1] = new Customer();
	customer[1].setName("임꺽정");
	customer[1].setEmail("lim@naver.com");
	customer[1].setPhone("010-9876-5432");
	
	request.setAttribute("customer", customer);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
	<li>${singer[0] }, ${singer[1] }</li>
</ul>

<ul>
	<li>이름 : ${customer[0].name }</li>
	<li>이메일 : ${customer[0].email }</li>
	<li>전화번호 : ${customer[0].phone }</li>
</ul>

<ul>
	<li>이름 : ${customer[1].name }</li>
	<li>이메일 : ${customer[1].email }</li>
	<li>전화번호 : ${customer[1].phone }</li>
</ul>
</body>
</html>