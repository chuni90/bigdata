package com.after;

class Employee {
	public String name;
	String address;
	protected int salary = 1000;
	private int rrn;
	
	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	@Override
	public String toString() {
		return "이름은 " + name + " |주소는 " + address +" | 임금은 " + salary;
	}
	
}

class Manager extends Employee {
	private int bonus;
	
	public void test() {
		bonus = 10000;
		salary += salary + bonus;
		System.out.println("*******보너스 테스트 통과!!*******");
	}
	@Override
	public String toString() {
		return "이름은 " + name + " |주소는 " + address +" | 임금은 " +
				salary + " B: " + bonus;
	}
	
	
	
}


public class Emp {

	public static void main(String[] args) {

		Employee e = new Employee()	;   // 부모클래스 객체
		Manager c = new Manager();		// 자식 개체
		Manager d = new Manager();		// 자식 개체
		
		// 부모 객체
		System.out.println("부모 toString>> " + e + "\n");
		
		// 자식 객체
		c.address = "분당";
		c.name = "천";
		
		c.setRrn(1341232132);
		System.out.println("Rrn>> "+c.getRrn()+"\n");
		
		System.out.println("자식 toString>> " +c+"\n");
		System.out.println(d+"\n");
		
		c.test();
		System.out.println(c+"\n");	
	}

}
