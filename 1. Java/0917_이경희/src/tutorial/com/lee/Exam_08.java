package tutorial.com.lee;

public class Exam_08 {
	int x =0 ;
	
	public static void main(String[] args) {
		Exam_08 ex = new Exam_08();
		for(int i = 0; i<5; i++)
			ex.aaa();
	}
	
	public void aaa() {
		int z = 0;
		x++;
		z++;
		System.out.println("x:" + x + ", y: " + z);
		
	}
	
}
