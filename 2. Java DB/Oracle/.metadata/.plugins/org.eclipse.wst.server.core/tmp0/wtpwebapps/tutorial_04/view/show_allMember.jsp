<%@ page import="mms.model.MemberDTO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>전체 회원 출력</title>
	</head>
	<body>
		<h2>전체 회원 출력</h2><hr>
		
		<%
			ArrayList<MemberDTO> list =(ArrayList<MemberDTO>) request.getAttribute("list");
			
			
			/* MemberDTO dto = (MemberDTO) request.getAttribute("list").get(i); */			
			for(int i = 0; i<list.size(); i++) {
				MemberDTO dto = new MemberDTO(list.get(i).getId(), list.get(i).getPass(), list.get(i).getName(), list.get(i).getAge());
		%>
			<%=dto.toString() %><hr><br>		
		<% } %>  
			
	</body>
</html>