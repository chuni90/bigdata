package com.mega;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		int num;
		
//		System.out.println("enter the number below");
//		num = input.nextInt();
		
		//���ǽ�
//		if(num > 0)	{
//			System.out.println("plus");
//		}else {
//			System.out.println("zero or minus");
//		}

		//60�� �̻��̸� �հ�
//		int score;
//		System.out.println("enter the score below");
//		score = input.nextInt();
//		
//		if(score >= 60) {
//			System.out.println("�հ�");
//		} else {
//			System.out.println("���հ�");
//		}
		
		//Ȧ¦ �Ǻ�
//		if (num % 2 == 0) {
//			System.out.println("¦");
//			
//		}else {
//			System.out.println("Ȧ");
//		}
		
		// �� ���� �� ū �� ���
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

		// ������ ���
		double sales, bonus, target ;
		target = 1000;
		
		Scanner amount = new Scanner(System.in);
		System.out.println("���� �Է���");
		sales = amount.nextDouble();
		
		if (sales > target) {
			System.out.println("������ ���ʽ���");
			bonus = (sales - target) * 0.1;
					
		}else {
			System.out.println("������ ������");
			bonus = 0.;
		}
		
		System.out.println("bonus�� " + bonus + "����");
		
	}

}
