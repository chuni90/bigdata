

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// ���ڵ��� ��ǰ�� �˾Ƴ���
		
		Scanner input = new Scanner(System.in);
		
//		int barcode ;
//		String name = null ;
//				
//		System.out.println("���ڵ带 �Է���");
//		barcode = input.nextInt();
//		
//		switch(barcode) {
//		case 1: name = "refrigerator"; break;
//		case 2: name = "air conditioner"; break;
//		case 3: name = "washing machine"; break;
//		case 4: name = "dryer"; break;
//		case 5: name = "TV"; break;
//		default: name = "wrong barcode";
//		}
//		
//		System.out.println("���ڵ� �̸��� " + name);
//		
//		char aka;
//		aka = 'b';
//		
//		switch(aka) {
//		case 'a': System.out.println("��A"); break;
//		case 'b': System.out.println("��B"); break;
//		case 'c': System.out.println("��C"); break;
//		default : System.out.println("����"); 
//				
//		}
		
		int score, result ;
				
		System.out.println("���� �Է�");
		score = input.nextInt();
		
		//switch( ) ��ȣ �ȿ��� ������ �� ��. ������ ����� �����̴ϱ�
		switch(score / 10) {
		case 10 :								 // case 10�� ������ '��'�� ������ �Ŵϱ� �ڵ尡 �ʿ����.
		case 9 : System.out.println("��"); break;
		case 8 : System.out.println("��"); break;
		case 7 : System.out.println("��"); break;
		case 6 : System.out.println("��"); break;
		default : System.out.println("��");
		}		
	}

}
