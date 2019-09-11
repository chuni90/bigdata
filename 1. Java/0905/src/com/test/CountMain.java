package com.test;

class Counter{
	
	
	int cnt;
	// 생성자는 클래스와 동일하게 생김(변수 타입이나 void가 필요없음)
	public Counter() {
		cnt = 10;
	}
	
	// 다형성을 이용하여 파라미터만 바꾼 생성자 형태
	public Counter(int c) {
		cnt = c;
	}
	
}


///////////////////////////////////////
public class CountMain {

	public static void main(String[] args) {

		Counter a = new Counter();
		System.out.println(a.cnt);  // 위에서 cnt의 기본값을 10으로 세팅한 걸 확인 가능
		
		Counter b = new Counter();
		System.out.println(b.cnt);
		
		Counter c = new Counter(5);
		System.out.println(c.cnt);
		
		
	}

}
