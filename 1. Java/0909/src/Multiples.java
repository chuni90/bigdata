// 10 �̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3, 5, 6, 9�̴�. �̵��� ������ 23�̴�. 
// 1000�̸��� �ڿ������� 3, 5�� ����� ������ ���϶�.
public class Multiples {

	public static void main(String[] args) {
		int[] three = new int[333];
		int[] five = new int[200];

		int sum3 = 0, sum5 = 0;
		int total = 0;
		
		for (int i = 1; i<1000; i+=1) {
			if (i % 3 == 0) {
				total += i;
				System.out.println("3>> "+total);
			}else if (i % 5 == 0) {
				total += i;
				System.out.println("5>> "+total);
			}
		}
		
		for (int i=0; i<1000; i+=1) {
			if (i % 3 == 0 || i % 5 == 0)
				sum3 += i;
		}
		System.out.println(sum3);
	}

}
