package com.mega;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력:");
		num = input.nextInt();
		
		switch (num) {
		case 1 : System.out.println("one"); break;
		case 2 : System.out.println("two"); break;
		default : System.out.println("none");
		
		}
	}
}
