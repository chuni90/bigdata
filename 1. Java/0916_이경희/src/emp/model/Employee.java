package emp.model;

/* 	���� - �̸�, �޿�
 * 		������ - �޿�(�⺻��)
 * 		������ - �޿�(�⺻�� + �ǸŽ���*����)
 * 		�ӽ��� - �޿�(�ٹ��ð� * �ñ�)
 */

public class Employee {
	private String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("name: " + name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return 0;		// �ڽĵ��� �������̵� �ϱ� ���ؼ� ������ �߻� �޼ҵ� ������. ��üȭ�� �ڽ�Ŭ�������� �ǽ�
	}
	
	
}
