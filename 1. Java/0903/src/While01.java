import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		int i;
		int j = 1;
		
//		while(i < 11) {
//			System.out.println(i);
//			sum = sum + i;
//			i++;
////			i+=2;  Ȧ���� �����ִ� �ڵ�
//			
//		}
//		System.out.println("�հ�: " + sum);
		Scanner input = new Scanner(System.in);
		System.out.print("������ ���۰� : ");
		i = input.nextInt();
		
		while (j <= 9) {
			
			System.out.println(i+" * "+j+" = "+(i*j));
			j++;
		}
		
	}

}
