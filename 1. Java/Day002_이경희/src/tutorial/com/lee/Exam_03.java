package tutorial.com.lee;

/*
 * abstract와 interface
 * 1. abstract : 추상, 설계도(디자인을 목적으로 구현되는 클래스)
 *   - abstract 클래스 : abstract 메서드를 포함하고 있는 클래스
 *   - abstract 메서드
 *     내용부를 담을 수 없다.
 *     void aaa(){
 *       // 내용부
 *     }
 *     반드시 오버라이딩(재정의)해야 한다.
 *     
 * 2. interface : 인터페이스
 *    - 다중상속을 목적으로 구현된 클래스
 *    - abstract 클래스의 한 종류이다.
 *    - 제약조건
 *      static final 멤버필드
 *      생성자메서드 => 사용불가, 객체를 생성할 수 없다.
 *      abstract 멤버메서드
 *      static Inner 중첩클래스    
 *   - static : 공유
 *              클래스명으로 접근이 가능하다.   
 *   - final : 변경불가
 *             선언과 동시에 값을 가지고 있어야 한다.   
 * */

interface AAA{
	// 멤버필드
	public static final int x = 10;
	public static int y = 20;
	public int z = 30;
	int w = 40;
	
	// 생성자 메서드
	//public AAA() {}
	
	// 멤버 메서드
	public abstract void aaa();
	abstract void bbb();
	void ccc();
	
	// 중첩 클래스
	static class Inner{}
}

public class Exam_03 {
	
	//public abstract void aaa();

	public static void main(String[] args) {
		//AAA a = new AAA();
		// static은 클래스명으로 접근이 가능하다.
		System.out.println("x = " + AAA.x);
		System.out.println("y = " + AAA.y);
		System.out.println("z = " + AAA.z);
		System.out.println("w = " + AAA.w);
		
		// final은 변경이 불가능하다.
		//AAA.x = 100;
		//AAA.y = 200;
		//AAA.z = 300;
		//AAA.w = 400;
		final int a = 10;
		//a = 20;
	}

}
