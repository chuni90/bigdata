package com.after;

class Animal1 {
	int weight;
	boolean pic;
	
	void eat() {
		weight += 10;
	}
	
	boolean sleep() {
		return true;
	}
}
	
class Lion extends Animal1 {
	int legs;
	
	String roar() {
		return "¿∏∏£∑∑"+weight;
	}
}

class Eagle extends Animal1 {
	int wings;
	
	String fly() {
		return "»Œ»Œ ≥Øæ∆";
	}
}

public class Animal {

	public static void main(String[] args) {
		
		Lion simba = new Lion();
		simba.weight = 10;
		simba.eat();
				
		System.out.println(simba.roar() + simba.sleep() + simba.weight);
		
		Eagle e = new Eagle();
		e.pic = false;
		System.out.println(e.fly()+e.pic);
		
	}

}
