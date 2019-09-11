package com.test;

class Students {
	private int number;
	private String name;
	private int age;
	
	Students(){
		number = 100;
		name = "New";
		age = 18;
	}
	
	Students(int x, String y, int z){
		number = x;
		name = y;
		age = z;
	}
	
	// �Ʒ��� String toString�� �־�� ���߿� ��ü�� print�ϱ� ����.
	// �̰� ���ٸ� ���� ����� '�ּ�'�� ��ȯ��.
	
	@Override
	public String toString() {
		return "Student [num="+number+", name=" + name + ", age=" + age +"]";
	}
}

public class Student {

	public static void main(String[] args) {
		Students a = new Students(10,"õ",30);
		System.out.println("�׳� a ���>> " + a);
		System.out.println("toString ���>>" + a.toString());
		
		Students b = new Students();
		System.out.println("default ������ ���>> "+ b);

		
	}

}
