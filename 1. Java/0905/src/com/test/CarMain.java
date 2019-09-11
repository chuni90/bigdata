package com.test;

class Car{
	//attribute
	String brand;
	String color;
	private int speed;
	private int gear;
	
	//method
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public String prn() {
		return "브랜드는 " + brand + ", 색상은 " + color + ", 속도는 " + speed + ", 기어는" + gear;
	}
}

public class CarMain {

	public static void main(String[] args) {
		
		
		Car obj = new Car();
		
		obj.brand = "Rambo";
		obj.color = "yellow";
		obj.setSpeed(300);
		obj.setGear(6);
		
		System.out.println(obj.prn());
		
		obj.prn();
	}

}
