package tutorial.com.lee;

import java.util.Scanner;


public class Figure {
	// �ʵ�
	public int x, y, r, h, w;

	protected Figure(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		System.out.println("��");
	}
	
	protected Figure(int x, int y, int h, int w) {
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
		System.out.println("�簢��");
	}
	
	protected void getFigure() {
		
	}
	
}
