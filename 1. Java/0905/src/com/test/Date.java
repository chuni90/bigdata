package com.test;


public class Date {

	private int year, day;
	private String month;
	
	public Date() {
		this(2019, "1��", 1);
	}
	
	public Date(String y, int z) {
		this(2033, y, z);
	}
	
	public Date(int x, String y, int z) {
		year = x;
		month = y;
		day = z;
	}
	void setDate(int x, String y, int z) {
		year = x;
		month = y;
		day = z;
	}

	void printDate() {
		System.out.printf("\n�Է��Ͻ� ��¥�� %d�� %s %d�� �Դϴ�.\n", 
				this.year, this.month, this.day);
	}
	
	public String toString() {
		return "\n�Է��Ͻ� ��¥�� �� �Դϴ�.\n";
	}

	public static void main(String[] args) {

		Date d = new Date();
		d.printDate();
		
		Date d2 = new Date("2��",5);
		d2.printDate();
		System.out.println(d2);
		
		Date d3 = new Date();
		d3.setDate(9999,"6��",5);
		d3.printDate();
		
	}

}
