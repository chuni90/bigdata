import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		
		// 랜덤한 실수를 생성하여 리스트에 삽입
		
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i = 0; i<SIZE; i+=1) {
			int r = (int) (Math.random()*100);
			numbers[i] = r;
		}
		
		System.out.println("최초 리스트 :");
		
		for(int i : numbers) {
			System.out.println(i+" ");
		}
		
		// 리스트 정렬 -> 정렬된 리스트는 배열에 그대로 적용되어 자동 저장됨.
		Arrays.sort(numbers);
		
		System.out.println("\n정렬된 리스트1 :");
		for(int i : numbers)
			System.out.println(i+" ");
		
		// 정렬된 리스트를 새로운 리스트에 부여함 (사실 이미 sort를 사용하면 자동 저장되어서 필요는 없음)
		int[] num_sorted = new int[SIZE];
		
		for(int i=0; i<SIZE; i+=1) {
			num_sorted[i] = numbers[i];
			System.out.println("sorted  "+num_sorted[i]);
		}
	}
}
