package tutorial.com.lee;

class JBank{
	private String name;
	private int money;
	private static float rate;  // static���� ����
	
	public JBank(String name, int money, float rate) {
		this.name = name;
		this.money = money;
		JBank.rate = rate;	// static�� Ŭ���������� ȣ��
	}
	
	public void disp() {
		System.out.println(name + ": " + money + ": " + rate);
	}
	
}

public class Exam_04_static {

	public static void main(String[] args) {
		// �ʱ� ��
		JBank jb = new JBank("aaa", 10000, 0.07f);
		
		// �߱� ��
		JBank jb2 = new JBank("BB", 10000, 0.03f);
		
		// �ı� ��
		JBank jb3 = new JBank("��", 10000, 0.05f);
		
		jb.disp();
		jb2.disp();
		jb3.disp();
		
		
	}

}
