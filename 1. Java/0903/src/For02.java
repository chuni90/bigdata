public class For02 {

	public static void main(String[] args) {

		//중첩  for문
		
		for(int i=1; i<=2; i++) {
			System.out.print("\tfor1 >>" + i);
			for(int j=1; j<=5; j++) {
				System.out.println("for2 >>" + j);
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i+=1) {
			for(int j=1; j<=i; j+=1) {
				System.out.print("*");	
			} 
			System.out.println();
		}
		
		for(int i=1; i<=5; i+=1) {
			for(int j=5; j>=i; j-=1) {
				System.out.print("*");	
			} 
			System.out.println();
		}
		
		
		for(int i=2; i<=9; i+=1) {
			for(int j=1; j<=9; j+=1) {
				// %d는 정수, %f는 실수, %c는 문자, %s는 문자열
				System.out.printf("%d * %d = %2d\n", i,j,(i*j));
			} 
			System.out.println(i+" 단 끝\n");
		}
		
	}

}








