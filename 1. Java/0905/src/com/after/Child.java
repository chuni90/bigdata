package com.after;

// 부모클래스 메소드를 자식클래스에서 사용 및 재정의 해보기

class Parent {
	public void print() {
		System.out.println("ㅂ모");
	}
}

public class Child extends Parent {
	
	public void print()	{
		super.print();  // super는 부모클래스를 가져오는 걸 의미함. (this와 같은 맥락)
		System.out.println("자식");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.print(); // 이렇게 하면 super.print()와 print("자식") 이 실행됨.
	}

}
