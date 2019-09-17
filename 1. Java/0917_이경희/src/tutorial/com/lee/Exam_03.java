package tutorial.com.lee;

/*
 * abstract와 interface
 * 
 * 1. abstract : 추상, 설계도(디자인을 목적으로 구현되는 클래스)
 * 		- abstract 클래스 : abstract 메서드를 포함하고 있는 클래스
 * 		- abstract 메서드 :
 * 			void 클래스명() {
 * 			중괄호 안이 내용부, 여기가 비어있어야 함. 구체화(=오버라이딩)는 상속 받은 클래스가 반드시 해야하므로 여긴 비움.
 * 			}
 * 
 * 2. interface : 인터페이스
 * 		- 다중상속을 목적으로 구현된 클래스
 * 		- abstract 클래스의 한 종류이다. 그래서 abstract 메서드를 가질 수 있음. 일반 클래스는 추상메서드를 가질 수 없으므로..!
 * 		- 제약조건 
 * 			static final 멤버필드
 * 			생성자메서드 : 사용불가(=객체를 생성할 수 없다는 의미)
 * 			abstract 멤버메서드
 * 			static inner 중첩클래스
 * 	- static : 공유의 의미. 클래스명으로 접근이 가능하다.
 *  - final : 변경 불가의 의미. 선언과 동시에 초기화(값 부여)가 필요함.
 */
interface AAA{
	// 멤버필드
	public static final int x = 10;
	public static int y = 20;   // final 이 생략되어도 interface에선 final로 취급
	public int z = 30;			// static final이 생략 가능
	int w = 40;					// 모두 생략 가능
	
	// 생성자 메서드 : 가질 수 없음
//	public AAA() {
//	}
	
	// 멤버메서드 : 중괄호 안의 내용부를 가질 수 없으므로 아예 중괄호가 없이 끝내야함
	public abstract void aaa(); 
	abstract void bbb();  // abstract 생략 가능
	void ccc();
	
	// 중첩클래스
	static class Inner{}
	
}
public class Exam_03 {

	public static void main(String[] args) {
		
//		AAA a = new AAA(); // 생성자가 없으니까 객체 생성 불가능
		// 아래 코드처럼 static 클래스명으로 호출 가능
		System.out.println("x = " + AAA.x);
		System.out.println("y = " + AAA.y);
		System.out.println("z = " + AAA.z);
		System.out.println("w = " + AAA.w);
		
		// final은 변경 불가
//		AAA.x = 100; 
//		AAA.y = 100; 
//		AAA.z = 100; 
//		AAA.w = 100;
		
		
	}

}
