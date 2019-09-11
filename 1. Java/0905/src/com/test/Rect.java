package com.test;


/// 생성자를 생성자 안에서 호출하기 


public class Rect {

	private int x, y, width, height;
	
	public Rect() {
//		x=0;
//		y=0;
//		width = 1;
//		height = 1;
		this(0,0,1,1);  //3번 생성자를 호출하되 기본값을 부여한 형태
	}
	
	// 2번
	public Rect(int width, int height) {
//		x=0;
//		y=0;
//		this.width = width;
//		this.height = height;
		this(0, 0, width, height); //3번 생성자를 호출하되 기본값+파마리터를 부여한 형태
	}
	
	// 3번
	public Rect(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public String toString() {
		return x + ", " + y + ", " + width + ", " + height;
	}
	
}