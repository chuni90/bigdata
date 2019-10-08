<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원정보 조회</title>
	</head>
	<body>
		<h2>회원정보 조회</h2><hr>
		<form action = "/tutorial_04/search" method = "post">  <!-- 절대 주소로 사용 -->
			<font color = "red" size = "4">*</font>
			id : <input type="text" name="id" size = "10" maxlength = "10"/>
			&nbsp;&nbsp;&nbsp;
			<input type = "submit" value = "조회"/>
		</form>
		<hr>
		<a href="/tutorial_04/all_member">전체 회원정보 출력</a><br><hr>
		<a href="/tutorial_04/view/add_member.jsp">회원가입 하러가깅</a>
	
	</body>
</html>