package emp.model;


// ������(Permanent) ������ ������ �����ϱ� ���� ��ü

public class Permanent extends Employee{
//	private String name;
	private int salary;
	
	public Permanent(String name, int salary) {
		super(name);  // �θ��� �����ڰ� default�� �ƴ϶� �ʱ�ȭ ���� �Ķ���� name�� ������
		this.salary = salary;
		
	}

//	@Override
//	public String toString() {
//		return "Permanent [name=" + name + ", salary=" + salary + "]";
//	}
	
	public void show() {
//		System.out.println("Name >> "+ name);  <<== name ������ �θ����� �����Ƿ� ����
		super.show();	// <= show�� �������̵� ������ �θ���� �������Ƿ� super.�޼ҵ�() ���
		System.out.println("Pay >> "+ getSalary());
	}
	

//	public String getName() {
//		return name;
//	}

	public int getSalary() {
		return salary;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
