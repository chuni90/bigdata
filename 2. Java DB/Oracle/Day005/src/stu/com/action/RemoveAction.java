package stu.com.action;

import java.util.Scanner;

import stu.com.svc.RemoveService;
import stu.com.util.ConsoleUtils;
import stu.com.vo.StudentDTO;

public class RemoveAction implements Action {

	@Override
	public void execute(Scanner sc) {
		/*
		 * 1. 삭제할 학번을 가져온다
		 */
		ConsoleUtils cu = new ConsoleUtils();
		String id = cu.getID(sc, "삭제");
		
		// 2. 가져온 학번으로 학생이 있는지 없는지 

		RemoveService removesvc = new RemoveService();
		StudentDTO oldStudent = removesvc.getStudent(id);
		
		/*
		 *  3. 기존 학생정보를 보여주고 새로운 학생정보를 얻어온다.
		 *  이때 기존 학생 정보의 값이 비어있다면 해당 학번은 존재하지 않는 것이다. 
		 */
		if(oldStudent == null) {
			cu.errorId();
			return;
		}
		
		// 4. 학생을 지운 행위에 대한 결과값을 서비스에서 받아서 출력
		if (removesvc.delete(id)) {
			cu.removeSuccess(id);
		}else 
			cu.removeFail(id);
	}

}
