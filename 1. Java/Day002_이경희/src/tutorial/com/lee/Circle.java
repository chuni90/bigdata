package tutorial.com.lee;

import java.util.Scanner;

//반지름을 멤버로 갖고 있는 클래스 Circle
public class Circle extends Point{
	private int radius;
	//private Scanner sc;
	
	public Circle() {		
		super(); // Point() 생성자 호출, 생략가능
		System.out.print("radius = ");
		radius = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		super.disp();
		System.out.println("반지름(r) = " + radius); 
	}
}
