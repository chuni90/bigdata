
public class PesonMain {

	public static void main(String[] args) {
		// Ŭ������ ��ü�� = new Ŭ������();
		// Ŭ������ ��ü�� = new ������();
		// new�� ���� ����� �ִ� Ŭ������ ��üȭ�ؼ� hip�� ���������ν� �츮�� ���������� ����� �� �ִ� ����.

		Person obj = new Person();
		
		// Ŭ������ ��ü�� �����(���⼱ Person�� obj�� ��üȭ��), �� �Ŀ�  ��üȭ�� Ŭ���� ������ (�Ӽ�,����)�� �����
		
		obj.name = "han";
		obj.age = 32;
		obj.height = 182;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.height);
		obj.eat();
		
		System.out.println();
		
		Person ���� = new Person();
		����.name="õ����";
		����.age = 30;
		����.sleep();
		
		System.out.println(����.age);
		
		// ������ height�� ���� ���� ���� �ʾұ⿡ �⺻���� 0.0(double�� �����)���� ��Ÿ��
		// �⺻�� int 0 | float 0.0 | String null
		System.out.println(����.height);
		
	}

}
