<%@ page import="mms.model.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원조회 결과</title>
	</head>
	<body>
		<h2>회원조회 결과</h2><hr>
		<%
			MemberDTO dto = (MemberDTO) request.getAttribute("dto");
			if(dto != null){
		%>
			조회 결과<br>
			아이디 : <%=dto.getId() %><br>
			비밀번호 : <%=dto.getPass() %><br>
			이름 : <%=dto.getName() %><br>
			나이 : <%=dto.getAge() %>
		<%}else { %>
			<font color = "blue" size="6">입력하신 회원의 정보는 존재하지 않습니다.</font>
		<%}%>
	</body>
</html>