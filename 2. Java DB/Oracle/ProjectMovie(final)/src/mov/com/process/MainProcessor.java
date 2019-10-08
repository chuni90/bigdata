package mov.com.process;

import java.util.Scanner;

import mov.com.action.Action;
import mov.com.action.AddAccountAction;
import mov.com.action.AddAction;
import mov.com.action.InfoAction;
import mov.com.action.ModifyAction;
import mov.com.action.MyMovieAction;
import mov.com.action.RemoveAction;
import mov.com.action.Seat;
import mov.com.action.ShowAction;
import mov.com.action.ViewAction;
import mov.com.action.VoteAction;
import mov.com.action.VoteResult;
import mov.com.controller.FrontController;
import mov.com.util.ConsoleUtils;

public class MainProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;

		ConsoleUtils cu = new ConsoleUtils();
		FrontController fc = new FrontController();
		Action action = null;

		while (true) {
			menu = cu.showStart(sc);

			switch (menu) {
			case 1: {
				action = new AddAccountAction();
				break;
			}
			case 2: {
				if (cu.showLogin(sc).equals("admin")) {
					while (true) {

						menu = cu.showMenu(sc);
						// 사용자가 선택한 메뉴값에 의한 동작을 제어한다.
						switch (menu) {
						case 1: // 등록
							action = new AddAction(); // 다형성적인 표현
							break;
						case 2: // 수정
							action = new ModifyAction();
							break;
						case 3: // 삭제
							action = new RemoveAction();
							break;
						case 4: // 영화 검색
							action = new ViewAction();
							break;
						case 5: // 전체 영화정보 보기
							action = new ShowAction();
							break;
						case 6: // 회원 정보 보기
							action = new InfoAction();
							break;
						case 7: // 투표수
							action = new VoteResult();
							break;
						case 8: // 종료
							System.out.println("프로그램이 종료됩니다~");
							System.exit(0);
						default:
							System.out.println("선택 범위를 벗어났습니다.");
						}

						if (action != null)
							fc.process(action, sc);
					}
				} else {
					while (true) {

						menu = cu.showMenu1(sc);

						switch (menu) {
						case 1: // 영화 투표
							action = new VoteAction();
							break;
						case 2: // 영화 예약하기
							action = new Seat();
							break;
						case 3: // 투표 영화 보기
							action = new MyMovieAction();
							break;
						case 4:
							System.out.println("프로그램이 종료 됩니다~");
							System.exit(0);
						default:
							System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
						}

						if (action != null)
							fc.process(action, sc);
					}
				} // else
				// break;

			} // case 2
			case 3:
				System.out.println("프로그램이 종료 됩니다~");
				System.exit(0);
			}

			if (action != null)
				fc.process(action, sc);
		} // while
	}
}
