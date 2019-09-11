package com.test;

public class Test01 {
	
	private int testnum;
	
	public static void main(String[] args) {

		A obj = new A();
		//obj.num = 100;   //<-- private 변수라서  A클래스가 아닌 곳에선 접근 불가
		obj.num2 = 10;
		obj.num3 = 40;
		obj.num4 = 50;
		
		// Test01 클래스 내 testnum이라는 private속성을 생성하고 자기 클래스 내에서 사용이 가능한 모습
		Test01 t = new Test01();
		t.testnum = 99;
		
	}

}
