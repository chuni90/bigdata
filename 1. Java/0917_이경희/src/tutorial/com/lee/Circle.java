package tutorial.com.lee;

import java.util.Scanner;

//�������� ����� ���� Ŭ���� Circle
public class Circle extends Point{
	private int radius;
	private Scanner sc;
	
	public Circle() {
		System.out.print("radius = ");
		radius = Integer.parseInt(sc.nextLine());
		System.out.println("������(r) = " + radius);
	}
	
	public void disp() {
		System.out.println("������(r) = " + radius);
	}
}