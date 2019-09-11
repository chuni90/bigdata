package com.after;

public class Mp3 extends CellPhone {
	
	int size;
	
	public Mp3 (String model, String num, int chord, int size) {
		this.model = model;
		this.number = num;
		this.chord = chord;
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	
}
