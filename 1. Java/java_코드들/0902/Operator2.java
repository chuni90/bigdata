

public class Operator2 {

	public static void main(String[] args) {
		System.out.println("-------���迬����-------");

		int x = 10;
		int y = 5;
		
		System.out.println((x > 10 ) && (y <= 10));
		System.out.println((x == 10 ) || (y > 10));

		System.out.println("-------��Ʈ������-------");
		
		// 2������ ����ϰ� �̸� 10������ ��ȯ
		// & �� ���� (1*0 = 0, 1*1 = 1)
		// | �� ���� (1+1 = 1, 1+0 = 1, 0+0 = 0)
		
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(30 & 10);
		System.out.println( 30 | 10);
		
		System.out.println("-------�̵�������-------");
		// a << n : a�� 2������ �ٲ� ��, n �ڸ��� ���������� �̵��� 
		// ���� ǥ���ϸ� a * 2^n
		
		// a >> n : a�� 2������ �ٲ� ��, n �ڸ��� �������� �̵���
		// a * 1/2^n
		
		System.out.println(10 << 1);
		System.out.println(16 >> 4);
		
				
	}

}
