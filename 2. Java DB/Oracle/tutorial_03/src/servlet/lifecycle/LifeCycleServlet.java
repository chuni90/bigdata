package servlet.lifecycle;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿 규약서
 * 1. 사용자가 만든 서블릿파일은 HttpServlet 클래스를 상속받아 구현한다.
 * 2. doGet()과 doPost()를 오버라이딩 한다.
 * 3. 모든 서블릿 클래스가 서블릿이 되는 것은 아니며, 반드시 서블링 등록(매핑)해야 한다. 
 * 
 *   아래의 LifeCycle을 이해해야 어떤 메서드나 변수를 어디 순서에 넣어야할 지 명확하게 진행할 수 있다.
 */

public class LifeCycleServlet extends HttpServlet{
	
	// 생성자 메서드 : 객체가 생성될 때 호출되는 메서드
	public LifeCycleServlet() {
		System.out.println("LifeCycleServlet 객체 생성");
	}
	
	// init(): 객체 생성 직후 호출
	public void init() {
		System.out.println("LifeCycleServlet.init() 메서드 실행");
		
	}
	
	// destroy() : 객체 소멸 직전에 호출
	public void destroy() {
		System.out.println("LifeCycleServlet destroy() 메서드 실행");
	}
	
	//service() => doGet() or doPost()로 사용 : 클라이언트 요청이 들어올 때마다 호출되는 메서드
	public void doGet (HttpServletRequest request, HttpServletResponse response) {
		System.out.println("LifeCycleServlet doGet() 메서드 실행");
		
	}

}
