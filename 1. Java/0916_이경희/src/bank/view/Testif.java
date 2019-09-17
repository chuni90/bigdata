package bank.view;


public class Testif {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 0;
		
		
		if (sum(1, 2) >= 3) {
			System.out.println(a + "|" + b + "|");
			sum(1, 2);
			System.out.println(c);
			System.out.println(sum(1, 2));
		}else {
			System.out.println("e"+ a + "|" + b + "|");
			System.out.println("e"+ c);
		}
	}

	private static int sum(int i, int j) {
		int c = i + j;
		return c;
	}


}
