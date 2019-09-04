package com.mega;

public class StringTest01 {

	public static void main(String[] args) {
		
		// String은 클래스로 변수를 생성하는 것으로 메모리의 스택이 아니라 힙(실제 영역)에 저장됨.
		// new 라는 코드가 힙에 저장시키게끔 하는 코드
		
		String s1 = "Hello world!!";  //new 가 생략된 형태
		String s2 = new String("I am a Programmer~");
		
		System.out.println(s1 + "\n" + s2);		
		
		
	}

}
