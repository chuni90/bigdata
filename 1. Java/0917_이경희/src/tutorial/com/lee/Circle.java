package tutorial.com.lee;

import java.util.Scanner;

//반지름을 멤버로 가진 클래스 Circle
public class Circle extends Point{
	private int radius;
	private Scanner sc;
	
	public Circle() {
		System.out.print("radius = ");
		radius = Integer.parseInt(sc.nextLine());
		System.out.println("반지름(r) = " + radius);
	}
	
	public void disp() {
		System.out.println("반지름(r) = " + radius);
	}
}