import java.util.Arrays;
import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
//		1. ������ �Է¹޾� ū ���� ���� �� ���ϴ� ���α׷�
		
		Scanner input = new Scanner(System.in);
		
		// ���� �Է��� 3���� ���� ������ int ����
		// ���� ū ��, ���� �� ����
		int num1, num2, num3, big = 0, small = 0;
		
		System.out.println("���� �Է��Ͻÿ� : ");
		num1 = input.nextInt();
		
		System.out.println("���� �Է��Ͻÿ� : ");
		num2 = input.nextInt();
		
		System.out.println("���� �Է��Ͻÿ� : ");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			big = num1;
			if (num2 > num3) {
				small = num3;
			}else {
				small = num2;
			}
		}else if (num2 > num1 && num2 > num3) {
			big = num2;
			if (num1 > num3) {
				small = num3;
			}else 
				small = num1;
		}else {
			big = num3;
			if (num1 > num2) {
				small = num2;
			}else 
				small = num1;
		}
		System.out.println("big: " + big);
		System.out.println("small: " + small);
///////////////////////////////////////////////////////
		// �迭�� �غ���
		
		int[] array = new int[3];
		
		for (int i=0; i<3; i+=1) {
			System.out.println("[�迭]���� �Է��Ͻÿ� : ");
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		
		System.out.println("���� ��: "+ array[0]);
		System.out.println("ū ��: "+ array[2]);
/////////////////////////////////////////////
		

	}
}
