package tutorial.com.lee;

public class Exam_05_static {
	
	// ���κ��� �� �ռ� �����ϴ� �뵵�� �Ʒ�ó�� static�� �ֱ⵵ ��
	static {
		System.out.println("static ����");
	}
	
	public static void aaa() {
		System.out.println("aa");
	}
	
	public void bbb() {
		System.out.println("bb");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main");
		aaa();  // static���� ����� �޼���� �ٷ� ��� ����
//		bbb();  // bbb�޼���� static�� �ƴϹǷ� ��� �Ұ���
		
		Exam_05_static b = new Exam_05_static();
		b.bbb();
	}

}
