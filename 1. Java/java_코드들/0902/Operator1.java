

public class Operator1 {

	public static void main(String[] args) {
		System.out.println("---------산술연산자------");
		//산술연산자
		
		int num1, num2;
		num1 = 10;
		num2 = 2;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
//-----------------------------------------------------		
		System.out.println("---------증감연산자------");
		
		//증감연산자
		int num3 =5;
		int num4 =3;
		
		System.out.println(++ num3);
		System.out.println(num4 ++);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num3++ + ++num4);
		System.out.println(--num3 - --num4);
//-----------------------------------------------------		
		System.out.println("---------관계연산자-------");
		
		//관계연산자
		int x = 3 ;
		int y = 4 ;
		
		System.out.println( (x==y) + " ");
		System.out.println( (x!=y) + " ");
		System.out.println( (x>y) + " ");
		System.out.println( (x<y) + " ");
		System.out.println( (x<=y) + " ");
	}

}
