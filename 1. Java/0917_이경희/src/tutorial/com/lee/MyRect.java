package tutorial.com.lee;

public class MyRect extends MyPoint{
	private int w;
	private int h;
	
	
	@Override
	public void input() {
		System.out.print("x = ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("y = ");
		y = Integer.parseInt(sc.nextLine());
		System.out.print("w = ");
		w = Integer.parseInt(sc.nextLine());
		System.out.print("h = ");
		h = Integer.parseInt(sc.nextLine());
		
		
	}

	@Override
	public void output() {
		System.out.println("��(x, y)= (" + x + ", " + y + ")");
		System.out.println("�ʺ�= " + w + ", ����= " + h);
	}
	
	
}
