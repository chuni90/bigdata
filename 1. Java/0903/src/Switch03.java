import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s ;
		System.out.print("문자를 입력하세요");
		s = input.next();
		
		switch (s) {
		case "one" : System.out.println("1"); break;
		case "둘" : System.out.println("2");break;
		case "삼" : System.out.println("3");break;
		default : System.out.println("wrong");
		
		}

	}

}
