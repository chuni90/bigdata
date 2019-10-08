package stu.com.process;

import java.util.Scanner;

import stu.com.action.Action;
import stu.com.action.AddAction;
import stu.com.action.ModifyAction;
import stu.com.action.RemoveAction;
import stu.com.action.ShowAction;
import stu.com.action.ViewAction;
import stu.com.controller.FrontController;
import stu.com.util.ConsoleUtils;

public class MainProcessor {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		ConsoleUtils cu = new ConsoleUtils();
		FrontController fc = new FrontController();  // 클래스
		Action action = null;  		// 인터페이스
		
		
		while (true) {
			menu = cu.showMenu(sc);
			
			// 사용자가 선택한 메뉴값에 따라 동작을 제어함
			switch(menu) {
			case 1: //정보 등록
				action = new AddAction();  // 다형성적인 표현(부모객체에 자식객체를 넣어서 사용)
				break;
			case 2:  //정보 수정
				action = new ModifyAction();
				break;
			case 3: // 정보 출력
				action = new ViewAction();
				break;
			case 4: // 학생 정보 삭제
				action = new RemoveAction();
				break;
			case 5: // 전체 학생 출력
				action = new ShowAction();
				break;
			case 6: // 종료
				System.out.println("Program finished..BYE :D ");
				System.exit(0);
			default:
				System.out.println("You entered wrong number");
			}
			
			if(action != null) {
				fc.process(action, sc);
			}
		
		}
		
	}
}


