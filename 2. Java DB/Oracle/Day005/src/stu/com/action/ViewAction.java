package stu.com.action;

import java.util.Scanner;

import stu.com.svc.ViewService;
import stu.com.util.ConsoleUtils;
import stu.com.vo.StudentDTO;

public class ViewAction implements Action {

	@Override
	public void execute(Scanner sc) {
		/*
		 * 1. 검색 대상의 학번을 입력 받아 온다
		 */
		ConsoleUtils cu = new ConsoleUtils();
		String id = cu.getID(sc, "검색");
		
		// 2. 서비스 객체에 학번을 담아서 보낸다.
		// 해당 학번의 학생 객체를 돌려 받는다.
		ViewService viewsvc = new ViewService();
		StudentDTO dto = viewsvc.getStudent(id);
		
		/*
		 * 3. 반환 학생 객체가 존재한다면 출력하고, 아니면 해당 학번이 없는 것
		 */
		if(dto != null) {
			cu.view(dto);
		}else{
			cu.errorId();
			return;
		}
		
	}


}
