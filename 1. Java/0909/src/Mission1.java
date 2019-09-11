import java.util.Arrays;
import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
//		1. 세수를 입력받아 큰 수와 작은 수 구하는 프로그램
		
		Scanner input = new Scanner(System.in);
		
		// 내가 입력할 3개의 수를 저장할 int 선언
		// 가장 큰 수, 작은 수 선언
		int num1, num2, num3, big = 0, small = 0;
		
		System.out.println("수를 입력하시오 : ");
		num1 = input.nextInt();
		
		System.out.println("수를 입력하시오 : ");
		num2 = input.nextInt();
		
		System.out.println("수를 입력하시오 : ");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			big = num1;
			if (num2 > num3) {
				small = num3;
			}else {
				small = num2;
			}
		}else if (num2 > num1 && num2 > num3) {
			big = num2;
			if (num1 > num3) {
				small = num3;
			}else 
				small = num1;
		}else {
			big = num3;
			if (num1 > num2) {
				small = num2;
			}else 
				small = num1;
		}
		System.out.println("big: " + big);
		System.out.println("small: " + small);
///////////////////////////////////////////////////////
		// 배열로 해보기
		
		int[] array = new int[3];
		
		for (int i=0; i<3; i+=1) {
			System.out.println("[배열]수를 입력하시오 : ");
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		
		System.out.println("작은 수: "+ array[0]);
		System.out.println("큰 수: "+ array[2]);
/////////////////////////////////////////////
		

	}
}
