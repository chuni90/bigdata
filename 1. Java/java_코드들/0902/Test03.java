

//사각형을 구하는 클래스 생성

public class Test03 {

	public static void main(String[] args) {
		double height, length;
		double space = 0.0;
		
		height = 2.0;
		length = 1.0;
		space = (height * length);
		System.out.println("사각형 넓이는 "+space);
//---------------------------------------------------------------
		//원의 넓이 구하기
		
		double radius, area, area2;
		// 상수선언은 final이 붙어야 하고, 상수명은 관레적으로 모두 대문자로 구성함
		final double PI = 3.1431592;
		
		radius = 5.0;
		area = PI * radius * radius;
		System.out.println("원의 넓이는 "+ "\n"+area);
		
	}

}
