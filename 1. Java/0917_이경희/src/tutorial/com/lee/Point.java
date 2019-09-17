package tutorial.com.lee;

import java.util.Scanner;

//평면 위의 한 점을 추상화하는 클래스
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
		System.out.println("점(x, y) = (" + xpos + ", " + ypos +") ");
	}
}
