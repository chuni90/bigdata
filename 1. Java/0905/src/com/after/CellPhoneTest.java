package com.after;

public class CellPhoneTest {

	public static void main(String[] args) {
		
		D_ca dca = new D_ca("노트8", "010-3333", 21, "12화소");
		
		Mp3 mp3 = new Mp3("G2", "010-3974", 31, 128);
		
		System.out.printf("\n모델명: %s, 번호: %s, 화소: %s", dca.getModel(), dca.getNum(),
				dca.getPixel());
		
		System.out.printf("\n모델명: %s, 번호: %s, 용량: %d", mp3.getModel(), mp3.getNum(),
				mp3.getSize());
		
	}

}
