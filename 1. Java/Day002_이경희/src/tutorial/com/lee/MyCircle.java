package tutorial.com.lee;

public class MyCircle extends MyPoint{
	private int r;
	
	//public MyCircle() {
		/*System.out.print("x = ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("y = ");
		y = Integer.parseInt(sc.nextLine());
		System.out.print("r = ");
		r = Integer.parseInt(sc.nextLine());*/
	//}

	@Override
	public void input(){
		System.out.print("x = ");
		x = Integer.parseInt(sc.nextLine());
		System.out.print("y = ");
		y = Integer.parseInt(sc.nextLine());
		System.out.print("r = ");
		r = Integer.parseInt(sc.nextLine());		
	}

	@Override
	public void output() {
		System.out.println("��(x, y) = (" + x + "," + y + ")");
		System.out.println("������(r) = " + r);
	}

}
