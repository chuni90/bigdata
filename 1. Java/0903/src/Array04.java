import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// 배열 내 최소값, 최대값을 구하고 그 2개로 최대공약수를 구해봐라.
		
		// 배열 생성
		int[] a = {35, 90, 80, 20, 60, 70, 24, 524};
		int min = a[0];
		int max = a[0];
		
		// 최소값 산출
		for (int i=1; i<a.length; i+=1)
			if(min > a[i]) 
				min = a[i];
		
		// 최대값 산출
		for (int i=1; i<a.length; i+=1)
			if(max < a[i])
				max = a[i];
		
		// 배열 내에서 특정값이 몇 번째 인덱스인지 찾기
		final int value;
		int count = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("찾으시려는 숫자가? ");
		value = input.nextInt();
		
		for(int i=1; i<a.length; i+=1) {
			if(a[i]==value) {
				System.out.printf("a배열의 인덱스 %d가 %d입니당\n",i,value);
			break;
			}
			count += 1;
			if(count == a.length)
				System.out.println("없네용");
		}
		
		// 최소, 최대 출력
		System.out.println("최소값 >> "+min);
		System.out.println("최대값 >> "+max);
		
		// 최대공약수 산출&출력
		int r;
		while(min != 0) {
			r = max % min;
			max = min;
			min = r;
		}System.out.println("최대공약수는 " + max);

	}
}
