

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		int w, h, a, b;
		int sum  = 0 ;
		int sum2  = 0 ;
		
		// �Է¹޴� Ŭ���� ����
		// ctrl + shift + O �� ���� �ʿ��� ��Ű�� �ڵ����� ���� ����(import�� �� �Ǿ��ִµ� ����� �ڵ�� �ۼ��Ǿ��� ��)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���θ� �Է��ϼ���>> ");
		w = input.nextInt();
		
		System.out.println("���θ� �Է��ϼ���>> ");
		h = input.nextInt();
		
		sum = w * h;
		System.out.println("���̴� " + sum);
		
// --------------------------------------------------------
		
		System.out.println("--------sum----------");
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("1st number enter..>");
		a = input1.nextInt();
		
		System.out.println("2nd number enter..>");
		b = input1.nextInt();
		
		sum2 = a + b;
		System.out.println("�հ�� "+sum2);
		
// --------------------------------------------------------

		System.out.println("--------���� ����----------");
		
		double r;
		
		Scanner circle = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(�Ǽ� ����) >>");
		r = circle.nextDouble();
		
		System.out.println(3.14 * r * r);
		
	}

}
