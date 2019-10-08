package stu.com.action;

import java.util.ArrayList;
import java.util.Scanner;

import stu.com.svc.ShowService;
import stu.com.util.ConsoleUtils;
import stu.com.vo.StudentDAO;
import stu.com.vo.StudentDTO;

public class ShowAction implements Action {

	@Override
	public void execute(Scanner sc) {
		/*
		 * 전체 학생 정보를 불러온다.
		 */
		ShowService showsvc = new ShowService();
		ArrayList<StudentDTO> list = showsvc.selectAll();
		
		if(list == null) {
			System.out.println("등록된 학생정보가 존재하지 않습니다");
			return;
		}
		ConsoleUtils cu = new ConsoleUtils();
		cu.show(list);
		
	}

}
