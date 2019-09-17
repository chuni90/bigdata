package tutorial.com.lee;

class JBank{
	private String name;
	private int money;
	private static float rate;  // static으로 선언
	
	public JBank(String name, int money, float rate) {
		this.name = name;
		this.money = money;
		JBank.rate = rate;	// static은 클래스명으로 호출
	}
	
	public void disp() {
		System.out.println(name + ": " + money + ": " + rate);
	}
	
}

public class Exam_04_static {

	public static void main(String[] args) {
		// 초기 고객
		JBank jb = new JBank("aaa", 10000, 0.07f);
		
		// 중기 고객
		JBank jb2 = new JBank("BB", 10000, 0.03f);
		
		// 후기 고객
		JBank jb3 = new JBank("ㅊ", 10000, 0.05f);
		
		jb.disp();
		jb2.disp();
		jb3.disp();
		
		
	}

}
