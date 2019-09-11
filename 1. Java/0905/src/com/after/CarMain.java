package com.after;

// parent class
class Car {
	int speed;
}

// child class
class SportsCar extends Car {
	int turbo;
}

public class CarMain {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.speed = 100;
		
		SportsCar c2 = new SportsCar();
		c2.speed = 22;  //speed >> child object uses the parent attribute.
		c2.turbo = 6;
		
		System.out.println(c1.speed);
		System.out.println(c2.speed + " || "+c2.turbo); 
	}

}
