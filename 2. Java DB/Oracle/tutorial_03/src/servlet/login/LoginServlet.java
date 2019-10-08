package servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1단계 요청 파라미터 조회
		request.setCharacterEncoding("UTF-8");
		
		String id = null;
		String pass = null;
		
		
		id = request.getParameter("id");
		pass = request.getParameter("pass");
		
		String msg = null;
		String url = null;
		
		
		//2단계 비즈니스 로직
		if(id == null && pass==null) {
			request.setAttribute("retMsg", "반드시 아디, 비번입력");
			url = "view/login.jsp";
		}else {
			if(id.equals("hong") && pass.equals("1234")) {
				request.setAttribute("id", id);
				request.setAttribute("pass", pass);
				url = "view/login_pro.jsp";
			}else {
				String errorMsg = "??졸려...";
				request.setAttribute("errorMsg", errorMsg);
				url = "view/login_pro/jsp";
					
			}
		}
		
		//3단계 응답 처리
		response.setContentType("text/html; charset = UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("<html><body>");
//		out.print(msg);
//		out.print("</body></html>");
		
		if (id == null || pass == null) {
			response.sendRedirect("view/login.jsp"); //이동만하고 data는 안 가져감
			
		} else {
		request.setAttribute("msg", msg);
		RequestDispatcher rdp = request.getRequestDispatcher("view/login_pro.jsp");
		rdp.forward(request, response);
		}
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
