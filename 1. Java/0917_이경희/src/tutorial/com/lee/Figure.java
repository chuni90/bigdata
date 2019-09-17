package tutorial.com.lee;

import java.util.Scanner;


public class Figure {
	// 필드
	public int x, y, r, h, w;

	protected Figure(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		System.out.println("원");
	}
	
	protected Figure(int x, int y, int h, int w) {
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
		System.out.println("사각형");
	}
	
	protected void getFigure() {
		
	}
	
}
