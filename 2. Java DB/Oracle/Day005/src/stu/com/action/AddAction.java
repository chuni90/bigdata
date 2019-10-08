package stu.com.action;

import java.util.Scanner;

import stu.com.svc.AddService;
import stu.com.util.ConsoleUtils;
import stu.com.vo.StudentDTO;

public class AddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		/*
		 * 학생 정보를 등록하는 액션
		 * 1. 등록할 안내문을 출력해야 그게 맞게 등록 가능
		 * 2. 입력받은 정보를 객체화시키는 작업을 한다. (서비스에 보내기 위해서)
		 * 3. 객체를 서비스 클래스로 보낸다. (실제 DB에 담는 것은 서비스가 하니까)
		 * 4. 등록성공여부를 보여준다.
		 */
		
		ConsoleUtils cu = new ConsoleUtils();
		StudentDTO dto = null;
		dto = cu.make(sc);
		
		AddService addsvc = new AddService();
		boolean check = addsvc.add(dto);
		
		if(check) {
			cu.addSuccess();
		}else { 
			cu.addFail();
	
		}
	}
}
