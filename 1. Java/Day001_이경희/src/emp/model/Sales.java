package emp.model;

public class Sales extends Employee {
	//private String name;
	private int salary;	 // �⺻��
	private float rate; // �󿩺���
	private int salesResult;  // �ǸŽ���
	
	public Sales(String name, int salary, float rate, int salesResult) {		
		//this.name = name;
		super(name);
		this.salary = salary;
		this.rate = rate;
		this.salesResult = salesResult;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getSalesResult() {
		return salesResult;
	}

	public void setSalesResult(int salesResult) {
		this.salesResult = salesResult;
	}

	/*@Override
	public String toString() {
		return "Sales [name=" + name + ", rate=" + rate + ", salesResult=" + salesResult + "]";
	}*/
	
	public void show() {
		//System.out.println("name : " + name);
		super.show();
		System.out.println("pay : " + getSalary());
	}

	public int getSalary() {		
		return salary + (int)(salesResult * rate); // �⺻�� + �μ�Ƽ��(�ǸŽ��� * �󿩺���)
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
