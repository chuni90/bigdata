package tutorial.com.lee;

import java.util.Scanner;

/*
 * 1단계 : 클래스 구현
 * <출력형식>
 * 1.점  2.원  3.사각형  4.종료
 * 선택 = 1
 * xpos = 5
 * ypos =  5
 * 점(x, y) = (5, 5)
 * 
 * 1.점  2.원  3.사각형  4.종료
 * 선택 = 2
 * r = 10
 * 반지름(r) = 10
 * 
 * 1.점  2.원  3.사각형  4.종료
 * 선택 = 3
 * w = 10
 * h = 7
 * 너비(w) = 10, 높이(h) = 7
 * */
public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("1.점  2.원  3.사각형  4.종료");
			System.out.print("선택 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // 점
				Point p = new Point(sc);
				p.disp();
				break;
			case 2: // 원
				Circle c = new Circle(sc);
				c.disp();
				break;
			case 3: // 사각형
				Rect r = new Rect(sc);
				r.disp();
				break;
			case 4: // 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("선택이 올바르지 않습니다.");
			}
		}
	}

}
