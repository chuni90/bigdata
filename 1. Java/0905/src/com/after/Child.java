package com.after;

// �θ�Ŭ���� �޼ҵ带 �ڽ�Ŭ�������� ��� �� ������ �غ���

class Parent {
	public void print() {
		System.out.println("����");
	}
}

public class Child extends Parent {
	
	public void print()	{
		super.print();  // super�� �θ�Ŭ������ �������� �� �ǹ���. (this�� ���� �ƶ�)
		System.out.println("�ڽ�");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.print(); // �̷��� �ϸ� super.print()�� print("�ڽ�") �� �����.
	}

}
