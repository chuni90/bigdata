
public class Wrapper {

	public static void main(String[] args) {
		
		// Wrapper ���� �����ϱ�
		// �⺻�ڷ���(int, double, boolean ��)�� ��ü�� �ٲ�(wrap���ִ�)�ִ� Ŭ����
		
		boolean t = true;
		Boolean wrap_t = new Boolean(t);
		System.out.println(t+" a");
		
		double d = 1.231;
		
		System.out.println("double>> "+d);
		
		//"123"���ڿ��� +123�� �ص� 246�� ���� ����
		String s = "123";
		System.out.println(s+123);
		
		//s="123"�� Double wrapper�� ��ȯ�Ͽ� double�� ����� ���ڸ� ���ϴ� �� ����.
		Double s_d = Double.parseDouble(s);
		System.out.println(s_d + 111);
		
		
		
	}

}
