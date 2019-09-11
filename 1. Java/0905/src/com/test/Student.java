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
	
	// 아래의 String toString이 있어야 나중에 객체를 print하기 편함.
	// 이게 없다면 힙에 저장된 '주소'가 반환됨.
	
	@Override
	public String toString() {
		return "Student [num="+number+", name=" + name + ", age=" + age +"]";
	}
}

public class Student {

	public static void main(String[] args) {
		Students a = new Students(10,"천",30);
		System.out.println("그냥 a 출력>> " + a);
		System.out.println("toString 출력>>" + a.toString());
		
		Students b = new Students();
		System.out.println("default 생성자 출력>> "+ b);

		
	}

}
