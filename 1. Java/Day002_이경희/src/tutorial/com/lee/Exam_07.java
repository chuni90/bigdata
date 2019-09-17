package tutorial.com.lee;

import java.util.Scanner;

class A{

	@Override
	public String toString() {
		return "AAA";
	}
	
}

class B{
	@Override
	public String toString() {
		return "BBB";
	}
}

public class Exam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		Object[] obj = new Object[5];
		
		while(true) {
			System.out.print("1.A  2.B  3.View 4.END = ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(count < obj.length) {
				if(menu == 1) {					
					obj[count++] = new A();	
				}
				else if(menu == 2){			
					obj[count++] = new B();
				}else if(menu == 3) {
					for(int i = 0; i < count; i++)
						System.out.println(obj[i]);
				}else if(menu == 4) {
					System.exit(0);
				}else {
					System.out.println("Error");
				}			
				
			}else {
				System.exit(0);
			}
		}
	}
}


