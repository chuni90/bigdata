import java.util.Scanner;

public class Test_String {

	public static void main(String[] args) {
		
		//문자열 비교해보기..python은 ==으로 다해주는데..ㅠㅠ
		
		String s1 = new String("Hello!!");
		String s2 = new String("Hello!!");
		
		char s3 = 'a';
		char s4 = 'a';
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-----------------------");
		
		// == 은 문자비교가 아니라 **주소**를 비교한 것이기에, different가 반환됨.
		if (s1 == s2) {
			System.out.println("same");
		}else 
			System.out.println("differnt");
		System.out.println("-----------------------");
		
		// char는 == 로 비교가 되네??
		if (s3 == s4) {
			System.out.println("char>> same");
		}else 
			System.out.println("char>> differnt");
		System.out.println("-----------------------");
		
		// equals(변수명 또는 "문자열") 으로 문자열을 비교함.
		if (s1.equals(s2)) {
			System.out.println("same");
		}else 
			System.out.println("differnt");
		System.out.println("-----------------------");
		
		// equals 메소드들 사용해보기
		String bbc = "bbcde";
		// 대소문자 상관없이 비교할 때, equalsIgnoreCase
 		System.out.println("equalsIgnoreCase>> " + bbc.substring(0,3).equalsIgnoreCase("bbc"));
 		// 변수없이 바로 계산하는 것은 contentEquals를 주로 사용해서 비교함. 
 		System.out.println("contentEquals>> " + bbc.substring(0,3).contentEquals("bbc"));
 		System.out.println("-----------------------");
		
		String proverb = "A barking dog";		// new 연산자 생략
	 	String a1, a2, a3, a4;	// 참조 변수로서 메소드에서 반환된 참조값을 받는다.
	 	
	 	System.out.println();
	 	System.out.println ("문자열의 길이 =" + proverb.length());
	 	System.out.println("-----------------------");
	 	a1 = proverb.concat (" never Bites!");	// 문자열 결합
 		a2 = proverb.replace ('b', 'B');		// 문자 교환 (바꿀 문자, 바뀔 문자)
 		a3 = proverb.substring (2, 5);		// 부분 문자열 추출
 		a4 = proverb.toUpperCase();		// 대문자로 변환 
 		
 		System.out.println();
 		System.out.println("concat>> "+ a1);
 		System.out.println("replace>> "+ a2);
 		System.out.println("substring>> "+ a3);
 		System.out.println("toUpperCase>> "+ a4);
 		System.out.println("-----------------------");
 		
 		// 문자열을 숫자로 바꾸기 위해서 사용하는 class를 wrapper class라고 한다.
 		// int로 바꾸기 위해 Integer 클래스의 parseInt 메소드를 사용
 		int i = Integer.parseInt("2222");
 		System.out.println(i+1);
 		
 		// double로 바꾸기 위해 Double 클래스의 parseDouble 메소드를 사용함
 		double ii = Double.parseDouble("3.223");
 		System.out.println(ii);
		System.out.println("-----------------------");
 		
 		// 입력한 문자열이 www로 시작하는 지 검사, 종료를 원하면  quit 입력
 		System.out.println("\n>>> www 판독기 시작 <<<");

 		Scanner input = new Scanner(System.in);
 		String adr;
 		String domain;
 		
 		while(true) {
	 		System.out.println("문자열 입력>> ");
	 		adr = input.next();
	 		domain = adr.substring(0,3);
	 		
	 		if (adr.equals("quit")) {
	 			System.out.println("종료");
	 			break;
	 		}else if (domain.equals("www")) {
	 			System.out.printf("%s 은 'www'로 시작합니다\n", adr);
	 		}else 
	 			System.out.printf("%s 는 'www'로 시작 안 함\n", adr);
 		}
 		
	}

}
