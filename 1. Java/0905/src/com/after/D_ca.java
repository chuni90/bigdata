package com.after;

// make a child class

public class D_ca extends CellPhone {
	
	String pixel;
	
	public D_ca (String model, String num, int chord, String pixel) {
		this.model = model;
		this.number = num;  // QQQQQQ 책에서는 왜 this를 뺏을까?????? 
		this.chord = chord;
		this.pixel = pixel;
	}
	
	public String getPixel() {
		return pixel;
	}
	
}
