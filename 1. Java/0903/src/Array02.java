import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// for������ �迭 �� ������ �߰��ϰ� ����ϱ�
		
		int[] s = new int[5];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<s.length; i+=1) {
			System.out.print((i+1)+"��° ���� �Է� >> ");
			s[i] = input.nextInt();
		}
		// �Է¹��� ���� ���� Arrays.sort(�迭��);
		Arrays.sort(s);
		
		
		for (int i=0; i<s.length; i+=1) {
			System.out.printf("%2d ", s[i]);
		}
		
		System.out.printf("\n%2d ���� ���Ұ� �Էµ��� ", (s.length));
			
	}

}
