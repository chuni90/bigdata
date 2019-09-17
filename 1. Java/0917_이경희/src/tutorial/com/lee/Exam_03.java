package tutorial.com.lee;

/*
 * abstract�� interface
 * 
 * 1. abstract : �߻�, ���赵(�������� �������� �����Ǵ� Ŭ����)
 * 		- abstract Ŭ���� : abstract �޼��带 �����ϰ� �ִ� Ŭ����
 * 		- abstract �޼��� :
 * 			void Ŭ������() {
 * 			�߰�ȣ ���� �����, ���Ⱑ ����־�� ��. ��üȭ(=�������̵�)�� ��� ���� Ŭ������ �ݵ�� �ؾ��ϹǷ� ���� ���.
 * 			}
 * 
 * 2. interface : �������̽�
 * 		- ���߻���� �������� ������ Ŭ����
 * 		- abstract Ŭ������ �� �����̴�. �׷��� abstract �޼��带 ���� �� ����. �Ϲ� Ŭ������ �߻�޼��带 ���� �� �����Ƿ�..!
 * 		- �������� 
 * 			static final ����ʵ�
 * 			�����ڸ޼��� : ���Ұ�(=��ü�� ������ �� ���ٴ� �ǹ�)
 * 			abstract ����޼���
 * 			static inner ��øŬ����
 * 	- static : ������ �ǹ�. Ŭ���������� ������ �����ϴ�.
 *  - final : ���� �Ұ��� �ǹ�. ����� ���ÿ� �ʱ�ȭ(�� �ο�)�� �ʿ���.
 */
interface AAA{
	// ����ʵ�
	public static final int x = 10;
	public static int y = 20;   // final �� �����Ǿ interface���� final�� ���
	public int z = 30;			// static final�� ���� ����
	int w = 40;					// ��� ���� ����
	
	// ������ �޼��� : ���� �� ����
//	public AAA() {
//	}
	
	// ����޼��� : �߰�ȣ ���� ����θ� ���� �� �����Ƿ� �ƿ� �߰�ȣ�� ���� ��������
	public abstract void aaa(); 
	abstract void bbb();  // abstract ���� ����
	void ccc();
	
	// ��øŬ����
	static class Inner{}
	
}
public class Exam_03 {

	public static void main(String[] args) {
		
//		AAA a = new AAA(); // �����ڰ� �����ϱ� ��ü ���� �Ұ���
		// �Ʒ� �ڵ�ó�� static Ŭ���������� ȣ�� ����
		System.out.println("x = " + AAA.x);
		System.out.println("y = " + AAA.y);
		System.out.println("z = " + AAA.z);
		System.out.println("w = " + AAA.w);
		
		// final�� ���� �Ұ�
//		AAA.x = 100; 
//		AAA.y = 100; 
//		AAA.z = 100; 
//		AAA.w = 100;
		
		
	}

}
