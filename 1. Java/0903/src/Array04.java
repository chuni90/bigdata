import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// �迭 �� �ּҰ�, �ִ밪�� ���ϰ� �� 2���� �ִ������� ���غ���.
		
		// �迭 ����
		int[] a = {35, 90, 80, 20, 60, 70, 24, 524};
		int min = a[0];
		int max = a[0];
		
		// �ּҰ� ����
		for (int i=1; i<a.length; i+=1)
			if(min > a[i]) 
				min = a[i];
		
		// �ִ밪 ����
		for (int i=1; i<a.length; i+=1)
			if(max < a[i])
				max = a[i];
		
		// �迭 ������ Ư������ �� ��° �ε������� ã��
		final int value;
		int count = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ã���÷��� ���ڰ�? ");
		value = input.nextInt();
		
		for(int i=1; i<a.length; i+=1) {
			if(a[i]==value) {
				System.out.printf("a�迭�� �ε��� %d�� %d�Դϴ�\n",i,value);
			break;
			}
			count += 1;
			if(count == a.length)
				System.out.println("���׿�");
		}
		
		// �ּ�, �ִ� ���
		System.out.println("�ּҰ� >> "+min);
		System.out.println("�ִ밪 >> "+max);
		
		// �ִ����� ����&���
		int r;
		while(min != 0) {
			r = max % min;
			max = min;
			min = r;
		}System.out.println("�ִ������� " + max);

	}
}
