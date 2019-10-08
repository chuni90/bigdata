package mms.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mms.model.MemberDTO;
import mms.svc.MemberService;

@WebServlet("/add_member")
public class AddMemberServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 파라미터 조회
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		MemberDTO dto = new MemberDTO(id, pass, name, age);
		
		// 비즈니스 로직
		MemberService ms = new MemberService();
		ms.addMember(dto);
		String msg = "회원 가입이 완료되었습니다.";
		request.setAttribute("dto", dto);
		
		// 응답처리
		response.setContentType("UTF-8");
		RequestDispatcher rdp = request.getRequestDispatcher("/view/show_member.jsp");
		rdp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
