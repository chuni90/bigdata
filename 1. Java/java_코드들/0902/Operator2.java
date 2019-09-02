

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("-------관계연산자-------");

		int x = 10;
		int y = 5;
		
		System.out.println((x > 10 ) && (y <= 10));
		System.out.println((x == 10 ) || (y > 10));

		System.out.println("-------비트연산자-------");
		
		// 2진수로 계산하고 이를 10진수로 반환
		// & 는 논리곱 (1*0 = 0, 1*1 = 1)
		// | 는 논리합 (1+1 = 1, 1+0 = 1, 0+0 = 0)
		
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(30 & 10);
		System.out.println( 30 | 10);
		
		System.out.println("-------이동연산자-------");
		// a << n : a를 2진수로 바꾼 후, n 자리를 오른쪽으로 이동함 
		// 쉽게 표현하면 a * 2^n
		
		// a >> n : a를 2진수로 바꾼 후, n 자리를 왼쪽으로 이동함
		// a * 1/2^n
		
		System.out.println(10 << 1);
		System.out.println(16 >> 4);
		
				
	}

}
