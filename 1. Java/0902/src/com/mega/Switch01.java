package com.mega;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score, result ;
				
		System.out.println("���� �Է�");
		score = input.nextInt();
		
		//switch( ) ��ȣ �ȿ��� ���� ��ü�� ���� ��. score�� ������ int type�̶� ����� int�� ��ȯ��.
		switch(score / 10) {
		case 10 :						 // case 10�� ������ '��'�� ������ �Ŵϱ� �ڵ尡 �ʿ����.
		case 9 : System.out.println("��"); break; // break�� ������ �ؿ� case�� ��� ��ȯ�ǹǷ� �ݵ�� �־���
		case 8 : System.out.println("��"); break;
		case 7 : System.out.println("��"); break;
		case 6 : System.out.println("��"); break;
		default : System.out.println("��");
		}		
	}

}
