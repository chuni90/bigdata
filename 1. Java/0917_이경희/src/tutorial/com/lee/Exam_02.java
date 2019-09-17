package tutorial.com.lee;

import java.util.Scanner;

/*
 * 2단계 입출력 형식
 * 도형(1.원  2.사각형  3.종료) = 1
 * xpos = 5
 * ypos = 5
 * (x, y) = (5,5)
 * 반지름 = 10
 * 
 * 도형(1.원  2.사각형  3.종료) = 2
 * xpos = 5
 * ypos = 5
 * w = 10
 * h = 7
 * (x, y) = (5,5)
 * 너비  = 10 , 높이 = 7
 */

class Mainmenu2{
	public Mainmenu2() {
		System.out.println("=== shape generator ===");
		System.out.print("도형 (1.원   | 2.사각형   | 3.종료)");
		System.out.print("= ");
	}
	
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu= 0;
		
		do {
			new Mainmenu2();
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: //원
				MyCircle c = new MyCircle();
				c.input();
				c.output();
				break;
			case 2: //사각형
				MyRect r = new MyRect();
				r.input();
				r.output();
				break;
			case 3: // 종료
				System.out.println("Finish");
				System.exit(0);
			default:
				System.out.println("Plz, Correct number enter!");
			}
		}while(true);
		
	}

}
