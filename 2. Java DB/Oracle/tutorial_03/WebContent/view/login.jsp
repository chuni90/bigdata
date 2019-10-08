<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		
		<!-- ,(쉼표)는 '그 안에' 또는 '그리고' 라는 의미 -->
		<style type="text/css">
			table{
				border-collapse: collapse;
			}
		
			table, tr, td{ 
				border : 1px solid green;
			}
			
			tr, td{
				padding: 10px;
				text-align: center;
			}
			
			tr:hover {
				background-color: #f5f5f5;
			}
		
		</style>
	</head>
	<body>
		<h1>로그인 화면</h1><hr>
		<%
		String retMsg = (String) request.getAttribute("regMsg");
		if(retMsg != null) {
		%>
		<font color ="red" size=4>"ret</font>
		<%} %>
		<form action = "/tutorial_03/login" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pass"/></td>
				</tr>
				<tr align = "center">
					<!-- colspan="2"는 2칸을 1칸으로 합친 다는 의미 -->
					<td colspan="2"><input type="button" value = "join" onclick="join.jsp"/>
					&nbsp;&nbsp;&nbsp;<input type="submit" value = "login"/></td>
				</tr>
			</table>
		
		</form>
	
	</body>
</html>