import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		int num1, num2 ,x, y;
		int r = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 입력 2개");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (num1 > num2) {
			x = num1;
			y = num2;
		} else {
			x = num2; 
			y = num1;
		}
		System.out.println("큰 수:"+x+" 작은 수 :"+y);
					
		while (y != 0 ) {
			r = x % y ;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는 " + x );
	}
	
}

	
