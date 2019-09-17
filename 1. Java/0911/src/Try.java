// System.�� �Է����� �ʰ� out.print ������ ��� ���������� ��Ű���� import
import static java.lang.System.out;
//40���� �Է¹��� ���� �߻��� ���õ� class
import java.util.InputMismatchException;
import java.util.Scanner; 


public class Try {
	
	public static void main(String[] args) {
	
		//try-catch���� �غ���
		int[] var = {10, 20, 30};
		
		for (int i = 0; i<=3; i+=1) {
			try {
				out.println(var[i]);
				out.println(i + "��°");  // �迭�� �ʰ��Ͽ� ���ٿ��� ������ �߻��Ǹ� ���� ���� ������� �ʴ� ���� Ȯ���� �� �ִ�.
			}catch (ArrayIndexOutOfBoundsException e) {
				out.println("�迭�� ����");	
			}
			
		}
		out.println("-----------------��-----------------");
		
		// try-����catch - finally
		// ���� �����鿡 ���� ������ �ڵ带 �ۼ��� �� �ִٴ� ������ ����
		// �ٸ� catch���� �� �������� ��Ƴ� ���� �� �Ʒ��ٿ� ���� �⺻ ����(��� ������ ��� Exception�� ����)���� ����
		// �� ���� ���������� ��Ȯ�� ����� �� �ִ�. 
		// finally�� �ڵ��� ����/���� ������ ������� ������ ����� �ڵ带 ���� ��
		
		int a = 10;
		
		try {
			out.println("���� �Է�: ");
			Scanner input = new Scanner(System.in);
			int data = input.nextInt();
			
			out.println(a/data);
		}catch (InputMismatchException e){   // Ŭ������ ����Ʈ �ؾ���..
			out.println("no num!!");
		}catch (ArithmeticException x) {
			out.println("0 is impossible");
		}catch (Exception i){   // �����δ� ���� �Ʒ��� �����ϴ� �ڵ���
			out.println("d");
		}finally {  //catch������ ���� ó�� ���Ŀ�, ���� ���� �� ���� ����&���ο� ������� �ݵ�� ����� �ڵ带 ���� ��
			out.println("Finally code Executed, �� ����Ǿ���!");
		}
	}


}
