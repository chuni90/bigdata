<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action = "add_pro.jsp" method = "post"> <!-- method의 default는 get 방식이며, post로 할 경우 URL에서 쿼리가 안 보임-->
			1st num : <input name = "num1" type = "text"/><br>
			2nd num : <input name = "num2" type = "text"/><br>
			연산자 : &nbsp;&nbsp;&nbsp;
			<input type = "radio" name = "op" value = "+" checked> + 더하기&nbsp;  <!-- checked는 미리 선택된 것 -->
			<input type = "radio" name = "op" value = "-"> - 빼기&nbsp;
			<input type = "radio" name = "op" value = "*"> ×&nbsp;
			<input type = "radio" name = "op" value = "/"> ÷&nbsp;<br>
			
			<input type = "submit" value = "계산하기"/>
			
			<select name="cars" size="1">  <!-- size는 처음에 보여줄 개수 -->
			    <option value="volvo">Volvo</option>
			    <option value="saab">Saab</option>
			    <option value="fiat">Fiat</option>
			    <option value="audi" selected>Audi</option>  <!-- selected는 초기 선택값 지정 -->
		  	</select>	
			
		</form>
	
	</body>
</html>