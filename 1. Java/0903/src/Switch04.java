import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		
		int month;
		
		Scanner input = new Scanner(System.in);
		System.out.println("일수를 알고 싶은 달 입력");
		month = input.nextInt();
		
		// 31일 : 1,3,5,7,8,10,12
		// 30일 : 4,6,9,11
		// 28일 : 2
		
		switch (month) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : System.out.println("31"); break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : System.out.println("30"); break;
		default : System.out.println("28"); break;
		}
		
	}

}
