package tutorial.com.lee;
import java.util.Scanner;

//평면위의 한 점을 추상화하는 클래스 Point
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
		System.out.println("점(x, y) = ("+ xpos + " , " + ypos + ")");
	}	
}