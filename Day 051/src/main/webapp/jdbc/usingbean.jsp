<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,com.jdbc.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP JavaBean을 이용한 데이터 베이스 연동</title>
<link type="text/css" rel="stylesheet" href="style.css">
</head>
<body bgcolor="FFFFCC">
	<h2>Bean을 사용한 데이터베이스 연동</h2>
	<h3>회원정보</h3>
	<table bordercolor="0000ff" border="1">

		<tr>
			<td><strong>ID</strong></td>
			<td><strong>PASSWD</strong></td>
			<td><strong>NAME</strong></td>
			<td><strong>MEM_NUM1</strong></td>
			<td><strong>MEM_NUM2</strong></td>
			<td><strong>E_MAIL</strong></td>
			<td><strong>PHONE</strong></td>
			<td><strong>ZIPCODE/ADDRESS</strong></td>
			<td><strong>JOB</strong></td>
		</tr>
		<jsp:useBean id="dao" class="com.jdbc.TempMemberDAO" scope="page" />
		<%
		Vector<TempMemberVO> vecList = dao.getMemberList();
		int counter = vecList.size();
		 for(int i=0; i <vecList.size(); i++){
			 TempMemberVO vo = vecList.elementAt(i);
			 %>

				<tr>
				   <td><%=vo.getId() %></td>
				   <td><%=vo.getPasswd() %></td>
				   <td><%=vo.getName() %></td>
		           <td><%=vo.getMem_num1() %></td>
				   <td><%=vo.getMem_num2() %></td>
				   <td><%=vo.getE_mail() %></td>
		           <td><%=vo.getZipcode() %></td>
	    	       <td><%=vo.getAddress() %></td>
			       <td><%=vo.getJob() %></td>
				          
				<%} %>
				</tr>
				
	</table><br>
	total records : <%=counter %>
</body>
</html>