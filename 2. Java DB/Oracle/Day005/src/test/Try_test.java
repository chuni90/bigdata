package test;


public class Try_test {
	
	public static void main(String[] args) {
		int x = 0;
		
		try {		
			x = 10 / 4;
			System.out.println("x = " + x);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("오류메시지	: " + e.getMessage());
		}finally {
			System.out.println("쉬었다 갈까요?");
		}
		
		
		
	}

}
