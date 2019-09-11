package com.mega;

public class distance {

	public static void main(String[] args) {

		//final 을 통해 상수개념 적용, 해당 코드를 변경하지 않는 한 다른 곳에선 해당 변수 변경 불가능
		final double light_speed = 30e4;
//		light_speed = 22; # 주석 풀고 실행시켜보면, 에러 발생
		
		double distance = 40e12;
		
		double secs;
		
		secs = distance / light_speed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 "+ light_year + "광년입니다.");
		
		
	}

}
