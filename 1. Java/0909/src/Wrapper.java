
public class Wrapper {

	public static void main(String[] args) {
		
		// Wrapper 개념 공부하기
		// 기본자료형(int, double, boolean 등)을 객체로 바꿔(wrap해주는)주는 클래스
		
		boolean t = true;
		Boolean wrap_t = new Boolean(t);
		System.out.println(t+" a");
		
		double d = 1.231;
		
		System.out.println("double>> "+d);
		
		//"123"문자열에 +123을 해도 246이 되지 않음
		String s = "123";
		System.out.println(s+123);
		
		//s="123"을 Double wrapper로 변환하여 double로 만들고 숫자를 더하니 잘 계산됨.
		Double s_d = Double.parseDouble(s);
		System.out.println(s_d + 111);
		
		
		
	}

}
