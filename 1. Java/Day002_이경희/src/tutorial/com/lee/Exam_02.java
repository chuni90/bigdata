package tutorial.com.lee;

import java.util.Scanner;

/*
 * 2단계 입출력형식
 * 도형(1.원  2.사각형  3.종료) = 1
 * xpos = 5
 * ypos = 5
 * radius = 10
 * 점(x, y) = (5, 5)
 * 반지름(r) = 10
 * 
 * 도형(1.원  2.사각형  3.종료) = 2
 * xpos = 5
 * ypos = 5
 * w = 10
 * h = 7
 * 점(x, y) = (5, 5)
 * 너비(w) = 10, 높이(h) = 7
 * */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("1.원  2.사각형  3.종료");
			System.out.print("선택 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {			
			case 1: // 원
				MyCircle c = new MyCircle();
				c.input();
				c.output();
				break;
			case 2: // 사각형
				MyRect r = new MyRect();
				r.input();
				r.output();
				break;
			case 3: // 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("선택이 올바르지 않습니다.");
			}
		}
	}
}