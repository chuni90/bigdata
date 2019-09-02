

public class DtypeChange {
// 강제 형변환
	public static void main(String[] args) {
		int i;
		double f;
		
		// 정수형태의 나눗셈 결과는 1 이기 때문에, 소수점 값이 모두 날아감
		f = 5 / 4 ;
		System.out.println(f);

		
		// 분자를 실수로 바꿔줌에 따라 소수점이 다시 살아남
		f = (double) 5 / 4;
		System.out.println(f);

		// 실수를 둘 다 정수로 바꿔서 (1 + 1이 되버림) 소수점이 모두 날아감
		f = (int) 1.3 + (int) 1.8;
		System.out.println(f);

	}

}
