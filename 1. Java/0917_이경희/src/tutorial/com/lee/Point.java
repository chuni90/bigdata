package tutorial.com.lee;

import java.util.Scanner;

//��� ���� �� ���� �߻�ȭ�ϴ� Ŭ����
public class Point{
	private int xpos, ypos;
	private Scanner sc;
	
	public Point() {
		System.out.print("xpos = ");
		xpos = Integer.parseInt(sc.nextLine());
		System.out.print("ypos = ");
		ypos = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		System.out.println("��(x, y) = (" + xpos + ", " + ypos +") ");
	}
}
