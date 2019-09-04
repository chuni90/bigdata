import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {
		int i = 1 ;
		int sum = 0;
		
		do {
			System.out.println(i);
			sum = sum + i;
			i++;
		}while(i <= 10);
		System.out.println("гу╟Х: " + sum);
	
		System.out.println("------------");
	}
}
