package com.after;

// make a child class

public class D_ca extends CellPhone {
	
	String pixel;
	
	public D_ca (String model, String num, int chord, String pixel) {
		this.model = model;
		this.number = num;  // QQQQQQ å������ �� this�� ������?????? 
		this.chord = chord;
		this.pixel = pixel;
	}
	
	public String getPixel() {
		return pixel;
	}
	
}
