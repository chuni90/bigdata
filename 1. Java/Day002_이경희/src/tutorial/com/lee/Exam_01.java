package tutorial.com.lee;

import java.util.Scanner;

/*
 * 1�ܰ� : Ŭ���� ����
 * <�������>
 * 1.��  2.��  3.�簢��  4.����
 * ���� = 1
 * xpos = 5
 * ypos =  5
 * ��(x, y) = (5, 5)
 * 
 * 1.��  2.��  3.�簢��  4.����
 * ���� = 2
 * r = 10
 * ������(r) = 10
 * 
 * 1.��  2.��  3.�簢��  4.����
 * ���� = 3
 * w = 10
 * h = 7
 * �ʺ�(w) = 10, ����(h) = 7
 * */
public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("1.��  2.��  3.�簢��  4.����");
			System.out.print("���� = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // ��
				Point p = new Point(sc);
				p.disp();
				break;
			case 2: // ��
				Circle c = new Circle(sc);
				c.disp();
				break;
			case 3: // �簢��
				Rect r = new Rect(sc);
				r.disp();
				break;
			case 4: // ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
			}
		}
	}

}
