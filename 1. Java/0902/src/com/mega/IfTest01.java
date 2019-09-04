package com.mega;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		int num;
		
//		System.out.println("enter the number below");
//		num = input.nextInt();
		
		//조건식
//		if(num > 0)	{
//			System.out.println("plus");
//		}else {
//			System.out.println("zero or minus");
//		}

		//60점 이상이면 합격
//		int score;
//		System.out.println("enter the score below");
//		score = input.nextInt();
//		
//		if(score >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		//홀짝 판별
//		if (num % 2 == 0) {
//			System.out.println("짝");
//			
//		}else {
//			System.out.println("홀");
//		}
		
		// 두 정수 중 큰 수 출력
//		int a1, a2;
//		
//		Scanner big = new Scanner(System.in);
//		System.out.println("enter the 1st number");
//		a1 = big.nextInt();
//		
//
//		System.out.println("enter the 2nd number");
//		a2 = big.nextInt();
//		
//		if (a1 > a2) {
//			System.out.println("a1 is greater");
//		}else {
//			System.out.println("a2 is greater");

		// 성과급 계산
		double sales, bonus, target ;
		target = 1000;
		
		Scanner amount = new Scanner(System.in);
		System.out.println("실적 입력해");
		sales = amount.nextDouble();
		
		if (sales > target) {
			System.out.println("축하해 보너스여");
			bonus = (sales - target) * 0.1;
					
		}else {
			System.out.println("다음에 잘하자");
			bonus = 0.;
		}
		
		System.out.println("bonus는 " + bonus + "만원");
		
	}

}
