import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		System.out.println("-----5이하 출력--------\n");
		
		for(int i = 1; i <= 5; i++ ) {
			System.out.println(i);
		}
			
//-----------------10이하 홀수 출력-----------------
		System.out.println("-----10 이하 홀수 출력--------\n");
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i+"\t");
		}
		
//-------------------팩토리얼 만들기 -----------------
		System.out.println("------팩토리얼-------\n");
		
		Scanner input = new Scanner(System.in);
		long re = 1;
		System.out.print("입력: ");
		int f = input.nextInt();
		
		for(int i=1; i<=f; i+=1) {
			re = re * i;	
		}
		System.out.println(f+"! = " + re);
		

//-------------------약수 반환하기 --------------
		System.out.println("------약수---------\n");
		
		int num;
		System.out.print("양의 정수 입력: ");
		num = input.nextInt();
		
		System.out.println(num+"의 약수는 다음과 같음");
		for(int i=1; i<=num; i+=1) {
			if(num % i == 0)
				System.out.print(i+"  ");
		}
		
	}

}
