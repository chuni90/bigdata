
public class Breakcon {

	public static void main(String[] args) {
		
		System.out.println("continue");
		for(int i=1; i<=10; i+=1) {
			if(i==5) continue;
			System.out.printf("%d \n", i);
		}
		System.out.println("\nbreak");
		for(int i=1; i<=10; i+=1) {
			if(i==5) break;
			System.out.printf("%d ", i);
		}
		
	}

}
