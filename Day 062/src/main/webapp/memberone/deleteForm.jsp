<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function begin() {
		document.myForm.pass.focus();
	}

	function checkIt() {
		if (!document.myForm.pass.value) {
			alert("비밀번호를 입력하지 않았습니다.");
		}
	}
</script>
</head>
<body onload="begin()">
	<form action="deleteProc.jsp" method="post" name="myForm"
		onsubmit="return checkIt()">
		<table width="260" border="1" align="center">
			<tr>
				<td colspan="2" align="center"><b>회원탈퇴</b></td>
			</tr>
			<tr>
				<td width="150"><b>비밀번호 입력</b></td>
				<td width="110"><input type="password" name="pass" size="15">
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="회원 탈퇴"> <input type="reset" value="취소"
					onclick="javascript:window.location='login.jsp'"></td>
			</tr>
		</table>

	</form>
</body>
</html>