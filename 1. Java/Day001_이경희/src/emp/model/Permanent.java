package emp.model;

// ������ ������ ������ �����ϱ� ���� ��ü
public class Permanent extends Employee{
	//private String name;
	private int salary;
	
	public Permanent(String name, int salary) {
		//super.name = name;
		super(name);
		this.salary = salary;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*@Override
	public String toString() {
		return "Permanent [name=" + name + ", salary=" + salary + "]";
	}*/
	
	public void show() {
		//System.out.println("name : " + name);
		super.show();
		System.out.println("pay : " + getSalary());
	}
}
