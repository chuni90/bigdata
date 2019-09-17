package tutorial.com.lee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4�ܰ�
 * ���� �־��� ����� ���Ŀ� �°� ���α׷��� �����Ͻÿ�.
 * <�� �������>
 * ����(1.��  2.�簢��  3.��������  4.����)
 * ���� = 1
 * x = 1
 * y = 1
 * r = 5
 * 
 * ����(1.��  2.�簢��  3.��������  4.����)
 * ���� = 2
 * x = 5
 * y = 5
 * h = 10
 * w = 7
 * 
 * ����(1.��  2.�簢��  3.��������  4.����)
 * ���� = 3
 * ��(x, y) = (1, 1)
 * ������(r) = 5
 * 
 * ��(x, y) = (5, 5)
 * �ʺ�(w) = 7, ����(h) = 10
 * 
 * ����(1.��  2.�簢��  3.��������  4.����)
 * ���� =
 * 
 * <ó������>
 * 1. 10���� ������ ��� �����Ѵ�.
 *    ��, ������ ���̵� �簢���̵� �������. �ݵ�� ������ ������ ���� 10�̾�� �Ѵ�.
 *    ��> �� 3, �簢�� 7 or �� 6, �簢�� 4
 * 2. ����ڰ� ���ϴ� ������ �߰��� �� �ֵ��� �����Ѵ�.
 * 3. ������ ����ڰ� ���ϸ� �������� �Է��� ������ ����Ͽ� �����ش�.
 * 4. ������ ���α׷��� ����� �� �ֵ��� �����Ѵ�.
 * 5. ��Ÿ ������ ���α׷� �帧�� �°� �����Ѵ�.
 * */

public class Exam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		Point[] mp = new Point[10];		// ��ü�迭		
		//List<Point> mpList = new ArrayList<Point>();
		
		for(int i = 0; i < mp.length; i++) {
			System.out.println("1.��  2.�簢��  3.��������  4.����");
			System.out.print("���� = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {			
			case 1: // ��
				mp[i] = new Circle();   // ���������� ǥ��							
				break;
			case 2: // �簢��
				mp[i] = new Rect();    // ���������� ǥ��				
				break;
			case 3: // ��������
				for(int j = 0; j < i; j++) {
					mp[j].disp();
					System.out.println();
				}
				i--;  // ������ �߰��� ���� �ƴϹǷ� ����ó��
				break;
			case 4: // ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
				i--;
			}			
		}
	}

}
