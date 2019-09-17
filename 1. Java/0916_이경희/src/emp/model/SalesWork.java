
package emp.model;

public class SalesWork extends Employee{
//	private String name;
	private int salary;  // 기본급
	private float rate;  // 상여 비율
	private int salesResult; 	//판매 실적

	public SalesWork(String name, int salary, float rate, int salesResult) {
		super(name);
//		this.name = name;
		this.salary = salary;
		this.rate = rate;
		this.salesResult = salesResult;
	}

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


//	@Override
//	public String toString() {
//		return "SalesWork [name=" + name + ", rate=" + rate + ", salesResult=" + salesResult + "]";
//	}
	
	public void show() {
		super.show();
		System.out.println("Pay >> " + getSalary());
	}
	
	@Override
	public int getSalary() {
		return salary + (int)(salesResult * rate); // 기본급 + 인센티브
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}


}
