package tutorial.com.lee;

public class Exam_05 {
	
	static {
		System.out.println("start");
	}

	public static void aaa() {
		System.out.println("AAA");
	}
	
	public void bbb() {
		System.out.println("BBB");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");		
		aaa();
		Exam_05 ex = new Exam_05();
		ex.bbb();
	}

}
