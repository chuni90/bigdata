<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// 자바 코드 입력
request.setCharacterEncoding("UTF-8");

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		String msg = (String) request.getAttribute("msg");
 		String id = (String) request.getAttribute("id");
 		String pass = (String) request.getAttribute("pass");
		%>
		<%
			if(id == null) {
				out.print(msg);
			}else {
				out.print("아이디: " + id + "<br>");
				out.print("패스워드: " + pass + "<br>");
			}
		%>
		
		
	</body>
</html>