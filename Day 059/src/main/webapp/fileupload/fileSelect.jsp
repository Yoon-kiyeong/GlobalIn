<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
	public String getParam(HttpServletRequest request, String paramName) {
		if(request.getParameter(paramName)!= null){
			return request.getParameter(paramName);
		} else {
			return "";
		}
}
%>	

<%
	request.setCharacterEncoding("utf-8");
	int filecounter= 0;
	if(request.getParameter("addcnt") != null) {
		filecounter = Integer.parseInt(request.getParameter("addcnt"));
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<script type="text/javascript">
function inputValue(form1, param, form2, idx){
	let paramValue = form1.element[idx].value;
	form2.elements[idx].value = paramValue;
	return ;
}

function addFile(formName) {
	if(formName.addcnt.value == "") {
		alert("입력할 파일 개수를 입력하고 확인 버튼을 눌러주세요")
		formName.addcnt.focus();
		return ;
	}
	formName.submit();
}

function elementCheck(formName) {
	paramIndex = 1;
	for(idx = 0; idx < formName.elements.length; idx++) {
		if(formName.elements[idx].type == "file") {
			if(formName.elements[idx].value == "") {
				let message = paramIndex + "번째 파일 정보가 누락되었습니다.\n업로드할 파일을 선택해 주세요";
				alert(message);
				formName.elements[idx].focus();
				return ;
			} // end if
		paramIndex++;
		} // end if
	} // end for
	formName.action = "fileView.jsp;";
	formName.submit();
}
</script>
<body topmargin="100">
	<div align="center">
		<font color="#0000ff" size="2">복수개의 파일의 업로드를 위하여 파일 개수를 입력한 수<br>
			확인 버튼을 눌러주세요!<br> 입력이 완료되면 DONE 버튼을 눌러주세요
		</font>
	</div>
	<br>
	<form action="" method="post" name="frmName1">
		<table width="75%" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#660000" bgcolor="#FFFF99">
			<tr bgcolor="#FFCC00">
				<td width="10%"><div align="right">user</div></td>
				<td><input type="text" name="txtUser" onkeyup="inputValue(this.form, txtUser, frmName2,0)" value="<%=getParam(request, "txtUser")%>"></td>

				<td width="10%"><div align="right">title</div></td>
				<td><input type="text" name="txtTitle" onkeyup="inputValue(this.form, txtTitle, frmName2,1)" value="<%=getParam(request, "txtTitle")%>"></td>
			</tr>
			
			<tr bgcolor="#FFCC00">
				<td width="15%"> <div align="right">Abstract</div></td>
				<td width="50%" colspan="3">
					<textarea cols="40" name="txtAbstract" onkeyup="inputValue(this.form,txtAbstract,frmName2,2)"> 
					<%=getParam(request,"txtAbstract") %>
					</textarea>
				</td>
			</tr>
				
			<tr>
				<td colspan="4">
					<div align="center">
						<font size="-2">추가할 파일 개수 입력</font>
						<input type="text" name="addcnt">
						<input type="button" value="확인" onclick="addFile(this.form)">
					</div>
				</td>
			</tr>
			
			
		</table>
	</form>
	
	<form action="frmName2" method="post" enctype="multipart/form-data">
		<table width="75%" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#660000" bgcolor="#FFFF99">
			<tr bgcolor="#FFCC00">
				<td width="40%">
					<input type="hidden" name="txtUser" value="<%=getParam(request, "txtUser") %>">
					<input type="hidden" name="txtTitle" value="<%=getParam(request, "txtTitle") %>">
					<input type="hidden" name="txtAbstract" value="<%=getParam(request, "txtAbstract") %>">
					
					<%for(int i = 0; i < filecounter; i++) {%>
						<input type="file" size="50" name="seslectFile<%=i%>"><br>
					<%} %> 				
				</td>
			
				<td>
					<input type="button" value="DONE" onclick="elementCheck(this.form)">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>