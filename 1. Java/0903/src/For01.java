import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		System.out.println("-----5���� ���--------\n");
		
		for(int i = 1; i <= 5; i++ ) {
			System.out.println(i);
		}
			
//-----------------10���� Ȧ�� ���-----------------
		System.out.println("-----10 ���� Ȧ�� ���--------\n");
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i+"\t");
		}
		
//-------------------���丮�� ����� -----------------
		System.out.println("------���丮��-------\n");
		
		Scanner input = new Scanner(System.in);
		long re = 1;
		System.out.print("�Է�: ");
		int f = input.nextInt();
		
		for(int i=1; i<=f; i+=1) {
			re = re * i;	
		}
		System.out.println(f+"! = " + re);
		

//-------------------��� ��ȯ�ϱ� --------------
		System.out.println("------���---------\n");
		
		int num;
		System.out.print("���� ���� �Է�: ");
		num = input.nextInt();
		
		System.out.println(num+"�� ����� ������ ����");
		for(int i=1; i<=num; i+=1) {
			if(num % i == 0)
				System.out.print(i+"  ");
		}
		
	}

}
