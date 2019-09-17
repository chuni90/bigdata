package tutorial.com.lee;

class JBank{
	private String name;
	private int money;
	private static float rate ;
	static {
		rate = 0.03f;
	}
	
	public JBank(String name, int money, float rate) {
		this.name = name;
		this.money = money;
		JBank.rate = rate;
	}
	
	public void disp() {
		System.out.println(name + ":" + money + ":" + rate);
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		// ÃÊ±â°í°´
		JBank aaa = new JBank("aaa", 10000, 0.07f);
		// Áß±â°í°´
		JBank bbb = new JBank("bbb", 10000, 0.03f);
		// ÈÄ±â°í°´
		JBank ccc = new JBank("ccc", 10000, 0.05f);
		
		aaa.disp();
		bbb.disp();
		ccc.disp();
	}

}
