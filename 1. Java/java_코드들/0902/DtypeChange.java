

public class DtypeChange {
// ���� ����ȯ
	public static void main(String[] args) {
		int i;
		double f;
		
		// ���������� ������ ����� 1 �̱� ������, �Ҽ��� ���� ��� ���ư�
		f = 5 / 4 ;
		System.out.println(f);

		
		// ���ڸ� �Ǽ��� �ٲ��ܿ� ���� �Ҽ����� �ٽ� ��Ƴ�
		f = (double) 5 / 4;
		System.out.println(f);

		// �Ǽ��� �� �� ������ �ٲ㼭 (1 + 1�� �ǹ���) �Ҽ����� ��� ���ư�
		f = (int) 1.3 + (int) 1.8;
		System.out.println(f);

	}

}
