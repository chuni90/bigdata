<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	오류가 발생함 . 관리자 한테<br>
	오류 : <br>
	<%
	String errorMsg = (String) request.getAttribute("errorMsg");
		if(errorMsg == null ){
	%>
	<%=errorMsg %>
	<%}else {%>
		Checked well..No ERROR
	<%} %>
</body>
</html>