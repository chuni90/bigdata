

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// 바코드의 상품명 알아내기
		
		Scanner input = new Scanner(System.in);
		
//		int barcode ;
//		String name = null ;
//				
//		System.out.println("바코드를 입력해");
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
//		System.out.println("바코드 이름은 " + name);
//		
//		char aka;
//		aka = 'b';
//		
//		switch(aka) {
//		case 'a': System.out.println("알A"); break;
//		case 'b': System.out.println("알B"); break;
//		case 'c': System.out.println("알C"); break;
//		default : System.out.println("오류"); 
//				
//		}
		
		int score, result ;
				
		System.out.println("점수 입력");
		score = input.nextInt();
		
		//switch( ) 괄호 안에는 수식이 들어도 됨. 어차피 결과가 정수이니까
		switch(score / 10) {
		case 10 :								 // case 10은 어차피 '수'로 나오는 거니까 코드가 필요없음.
		case 9 : System.out.println("수"); break;
		case 8 : System.out.println("우"); break;
		case 7 : System.out.println("미"); break;
		case 6 : System.out.println("양"); break;
		default : System.out.println("가");
		}		
	}

}
