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
		return "�̸��� " + name + " |�ּҴ� " + address +" | �ӱ��� " + salary;
	}
	
}

class Manager extends Employee {
	private int bonus;
	
	public void test() {
		bonus = 10000;
		salary += salary + bonus;
		System.out.println("*******���ʽ� �׽�Ʈ ���!!*******");
	}
	@Override
	public String toString() {
		return "�̸��� " + name + " |�ּҴ� " + address +" | �ӱ��� " +
				salary + " B: " + bonus;
	}
	
	
	
}


public class Emp {

	public static void main(String[] args) {

		Employee e = new Employee()	;   // �θ�Ŭ���� ��ü
		Manager c = new Manager();		// �ڽ� ��ü
		Manager d = new Manager();		// �ڽ� ��ü
		
		// �θ� ��ü
		System.out.println("�θ� toString>> " + e + "\n");
		
		// �ڽ� ��ü
		c.address = "�д�";
		c.name = "õ";
		
		c.setRrn(1341232132);
		System.out.println("Rrn>> "+c.getRrn()+"\n");
		
		System.out.println("�ڽ� toString>> " +c+"\n");
		System.out.println(d+"\n");
		
		c.test();
		System.out.println(c+"\n");	
	}

}
