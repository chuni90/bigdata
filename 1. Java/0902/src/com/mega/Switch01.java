package com.mega;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score, result ;
				
		System.out.println("점수 입력");
		score = input.nextInt();
		
		//switch( ) 괄호 안에는 수식 자체가 들어가도 됨. score가 어차피 int type이라 결과도 int로 반환됨.
		switch(score / 10) {
		case 10 :						 // case 10은 어차피 '수'로 나오는 거니까 코드가 필요없음.
		case 9 : System.out.println("수"); break; // break가 없으면 밑에 case가 모두 반환되므로 반드시 넣어줌
		case 8 : System.out.println("우"); break;
		case 7 : System.out.println("미"); break;
		case 6 : System.out.println("양"); break;
		default : System.out.println("가");
		}		
	}

}
