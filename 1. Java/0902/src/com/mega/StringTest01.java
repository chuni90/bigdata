package com.mega;

public class StringTest01 {

	public static void main(String[] args) {
		
		// String은 클래스로 변수를 생성하는 것으로 메모리의 스택이 아니라 힙(실제 영역)에 저장됨.
		// 힙에 저장된다고 변경이 불가능한 건 아님. 새롭게 선언 가능함
		
		// new 라는 코드가 힙에 저장시키게끔 하는 코드이지만 굳이 안써도 자동으로 붙는 경우가 많음.
		
		String s1 = "Hello world!!";  //new 가 생략된 형태
		String s2 = new String("I am a Programmer~");
		
		System.out.println(s1 + "\n" + s2);		
		
		
	}

}
