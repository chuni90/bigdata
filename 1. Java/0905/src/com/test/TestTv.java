package com.test;

public class TestTv {

	public static void main(String[] args) {
			
		Tv my = new Tv();
		
		my.power("��");
		my.status();
		
		Tv my2 = new Tv(false, 11);
		
//		my2.power("��");
		my2.status();
		
		
	}

}
