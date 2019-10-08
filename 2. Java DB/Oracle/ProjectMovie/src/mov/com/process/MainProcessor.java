package mov.com.process;

import java.util.Scanner;

import mov.com.action.Action;
import mov.com.action.AddAction;
import mov.com.action.AddJoinAction;
import mov.com.action.ModifyAction;
import mov.com.action.RemoveAction;
import mov.com.action.ShowAction;
import mov.com.action.ViewAction;
import mov.com.controller.FrontController;
import mov.com.util.ConsoleUtils;

public class MainProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		ConsoleUtils cu = new ConsoleUtils();
		FrontController fc = new FrontController();
		Action action = null;
		String login =null;
		   
		   while(true) {
		      //제일기본창
		      menu = cu.showLogin0(sc);
		      
		      switch(menu) {
		      
		      case 1:
		         action = new  AddJoinAction();
		         break;
		      
		      case 2:
		      {System.out.print("아이디 = ");
		      String id = sc.nextLine();
		      
		      
		         if(id.equals("admin")) {
		            menu = cu.showMenu(sc);
		         }
		         cu.showMenu1(sc);
		         break;
		      }
		      
		      default: 
		         System.out.println("선택이 올바르지 않습니다");
		         
		      }
		   }
		   while(true) {
				menu = cu.showMenu(sc);
					// 사용자가 선택한 메뉴값에 의한 동작을 제어한다.
					switch(menu) {
					case 1 : // 등록
						action = new AddAction();  // 다형성적인 표현
						break;
					case 2 : // 수정
						action = new ModifyAction();
						break;
					case 3 : // 검색
						action = new ViewAction();
						break;
					case 4 : // 삭제
						action = new RemoveAction();
						break;
					case 5 : // 출력
						action = new ShowAction();
						break;
					case 6 : // 종료
						System.out.println("프로그램이 종료되었습니다.");
						System.exit(0);
					default : 
						System.out.println("선택 범위를 벗어났습니다.");
					}
					
					if(action != null) {
						fc.process(action, sc);
					}
			}
	}
}
		      