package mms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mms.model.MemberDTO;
import mms.svc.MemberService;

@WebServlet("/all_member")
public class ShowAllMemberServlet extends HttpServlet {
       
    public ShowAllMemberServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 요청 파라
		request.setCharacterEncoding("UTF-8");
		
		// 비즈니스 로직
		MemberService ms = new MemberService();
		ArrayList<MemberDTO> list = null;
		list = ms.showAllMember();
		request.setAttribute("list", list);
		
		
		// 응답 처리
		response.setContentType("text/html; charset = UTF-8");
		RequestDispatcher rdp = request.getRequestDispatcher("/view/show_allMember.jsp");
		rdp.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
