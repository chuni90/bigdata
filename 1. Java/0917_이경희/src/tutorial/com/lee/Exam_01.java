package tutorial.com.lee;

import java.util.Scanner;

class Mainmenu{
	public Mainmenu() {
		System.out.println("=== shape generator ===");
		System.out.println("����(1.��  2.�簢��  3.��������  4.����)");
		System.out.print("���� = ");
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
//			case 1: //��
//				Point p = new Point(sc);
//				p.disp();
//				break;
//			case 2: //��
//				Circle c = new Circle(sc);
//				c.disp();
//				break;
//			case 3: //�簢��
//				Rect r = new Rect(sc);
//				r.disp();
//				break;
//			case 4: // ����
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
			case 1: //��
				pList[i] = new Circle();
				break;
			case 2: //�簢��
				pList[i] = new Rect();
				break;
			case 3: //���� ����
				for(int j=0; j < i; j++) {
					System.out.println(pList[j]);
				}
			
			case 4: // ����
				System.out.println("Finish");
				System.exit(0);
			default:
				System.out.println("Plz, Correct number enter!");
			}
			
			
		}
	}

}
