package tutorial.com.lee;

import java.util.Scanner;

public class Rect2 extends Point2 {
	private int height, width;
	
	public Rect2() {
		System.out.print("height = ");
		height = Integer.parseInt(sc.nextLine());
		System.out.print("width = ");
		width = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		super.disp();
		System.out.println("높이 = " + height + ", 너비 = " + width);
	}
}
