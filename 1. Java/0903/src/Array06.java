
public class Array06 {

	public static void main(String[] args) {
	
		
		// for-each �� ����ϱ�
		
		int[] a = {1, 3, 5, 7};
		
		// for each ������ ����� ��Ҵ� for each �������� ��ȿ�ϴ�.
		for(int i : a) {
			i = i + 1;
			System.out.println(i);
		}
		
		// ������ �� ���Һ��� +1�� ������ a �迭�� ������ ���� ����� Ȯ���� �� �ִ�.
		for(int i : a) {
			System.out.println(i);
		}
		
		
		// ���ڿ� �迭�� ���� ���, String�� ����ؾ��ϸ�, for �� �ȿ����� string���� �����ؾ� �۵���.
		
		String[] name = {"��", "��","õ"};
		
		for(String i : name)
			System.out.println(i);
		
		
		int[] b = new int[3];
		
		for (int i : b) {
			b[i] = i + 1;
			System.out.println(b[i]);
		}
	}

}
