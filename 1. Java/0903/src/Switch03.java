import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s ;
		System.out.print("���ڸ� �Է��ϼ���");
		s = input.next();
		
		switch (s) {
		case "one" : System.out.println("1"); break;
		case "��" : System.out.println("2");break;
		case "��" : System.out.println("3");break;
		default : System.out.println("wrong");
		
		}

	}

}
