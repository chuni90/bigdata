import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		
		// ������ �Ǽ��� �����Ͽ� ����Ʈ�� ����
		
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i = 0; i<SIZE; i+=1) {
			int r = (int) (Math.random()*100);
			numbers[i] = r;
		}
		
		System.out.println("���� ����Ʈ :");
		
		for(int i : numbers) {
			System.out.println(i+" ");
		}
		
		// ����Ʈ ���� -> ���ĵ� ����Ʈ�� �迭�� �״�� ����Ǿ� �ڵ� �����.
		Arrays.sort(numbers);
		
		System.out.println("\n���ĵ� ����Ʈ1 :");
		for(int i : numbers)
			System.out.println(i+" ");
		
		// ���ĵ� ����Ʈ�� ���ο� ����Ʈ�� �ο��� (��� �̹� sort�� ����ϸ� �ڵ� ����Ǿ �ʿ�� ����)
		int[] num_sorted = new int[SIZE];
		
		for(int i=0; i<SIZE; i+=1) {
			num_sorted[i] = numbers[i];
			System.out.println("sorted  "+num_sorted[i]);
		}
	}
}
