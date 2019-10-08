package servlet.lifecycle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountServlet
 */
@WebServlet("/count")    // <-- 왼쪽 것이 xml의 매핑과정을 다 의미하는 것으로서 지우면 안 됨!!
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// 멤버필드
	// 일반적으로 파일 송수신에선 파일을 byte 타입으로 변환(손실 최소화)해서 보내고 받음. 그래서 받은 이후에 data로 다시 변환해줘야함.
	// byte의 파일 입구/출구를 생성
	private int visitCount;
	private FileInputStream fin = null;
	private FileOutputStream fout = null;
	
	// visit count를 저장할 data 파일 경로 생성
	private String cf = "C:\\Users\\meganext\\Desktop\\Chun\\Oracle\\data\\counter.dat";
	
	
	// 객체 생성 직후 호출되는 메서드
	public void init() {
		// 파일에 저장된 방문자 수를 읽어오는 작업을 수행한다.
		// byte를 data로 변환할 객체 생성 후, 삽입 작업
		DataInputStream dis = null;
		
		try {
			fin = new FileInputStream(cf);
			dis = new DataInputStream(fin);
			visitCount = dis.readInt();
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 객체 소멸 직후 호출되는 메서드
	public void destroy() {
		// 방문자 수를 파일에 출력하는 작업을 수행한다.
		DataOutputStream dos = null;
		
		try {
			fout = new FileOutputStream(cf);
			dos = new DataOutputStream(fout);
			dos.writeInt(visitCount);
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 방문자가 있을 때마다 방문객 수를 누적하여 웹상에 출력한다. 
		
		// 1단계 : 요청 파라미터 조회
		request.setCharacterEncoding("UTF-8"); // 한글 처리
		
		// 2단계 : 비즈니스 로직
		visitCount += 1;
		
		// 3단계 : 응답 처리
		response.setContentType("text/html; Charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>방문객 수 출력화면</title></head><body>");
		out.print("<br>당신은 " + visitCount + "번째 방문객입니다.<br></body></html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
	}

}
