package tutorial.com.lee;

import java.util.Scanner;

//�ʺ�� ���̸� ����� ���� �ִ� Ŭ���� Rect
public class Rect extends Point{
	private int width;
	private int height;
	//private Scanner sc;
	
	public Rect() {	
		super(); // Point()
		System.out.print("w = ");
		width = Integer.parseInt(sc.nextLine());
		System.out.print("h = ");
		height = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		super.disp();
		System.out.println("�ʺ�(w) = " + width + " , ����(h) = " + height);
	}
}
