package com.test;


/// �����ڸ� ������ �ȿ��� ȣ���ϱ� 


public class Rect {

	private int x, y, width, height;
	
	public Rect() {
//		x=0;
//		y=0;
//		width = 1;
//		height = 1;
		this(0,0,1,1);  //3�� �����ڸ� ȣ���ϵ� �⺻���� �ο��� ����
	}
	
	// 2��
	public Rect(int width, int height) {
//		x=0;
//		y=0;
//		this.width = width;
//		this.height = height;
		this(0, 0, width, height); //3�� �����ڸ� ȣ���ϵ� �⺻��+�ĸ����͸� �ο��� ����
	}
	
	// 3��
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