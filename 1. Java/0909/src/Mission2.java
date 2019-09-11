import java.util.Random;
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		// 가위바위보 콘솔로 만들기
		
		String 가위 = "가위";
		String 바위 = "바위";
		String 보 = "보";
		String user_input;
		int com;
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			// 컴퓨터의 가위=0, 바위=1, 보=2 정하기
			Random r = new Random();
			com = r.nextInt(3);
			
			// 나의 가위, 바위, 보 입력하기
			System.out.println("가위, 바위, 보 중에서 하나를 입력하세요>> ");
			user_input = in.next();
			
			if (user_input.equals(가위)) {
				if (com == 0) {
					System.out.println("비김");
				}else if (com == 1) {
					System.out.println("짐");
				}else 
					System.out.println("이김");
			}else if (user_input.equals(바위)) {
				if (com == 0) {
					System.out.println("이김");
				}else if (com == 1) {
					System.out.println("비김");
				}else 
					System.out.println("짐");
			}else if (user_input.equals(보)) {
				if (com == 0) {
					System.out.println("짐");
				}else if (com == 1) {
					System.out.println("이김");
				}else 
					System.out.println("비김");
			}else if (user_input.equals("종료"))  //종료라고 입력하면 게임 끝
				break;
		}
		
		
			
		
	}

}
