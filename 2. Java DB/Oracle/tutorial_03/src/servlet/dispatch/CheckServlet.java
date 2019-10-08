package servlet.dispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/direct")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 파라미터 조회
		request.setCharacterEncoding("UTF-8");
		String choose = request.getParameter("choose");
		
		// 비즈니스 로직
		if(choose == null) {
			String errorMsg = "You don't select checkbox";
			request.setAttribute("errorMsg", errorMsg);
//			response.sendRedirect("/tutorial_03/view/error.jsp"); // 
//			RequestDispatcher rdp = request.getRequestDispatcher("/view/error.jsp");
//			rdp.forward(request, response);
		
		}else {
			String errorMsg = "Select checkbox well";
			request.setAttribute("errorMsg", errorMsg);
		}
		RequestDispatcher rdp = request.getRequestDispatcher("/view/error.jsp");
		rdp.forward(request, response);

		
		// 응답처리
		response.setContentType("text/html; charset = UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("<html><body>");
//		out.print("checkbox was choosen by user." + choose);
//		out.print("</body></html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
