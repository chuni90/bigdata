import java.util.Random;
import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		// ���������� �ַܼ� �����
		
		String ���� = "����";
		String ���� = "����";
		String �� = "��";
		String user_input;
		int com;
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			// ��ǻ���� ����=0, ����=1, ��=2 ���ϱ�
			Random r = new Random();
			com = r.nextInt(3);
			
			// ���� ����, ����, �� �Է��ϱ�
			System.out.println("����, ����, �� �߿��� �ϳ��� �Է��ϼ���>> ");
			user_input = in.next();
			
			if (user_input.equals(����)) {
				if (com == 0) {
					System.out.println("���");
				}else if (com == 1) {
					System.out.println("��");
				}else 
					System.out.println("�̱�");
			}else if (user_input.equals(����)) {
				if (com == 0) {
					System.out.println("�̱�");
				}else if (com == 1) {
					System.out.println("���");
				}else 
					System.out.println("��");
			}else if (user_input.equals(��)) {
				if (com == 0) {
					System.out.println("��");
				}else if (com == 1) {
					System.out.println("�̱�");
				}else 
					System.out.println("���");
			}else if (user_input.equals("����"))  //������ �Է��ϸ� ���� ��
				break;
		}
		
		
			
		
	}

}
