package tutorial.com.lee;

import java.util.Scanner;

/*
 * 2�ܰ� ���������
 * ����(1.��  2.�簢��  3.����) = 1
 * xpos = 5
 * ypos = 5
 * radius = 10
 * ��(x, y) = (5, 5)
 * ������(r) = 10
 * 
 * ����(1.��  2.�簢��  3.����) = 2
 * xpos = 5
 * ypos = 5
 * w = 10
 * h = 7
 * ��(x, y) = (5, 5)
 * �ʺ�(w) = 10, ����(h) = 7
 * */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println("1.��  2.�簢��  3.����");
			System.out.print("���� = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {			
			case 1: // ��
				MyCircle c = new MyCircle();
				c.input();
				c.output();
				break;
			case 2: // �簢��
				MyRect r = new MyRect();
				r.input();
				r.output();
				break;
			case 3: // ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
			}
		}
	}
}