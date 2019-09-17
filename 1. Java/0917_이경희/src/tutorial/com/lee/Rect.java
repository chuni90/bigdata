package tutorial.com.lee;

import java.util.Scanner;
//너비와 높이를 멤버로 가진 클래스 Rect

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
		System.out.println("높이 = " + h + ", 너비 = " + w);
	}
}
