package tutorial.com.lee;

import java.util.Scanner;

class Mainmenu{
	public Mainmenu() {
		System.out.println("=== shape generator ===");
		System.out.println("도형(1.원  2.사각형  3.도형보기  4.종료)");
		System.out.print("선택 = ");
	}
	
}


public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu= 0;
		
//		do {
//			new Mainmenu();
//			menu = Integer.parseInt(sc.nextLine());
//			
//			switch(menu) {
//			case 1: //점
//				Point p = new Point(sc);
//				p.disp();
//				break;
//			case 2: //원
//				Circle c = new Circle(sc);
//				c.disp();
//				break;
//			case 3: //사각형
//				Rect r = new Rect(sc);
//				r.disp();
//				break;
//			case 4: // 종료
//				System.out.println("Finish");
//				System.exit(0);
//			default:
//				System.out.println("Plz, Correct number enter!");
//			}
//		}while(true);
//		
		Point[] pList = new Point[10];
		
		for(int i = 0; i <pList.length; i+=1) {
			new Mainmenu();
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: //원
				pList[i] = new Circle();
				break;
			case 2: //사각형
				pList[i] = new Rect();
				break;
			case 3: //도형 보기
				for(int j=0; j < i; j++) {
					System.out.println(pList[j]);
				}
			
			case 4: // 종료
				System.out.println("Finish");
				System.exit(0);
			default:
				System.out.println("Plz, Correct number enter!");
			}
			
			
		}
	}

}
