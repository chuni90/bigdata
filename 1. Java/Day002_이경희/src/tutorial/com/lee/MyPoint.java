
package tutorial.com.lee;

import java.util.Scanner;

public abstract class MyPoint {
	protected int x;
	protected int y;
	protected static Scanner sc;
	static { // static 으로 선언된 멤버를 초기화할 때 사용하는 구문
		sc = new Scanner(System.in);
	}
	
	/*public MyPoint() {
		sc = new Scanner(System.in);
	}*/
	protected abstract void input();
	protected abstract void output();
	
	/*
	 * 오버라이딩의 제약조건
	 * - 접근제한자(지정자)는 반드시 부모와 같거나 커야한다.
	 * - 예외처리문구 : 자식이 예외문구를 가지고 있다면 반드시 부모도 예외문구를 담아야 한다.
	 * 
	 * */
}
