

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// 세개의 숫자를 입력받아 가장 큰 수를 구하는 프로그램 작성
		
		int num1, num2, num3, max ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input the 1st num!");
		num1 = input.nextInt();
		
		System.out.println("input the 2nd num!");
		num2 = input.nextInt();
		
		System.out.println("input the 3rd num!");
		num3 = input.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}else if(num2 > num1 && num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		
		System.out.println("입력된 수 중에서 가장 큰 수는 >>"+max);
		
	}

}
