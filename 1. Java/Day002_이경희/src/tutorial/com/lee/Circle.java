package tutorial.com.lee;

import java.util.Scanner;

//�������� ����� ���� �ִ� Ŭ���� Circle
public class Circle extends Point{
	private int radius;
	//private Scanner sc;
	
	public Circle() {		
		super(); // Point() ������ ȣ��, ��������
		System.out.print("radius = ");
		radius = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		super.disp();
		System.out.println("������(r) = " + radius); 
	}
}
