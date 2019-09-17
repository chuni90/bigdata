package tutorial;  // 패키지는 딱 1개만 사용 가능함.

// public class는 1개만 사용 가능한데 java 파일명이랑 동일한 클래스만 적용 가능
// public은 없어도 됨

public class Exam_01 {
	// Member Field, 멤버 필드, 변수 (데이터의 주소를 저장하는 공간)
	
	// Constructor Method, 생성자 메소드
	
	// Member Method, 멤버 메소드
	// static은 메서드에 붙으면 공유의 의미이자 '시작점' 여기서 코드를 시작해라라는 의미, 이것도 클래스에선 1개만 적용됨, 변수엔 여러개 적용 가능
	public static void main(String[] ar) {  // ← Call Back Method : 시스템이 자동으로 호출, 작동하는 메소드
		// 선언문 : 변수의 자료형과 초기값을 선언하는 문장
		/*
		* 자료형(Data Type) : 변수나 상수의 크기를 규정해 놓은 키워드
		* 논리형자료형 : 1byte, true/false 로 구분
		* 정수형자료형
		* - byte : 1byte(-128 ~ 127)
		* - char : 2byte
		* - short : 2byte
		* - int : 4byte, 기본형
		* - long : 8byte
		* 실수형자료형
		* - float : 4byte
		* - double : 8byte, 기본형
		* 
		* 참조형자료형 (Reference), 무조건 4byte, 참조형은 자료의 주소를 저장하므로 4byte(자료 그 자체가 아니라)
		* - String : 문자열 자료형
		* - 클래스명, 배열명 ...
		* 
		
		*/
		// 입력문 : 입력 형식에 맞게 작성하는 문장 [e.g Scanner]
		
		// 처리문 : 비즈니스 로직, 실제 처리하는 내용을 작성하는 문장
		
		// 출력문 : 출력 형식에 맞게 작성하는 문장 [e.g System.out]
					// IO 스트림 안에는 Input 스트림 및 Output 스트림이 2가지 있고, Output 스트림에는 print 메소드
		
	}
	
	public void aaa () { // 사용자 메소드 : 유저가 정의하고 호출해야 작동하는 메소드
		// 선언문
		
		// 입력문
		
		// 처리문
		
		// 출력문
		
	}
	
	// Inner Class, Nested Class, 중첩 클래스
	
	
}
