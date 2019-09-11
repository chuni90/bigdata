package com.mega;

public class Test05 {
// 클래스 안에서 선언되는 변수는 Global variable(전역 변수)
// public을 변수명 앞에다가 붙이면 다른 클래스에서 사용이 가능함
public int a;   

// 위 a는 동일한 패키지 내 다른 클래스에서 Test05.a (클래스명.변수명)으로 사용이 가능함

	
	public static void main(String[] args) {
		// 메소드 안에서 선언되는 변수는 Local variable(로컬 변수) 
		boolean b ;
		
		b = true ;
		System.out.println("1) b : " + b);
		
		b = ( 1 > 2 );
		System.out.println("2) b : " + b);
		
		
	}

}
