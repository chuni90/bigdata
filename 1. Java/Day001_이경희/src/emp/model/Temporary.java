package emp.model;

public class Temporary extends Employee{
	//private String name;
	private int hour;		// 근무시간
	private int pay;		// 시간당급여
	
	public Temporary(String name, int hour, int pay) {		
		//this.name = name;
		super(name);
		this.hour = hour;
		this.pay = pay;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	/*@Override
	public String toString() {
		return "Temporary [name=" + name + ", hour=" + hour + ", pay=" + pay + "]";
	}*/
	
	public void show() {
		//System.out.println("name : " + name);
		super.show();
		System.out.println("pay : " + getSalary());
	}
	
	public int getSalary() {
		return hour * pay;
	}

}
