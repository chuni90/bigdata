package tutorial.com.lee;

import java.util.Scanner;
//�ʺ�� ���̸� ����� ���� Ŭ���� Rect

public class Rect exteds{
	private int h, w;
	private Scanner sc;
	
	public Rect() {
		System.out.print("height = ");
		h = Integer.parseInt(sc.nextLine());
		System.out.print("width = ");
		w = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		System.out.println("���� = " + h + ", �ʺ� = " + w);
	}
}
