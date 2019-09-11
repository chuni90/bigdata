package com.test;

public class TimeMain {
	private int hour, min, sec;
	
	public TimeMain() {
//		hour = 9;
//		min = 15;
//		sec = 33;
		this(9, 15, 33);
	}
	
	public TimeMain(int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}
	
	@Override
	public String toString() {
		return "���� �ð��� " + hour + "�� " + min+ "�� " + sec+ "�� �Դϴ�.";
	}
	
	public static void main(String[] args) {
		
		TimeMain tic = new TimeMain(6,3,22);
		System.out.println(tic);
		
		TimeMain tic2 = new TimeMain();
		System.out.println(tic2);
		
	}

}
