package stu.com.action;

import java.util.Scanner;

import stu.com.svc.ModifyService;
import stu.com.util.ConsoleUtils;
import stu.com.vo.StudentDTO;

public class ModifyAction implements Action {

	@Override
	public void execute(Scanner sc) {
		/*
		 * 학번을 입력받아 해당 학생의 정보를 수정하는 작업 액션
		 * 1. 수정할 학번을 입력
		 */
		
		ConsoleUtils cu = new ConsoleUtils();
		String id = cu.getID(sc, "수정");
		
		/* 2. 학번을 서비스 객체에 넘겨준다.
		 * 서비스 객체가 넘겨준 학생 객체를 담는다.
		 */
		ModifyService modifysvc = new ModifyService();
		StudentDTO oldStudent = modifysvc.getStudent(id);
		
		/*
		 *  3. 기존 학생정보를 보여주고 새로운 학생정보를 얻어온다.
		 *  이때 기존 학생 정보의 값이 비어있다면 해당 학번은 존재하지 않는 것이다. 
		 */
		if(oldStudent == null) {
			// oldStudent 객체가 null 이라면 해당 학번이 없다는 의미
			// 그래서 ConsoleUtils의 errorId메서드 호출
			cu.errorId();
			return;
		}
		
		StudentDTO newStudent = cu.newStudent(sc, oldStudent);
		/*
		 * 4. 수정된 학생 객체를 서비스 객체에 넘겨준다
		 * 수정의 성공여부를 리턴받아 처리한다.
		 */
				
		boolean update = modifysvc.update(newStudent);
		if(update) {
			// 수정 성공
			cu.updateSuccess();
		}else {
			// 수정 실패
			cu.updateFail();
		}
		
		
	}

}
