<!-- 아래는 선언문 형식이며, 초록색 글씨인 'page'를 붙여서 page directive라고 함. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <!-- Static으로 하는 영역-->
<%! %>

<!-- java code 영역  -->
<% %>

<!-- 자바의 print와 같은 영역 -->
<%=	 %> --%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Welcome to JSP page.<br>
<!-- 		1<br>
		2<br>
		3<br>
		4<br>
		5<br>
		6<br>
		7<br>
		8<br>
		9<br>
		10<br> -->
		
		<% 
		for(int i = 1; i<=10; i++){
			/* System.out.println(i); System.out은 콘솔 출력 명령어라서 webpage가 아니라 콘솔창에 출력됨 */
		%>
		<%=i + "왓" %><br>
		<%} %>
	</body>
</html>