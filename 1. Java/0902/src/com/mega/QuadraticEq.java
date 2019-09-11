package com.mega;

public class QuadraticEq {

	public static void main(String[] args) {
		double b = -3.0 ;
		double c = 2.0 ;
		
		double disc = b * b - 4.0 * c ;
		double sqr = Math.sqrt(disc);
		
		// 강제 형변환은 바로 뒤의 것에만 적용되므로 전체 코드 적용을 위해 아래처럼 (int) ( ) 괄호를 묶음.
		int math = (int) (Math.random()*1000);
		System.out.println("근은" + math);
		
		
		double r1 = (-b + sqr) / 2.0;
		double r2 = (-b - sqr) / 2.0;
		
		System.out.println("근은" + r1);
		System.out.println("근은" + r2);
		
	}

}
