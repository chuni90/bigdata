// System.을 입력하지 않고도 out.print 만으로 출력 가능해지는 패키지를 import
import static java.lang.System.out;
//40행의 입력범위 에러 발생과 관련된 class
import java.util.InputMismatchException;
import java.util.Scanner; 


public class Try {
	
	public static void main(String[] args) {
	
		//try-catch문을 해보자
		int[] var = {10, 20, 30};
		
		for (int i = 0; i<=3; i+=1) {
			try {
				out.println(var[i]);
				out.println(i + "번째");  // 배열을 초과하여 윗줄에서 에러가 발생되면 현재 줄은 실행되지 않는 것을 확인할 수 있다.
			}catch (ArrayIndexOutOfBoundsException e) {
				out.println("배열을 넘음");	
			}
			
		}
		out.println("-----------------끝-----------------");
		
		// try-다중catch - finally
		// 여러 에러들에 대한 별도의 코드를 작성할 수 있다는 장점이 있음
		// 다만 catch마다 각 에러들을 잡아낼 때는 맨 아랫줄에 가장 기본 에러(모든 에러를 잡는 Exception과 같은)문이 들어가야
		// 그 윗줄 에러문들이 정확히 실행될 수 있다. 
		// finally는 코드의 실행/에러 유무에 상관없이 무조건 수행될 코드를 적는 곳
		
		int a = 10;
		
		try {
			out.println("정수 입력: ");
			Scanner input = new Scanner(System.in);
			int data = input.nextInt();
			
			out.println(a/data);
		}catch (InputMismatchException e){   // 클래스를 임포트 해야함..
			out.println("no num!!");
		}catch (ArithmeticException x) {
			out.println("0 is impossible");
		}catch (Exception i){   // 실제로는 제일 아래로 가야하는 코드임
			out.println("d");
		}finally {  //catch문으로 에러 처리 이후에, 실행 여부 및 에러 종류&여부에 상관없이 반드시 실행될 코드를 적는 곳
			out.println("Finally code Executed, 꼭 실행되야함!");
		}
	}


}
