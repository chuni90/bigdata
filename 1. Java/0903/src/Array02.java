import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// for문으로 배열 내 데이터 추가하고 출력하기
		
		int[] s = new int[5];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<s.length; i+=1) {
			System.out.print((i+1)+"번째 원소 입력 >> ");
			s[i] = input.nextInt();
		}
		// 입력받은 값을 정렬 Arrays.sort(배열명);
		Arrays.sort(s);
		
		
		for (int i=0; i<s.length; i+=1) {
			System.out.printf("%2d ", s[i]);
		}
		
		System.out.printf("\n%2d 개의 원소가 입력됐음 ", (s.length));
			
	}

}
