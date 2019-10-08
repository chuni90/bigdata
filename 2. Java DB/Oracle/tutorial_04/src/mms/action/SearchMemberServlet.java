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

@WebServlet("/search")
public class SearchMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchMemberServlet() {

    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		// 요청 파라미터 조회
			request.setCharacterEncoding("UTF-8");
			String id = request.getParameter("id");
			
		// 비즈니스 로직
			MemberService ms = new MemberService();
			MemberDTO dto = null;
			
			dto = ms.searchMemberById(id);
			request.setAttribute("dto", dto);
			
		// 응답 처리
			response.setContentType("text/html; charset = UTF-8");
			RequestDispatcher rdp = request.getRequestDispatcher("/view/show_member.jsp");
			rdp.forward(request, response);
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
