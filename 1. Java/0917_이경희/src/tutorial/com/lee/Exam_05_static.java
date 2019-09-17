package tutorial.com.lee;

public class Exam_05_static {
	
	// 메인보다 더 앞서 실행하는 용도로 아래처럼 static을 넣기도 함
	static {
		System.out.println("static 실행");
	}
	
	public static void aaa() {
		System.out.println("aa");
	}
	
	public void bbb() {
		System.out.println("bb");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main");
		aaa();  // static으로 선언된 메서드로 바로 출력 가능
//		bbb();  // bbb메서드는 static이 아니므로 출력 불가능
		
		Exam_05_static b = new Exam_05_static();
		b.bbb();
	}

}
