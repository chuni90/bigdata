package tutorial.com.lee;

import java.util.Scanner;

public class Point2 {
	private int xpos, ypos;
	protected Scanner sc;
	
	public Point2(Scanner sc) {
		this.sc = sc;
		System.out.print("xpos = ");
		xpos = Integer.parseInt(sc.nextLine());
		System.out.print("ypos = ");
		ypos = Integer.parseInt(sc.nextLine());
	}

	public void disp() {
		System.out.println("Á¡(x, y) = (" + xpos + ", " + ypos +") ");
	}
}
