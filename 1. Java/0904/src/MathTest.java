class Math1 {
	
	int add(int x, int y) {
		return x + y;
	}
	
	int multiple (int x, int y) {
		return x * y;
	}
	
	double division (int x, double y) {
		return x / y ;
	}
	
	int subtraction (int x, int y) {
		return x - y ;
	}
	
}


public class MathTest {

	public static void main(String[] args) {
		
		Math1 obj = new Math1();
		
		int sum;
		int ����;
		int minus;
		double nanugi;
		
		sum = obj.add(2, 3);	
		System.out.println(sum);
		
		sum = obj.add(5, 6);
		System.out.println(sum);
		
		System.out.println("---------**-----------");
		
		���� = obj.multiple(3, 5);
		minus = obj.subtraction(10, 2);
		nanugi = obj.division(10, 3.2);
		
		System.out.println("�� : "+����);
		System.out.println("���� : "+minus);
		System.out.println("������ : "+nanugi);
		
		System.out.println("---------**-----------");

		int a = 52;
		int b = 9;
		
		���� = obj.multiple(a, b);
		minus = obj.subtraction(a, b);
		nanugi = obj.division(a, b);
		
		System.out.println("�� : " + ����);
		System.out.println("���� : " + minus);
		System.out.printf("������ : %.2f", nanugi);
		
		//���� ��ſ� �ٷ� ��ü �������� ���ڿ� �־ �����
		
		System.out.printf("\n������ : %.2f", obj.division(a, b));
		
	}

}
