<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원가입</title>
		
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
		<h1>회원가입</h1><hr>
		<form action="/tutorial_04/add_member" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pass"/></td>
				</tr>
				<tr>
					<td>성명</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="number" name="age" min="18"></td>
				</tr>
			</table>
			<input type="submit" value="가입하기"/>
		
		</form>
	
	</body>
</html>