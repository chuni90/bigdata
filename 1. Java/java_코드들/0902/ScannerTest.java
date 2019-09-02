

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		int w, h, a, b;
		int sum  = 0 ;
		int sum2  = 0 ;
		
		// 입력받는 클래스 생성
		// ctrl + shift + O 를 통해 필요한 패키지 자동으로 적용 가능(import가 안 되어있는데 적용된 코드로 작성되었을 때)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("가로를 입력하세요>> ");
		w = input.nextInt();
		
		System.out.println("세로를 입력하세요>> ");
		h = input.nextInt();
		
		sum = w * h;
		System.out.println("넓이는 " + sum);
		
// --------------------------------------------------------
		
		System.out.println("--------sum----------");
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("1st number enter..>");
		a = input1.nextInt();
		
		System.out.println("2nd number enter..>");
		b = input1.nextInt();
		
		sum2 = a + b;
		System.out.println("합계는 "+sum2);
		
// --------------------------------------------------------

		System.out.println("--------원의 면적----------");
		
		double r;
		
		Scanner circle = new Scanner(System.in);
		System.out.println("반지름 입력하세요(실수 가능) >>");
		r = circle.nextDouble();
		
		System.out.println(3.14 * r * r);
		
	}

}
