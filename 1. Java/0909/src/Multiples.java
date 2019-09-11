// 10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다. 
// 1000미만의 자연수에서 3, 5의 배수의 총합을 구하라.
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
