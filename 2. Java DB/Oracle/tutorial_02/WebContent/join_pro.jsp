<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		String id = null;
		String password = null;
		String name = null;
		String birth_year = null;
		String birth_mon = null;
		String birth_day = null;
		String gender = null;
		String region = null;
		String phone = null;
		String email = null;
		
		request.setCharacterEncoding("UTF-8");
		
		id =request.getParameter("id");
		name =request.getParameter("name");
		birth_year = request.getParameter("birth_year");
		birth_mon =request.getParameter("birth_mon");
		birth_day =request.getParameter("birth_day");
		email =request.getParameter("email");
		gender = request.getParameter("gender");
		region = request.getParameter("region");
		phone = request.getParameter("phone");
		
		
		
		%>
		<font size="6" color="green">NAVER</font><br><br><hr>
		<h3>회원정보 확인</h3><br>
		<b>아이디</b> : &nbsp;&nbsp; 	<%=id %>@naver.com<br><br>
		
		<b>이름</b>: &nbsp;&nbsp; 	<%=name %><br><br>
		
		<b>생년월일</b>: &nbsp;&nbsp; 	<%=birth_year %>년 &nbsp; <%=birth_mon %>월 &nbsp; <%=birth_day %>일<br><br>
		
		<b>성별</b>: &nbsp;&nbsp; 	<%=gender %><br><br>
		
		<b>본인 확인 이메일</b>: &nbsp;&nbsp; 	<%=email %><br><br>
		
		<b>휴대전화</b>: &nbsp;&nbsp; 	<%=phone %><br><br>
		
		<input type = "submit" value = "가입 완료"/>
		
	</body>
</html>