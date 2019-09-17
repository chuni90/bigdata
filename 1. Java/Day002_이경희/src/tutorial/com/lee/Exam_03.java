package tutorial.com.lee;

/*
 * abstract�� interface
 * 1. abstract : �߻�, ���赵(�������� �������� �����Ǵ� Ŭ����)
 *   - abstract Ŭ���� : abstract �޼��带 �����ϰ� �ִ� Ŭ����
 *   - abstract �޼���
 *     ����θ� ���� �� ����.
 *     void aaa(){
 *       // �����
 *     }
 *     �ݵ�� �������̵�(������)�ؾ� �Ѵ�.
 *     
 * 2. interface : �������̽�
 *    - ���߻���� �������� ������ Ŭ����
 *    - abstract Ŭ������ �� �����̴�.
 *    - ��������
 *      static final ����ʵ�
 *      �����ڸ޼��� => ���Ұ�, ��ü�� ������ �� ����.
 *      abstract ����޼���
 *      static Inner ��øŬ����    
 *   - static : ����
 *              Ŭ���������� ������ �����ϴ�.   
 *   - final : ����Ұ�
 *             ����� ���ÿ� ���� ������ �־�� �Ѵ�.   
 * */

interface AAA{
	// ����ʵ�
	public static final int x = 10;
	public static int y = 20;
	public int z = 30;
	int w = 40;
	
	// ������ �޼���
	//public AAA() {}
	
	// ��� �޼���
	public abstract void aaa();
	abstract void bbb();
	void ccc();
	
	// ��ø Ŭ����
	static class Inner{}
}

public class Exam_03 {
	
	//public abstract void aaa();

	public static void main(String[] args) {
		//AAA a = new AAA();
		// static�� Ŭ���������� ������ �����ϴ�.
		System.out.println("x = " + AAA.x);
		System.out.println("y = " + AAA.y);
		System.out.println("z = " + AAA.z);
		System.out.println("w = " + AAA.w);
		
		// final�� ������ �Ұ����ϴ�.
		//AAA.x = 100;
		//AAA.y = 200;
		//AAA.z = 300;
		//AAA.w = 400;
		final int a = 10;
		//a = 20;
	}

}
