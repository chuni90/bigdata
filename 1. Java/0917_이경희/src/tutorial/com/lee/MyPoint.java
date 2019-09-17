package tutorial.com.lee;

import java.util.Scanner;

public abstract class MyPoint {
	protected int x, y;
	protected static Scanner sc;
	static { // static으로 선언된 멤버는 이렇게 초기화 시킬 수 있음
		sc = new Scanner(System.in);
	}
	
	protected abstract void input();  // protected로 써야 자식클래스가 사용 가능해짐.
	protected abstract void output();
	
}
