import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		int i;
		int j = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("구구단 시작값 : ");
		i = input.nextInt();
		
		while (j <= 9) {
			
			System.out.println(i+" * "+j+" = "+(i*j));
			j+=1;
		}
		
	}

}
