package com.after;

public class CellPhoneTest {

	public static void main(String[] args) {
		
		D_ca dca = new D_ca("��Ʈ8", "010-3333", 21, "12ȭ��");
		
		Mp3 mp3 = new Mp3("G2", "010-3974", 31, 128);
		
		System.out.printf("\n�𵨸�: %s, ��ȣ: %s, ȭ��: %s", dca.getModel(), dca.getNum(),
				dca.getPixel());
		
		System.out.printf("\n�𵨸�: %s, ��ȣ: %s, �뷮: %d", mp3.getModel(), mp3.getNum(),
				mp3.getSize());
		
	}

}
