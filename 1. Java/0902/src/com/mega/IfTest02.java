package com.mega;

import java.util.Date;
import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// 수우미양가 구하기
//		int score;
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("점수를 입력하시오");
//		score = in.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("수");
//		}else if(score >= 80) {
//			System.out.println("우");
//		}else if(score>= 70) {
//			System.out.println("미");
//		}else if(score>=60) {
//			System.out.println("양");
//		}else {
//			System.out.println("가");
//		}
		
		// 아침인사 프로그램
		
		int time ;
		
		Scanner intime = new Scanner(System.in);
		System.out.println("현재 몇 시?");
		time = intime.nextInt();
		
//		if (time < 12) {
//			System.out.println("morning");
//		}else if (time < 17) {
//			System.out.println("afternoon");
//		}else {
//			System.out.println("night");
//		}	
		
		if (time < 12) System.out.println("morning");
		else if (time < 17) System.out.println("afternoon");
		else System.out.println("night");		
		
		// Date 패키지로부터 현재 시간 가져옴.
		Date date = new Date();
		int currentHour = date.getHours();
		int currentMin = date.getMinutes();
		System.out.println(currentHour+":"+currentMin);
	}

}
