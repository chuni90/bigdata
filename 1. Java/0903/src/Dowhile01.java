import java.util.Random;

public class Dowhile01 {

	public static void main(String[] args) {
		int i = 1 ;
		int sum = 0;
		
		// do-while문의 특징은 do 안의 코드는 무조건 1회 이상 실행됨
		// do안의 코드가 실행되고 마지막에 while을 만나기 때문임. 그래서 조건이 부합하지 않는 다해도 한 번은 실행됨.
		
		do {
			System.out.println(i);
			sum = sum + i;
			i++;
		}while(i <= 10);
		System.out.println("합계: " + sum);
	
		System.out.println("------------");
	}
}
