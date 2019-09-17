package tutorial.com.lee;

import java.util.Scanner;

//너비와 높이를 멤버로 갖고 있는 클래스 Rect
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
		System.out.println("너비(w) = " + width + " , 높이(h) = " + height);
	}
}
