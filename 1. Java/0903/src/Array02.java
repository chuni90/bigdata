import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// for문으로 배열 내 데이터 추가하고 출력하기
		
		int[] s = new int[5];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<s.length; i+=1) {
			System.out.print((i+1)+"번째 원소 입력 >> ");
			s[i] = input.nextInt();
//			s[i] = i;
		}
		for (int i=0; i<s.length; i+=1) {
			System.out.printf("%2d ", s[i]);
		}
		System.out.printf("\n%2d 개의 원소가 입력됐음 ", (s.length));
			
	}

}
