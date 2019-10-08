package tutorial_01;

import java.io.IOException;
import java.io.PrintWriter;   // 웹에다가 출력해주는 객체(내장되어 있으므로, 굳이 객체명이 필요하지 않음)

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	// 클라이언트와 서버는 기본적으로 요청(Request)와 응답(Response)로 구성되기 때문에 각 메소드의
	// 파라미터도 저 2개로 받아야 한다. 요청받은 파라미터와 되돌려줄 파라미터라고 생각하면 될 듯.
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
	// step1. 한글 인코딩으로 자료 처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");  // response 내 글자만 이렇게 처리하겠다 라는 의미
		
	// step2. 요청 파라미터 조회
		
	// step3. 비즈니스 로직 : 실제 처리할 내용을 기술하는 영역
		
	// step4. 응답 처리
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>처음 작성하는 서블릿 클래스</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("헬로우, 서블릿!!!<br>");
		out.print("</body>");
		out.print("</html>");
	}

}
