package tutorial.com.lee;
import java.util.Scanner;

//������� �� ���� �߻�ȭ�ϴ� Ŭ���� Point
public class Point{
	private int xpos;
	private int ypos;
	protected Scanner sc;
	
	public Point() {
		sc = new Scanner(System.in);
		System.out.print("xpos = ");
		xpos = Integer.parseInt(sc.nextLine());
		System.out.print("ypos = ");
		ypos = Integer.parseInt(sc.nextLine());
	}
	
	public void disp() {
		System.out.println("��(x, y) = ("+ xpos + " , " + ypos + ")");
	}	
}