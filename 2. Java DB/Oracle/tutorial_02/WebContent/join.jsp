<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
</head>
	<body>
	<font size="6" color="green">NAVER</font><br><br><hr>
	<form action="join_pro.jsp" method="post">
		
		<b>아이디</b></br>
		<input type="text" name="id" placeholder="@naver.com" required/><br><br>
		
		<b>비밀번호</b></br>
		<input type="password" name="password" required/><br><br>
		
		<b>비밀번호 재확인</b></br>
		<input type="password" name="password_re" required/><br><br>
		
		<b>이름</b></br>
		<input type="text" name="name"/><br><br>
		
		<b>생년월일</b><br><br>
		<input type="text" name="birth_year" placeholder="년(4자)"/>
		<select name="birth_mon">
			<option value="" selected disabled hidden>월</option>
			<option value = "1">1월</option>
			<option value = "2">2월</option>
			<option value = "3">3월</option>
			<option value = "4">4월</option>
			<option value = "5">5월</option>
			<option value = "6">6월</option>
			<option value = "7">7월</option>
			<option value = "8">8월</option>
			<option value = "9">9월</option>
			<option value = "10">10월</option>
			<option value = "11">11월</option>
			<option value = "12">12월</option>
		</select>
		<input type="text" name="birth_day" placeholder="일"/><br><br>
		
		<b>성별</b></br>
		<select  name = "gender">
			<option value = "man">man</option>
			<option value = "woman">woman</option>
		</select><br><br>
		
		<b>본인 확인 이메일</b><br><br>
		<input type="email" name="email" placeholder="선택 입력"/><br><br>
		
		<b>휴대전화</b><br><br>
		<select name="region">
			<option value ="Korea">Korea +82</option>
			<option value ="USA">United America</option>
			<option value ="China">China</option>
		</select><br><br>
		<input type="tel" name="phone" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" placeholder="전화번호 입력" required>
		<span>입력형식: 010-0000-0000</span>
		<button type="button" onclick="alert('입력하신 번호로 인증번호가 발송되었습니다.')">인증번호 받기!</button><br><br>
		<input type="text" placeholder="인증번호를 입력하세요"/><br><br>
			
		<input type = "submit" value = "가입하기"/>


	</form>
	</body>
</html>