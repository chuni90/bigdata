package com.mega;

public class distance {

	public static void main(String[] args) {

		//final �� ���� ������� ����, �ش� �ڵ带 �������� �ʴ� �� �ٸ� ������ �ش� ���� ���� �Ұ���
		final double light_speed = 30e4;
//		light_speed = 22; # �ּ� Ǯ�� ������Ѻ���, ���� �߻�
		
		double distance = 40e12;
		
		double secs;
		
		secs = distance / light_speed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("�ɸ��� �ð��� "+ light_year + "�����Դϴ�.");
		
		
	}

}
