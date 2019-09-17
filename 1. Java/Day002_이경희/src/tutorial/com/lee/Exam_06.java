package tutorial.com.lee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4단계
 * 다음 주어진 입출력 형식에 맞게 프로그램을 구현하시오.
 * <입 출력형식>
 * 도형(1.원  2.사각형  3.도형보기  4.종료)
 * 선택 = 1
 * x = 1
 * y = 1
 * r = 5
 * 
 * 도형(1.원  2.사각형  3.도형보기  4.종료)
 * 선택 = 2
 * x = 5
 * y = 5
 * h = 10
 * w = 7
 * 
 * 도형(1.원  2.사각형  3.도형보기  4.종료)
 * 선택 = 3
 * 점(x, y) = (1, 1)
 * 반지름(r) = 5
 * 
 * 점(x, y) = (5, 5)
 * 너비(w) = 7, 높이(h) = 10
 * 
 * 도형(1.원  2.사각형  3.도형보기  4.종료)
 * 선택 =
 * 
 * <처리조건>
 * 1. 10개의 도형만 담아 관리한다.
 *    단, 도형이 원이든 사각형이든 상관없다. 반드시 도형의 개수의 합은 10이어야 한다.
 *    예> 원 3, 사각형 7 or 원 6, 사각형 4
 * 2. 사용자가 원하는 도형을 추가할 수 있도록 구현한다.
 * 3. 언제든 사용자가 원하면 이전까지 입력한 도형을 출력하여 보여준다.
 * 4. 언제든 프로그램이 종료될 수 있도록 구현한다.
 * 5. 기타 조건은 프로그램 흐름에 맞게 구현한다.
 * */

public class Exam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		Point[] mp = new Point[10];		// 객체배열		
		//List<Point> mpList = new ArrayList<Point>();
		
		for(int i = 0; i < mp.length; i++) {
			System.out.println("1.원  2.사각형  3.도형보기  4.종료");
			System.out.print("선택 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {			
			case 1: // 원
				mp[i] = new Circle();   // 다형성적인 표현							
				break;
			case 2: // 사각형
				mp[i] = new Rect();    // 다형성적인 표현				
				break;
			case 3: // 도형보기
				for(int j = 0; j < i; j++) {
					mp[j].disp();
					System.out.println();
				}
				i--;  // 도형이 추가된 것이 아니므로 차감처리
				break;
			case 4: // 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("선택이 올바르지 않습니다.");
				i--;
			}			
		}
	}

}
