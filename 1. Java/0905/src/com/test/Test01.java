package com.test;

public class Test01 {
	
	private int testnum;
	
	public static void main(String[] args) {

		A obj = new A();
		//obj.num = 100;   //<-- private ������  AŬ������ �ƴ� ������ ���� �Ұ�
		obj.num2 = 10;
		obj.num3 = 40;
		obj.num4 = 50;
		
		// Test01 Ŭ���� �� testnum�̶�� private�Ӽ��� �����ϰ� �ڱ� Ŭ���� ������ ����� ������ ���
		Test01 t = new Test01();
		t.testnum = 99;
		
	}

}
