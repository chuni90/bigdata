import java.util.Random;

public class Dowhile01 {

	public static void main(String[] args) {
		int i = 1 ;
		int sum = 0;
		
		// do-while���� Ư¡�� do ���� �ڵ�� ������ 1ȸ �̻� �����
		// do���� �ڵ尡 ����ǰ� �������� while�� ������ ������. �׷��� ������ �������� �ʴ� ���ص� �� ���� �����.
		
		do {
			System.out.println(i);
			sum = sum + i;
			i++;
		}while(i <= 10);
		System.out.println("�հ�: " + sum);
	
		System.out.println("------------");
	}
}
