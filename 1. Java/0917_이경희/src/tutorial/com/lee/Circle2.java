package tutorial.com.lee;

import java.util.Scanner;

public class Circle2 extends Point2{
	private int radius;
	
	public Circle2() {
		System.out.print("radius = ");
		radius = Integer.parseInt(super.sc.nextLine());
	}
		
	@Override
	public void disp() {
		super.disp();
		System.out.println("¹ÝÁö¸§(r) = " + radius);
	}
	
}
