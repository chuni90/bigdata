<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% // java code 영역
		int num1 = 0, num2 = 0, operator =0 ;
		String op = null;
		request.setCharacterEncoding("UTF-8");
		
		try{
			num1 = Integer.parseInt(request.getParameter("num1"));  //요청된 파라미터를 받아와서 INT로 parsing함.
			num2 = Integer.parseInt(request.getParameter("num2"));
			
			op = request.getParameter("op");
			
			if (op.equals("+")) {
				operator = num1 + num2;
			}else if (op.equals("-")){
				operator = num1 - num2;			
			}else if (op.equals("*")) {
				operator = num1 * num2;
			}else {
				operator = num1 / num2;
			}
			
		}catch(NumberFormatException e){
			out.print("숫자로 표현할 수 없는 데이터를 입력하셨습니다.");
		}finally{
			
		}
		
		
		
		%>
		<%=num1 %> &nbsp; <%=op %> &nbsp; <%=num2 %> = <%=operator %>		
	</body>
</html>