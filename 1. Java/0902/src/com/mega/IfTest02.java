package com.mega;

import java.util.Date;
import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// ����̾簡 ���ϱ�
//		int score;
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("������ �Է��Ͻÿ�");
//		score = in.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("��");
//		}else if(score >= 80) {
//			System.out.println("��");
//		}else if(score>= 70) {
//			System.out.println("��");
//		}else if(score>=60) {
//			System.out.println("��");
//		}else {
//			System.out.println("��");
//		}
		
		// ��ħ�λ� ���α׷�
		
		int time ;
		
		Scanner intime = new Scanner(System.in);
		System.out.println("���� �� ��?");
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
		
		// Date ��Ű���κ��� ���� �ð� ������.
		Date date = new Date();
		int currentHour = date.getHours();
		int currentMin = date.getMinutes();
		System.out.println(currentHour+":"+currentMin);
	}

}
