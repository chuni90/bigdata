class Car{
	//속성
	String color;
	String brand;
	int gear;
	int speed;
	
	//메소드
	void stop() {
		System.out.println("Stop");
	}
	void start() {
		System.out.println("Start");
	}
	int speedUp(int s) {
		speed = speed + s;
		return speed;
	}
	
	// String타입의 toString 메소드를 java.lang에서 불러와서 사용(부모 -자식 상속의 개념)
	public String toString() {
		return "색상: " + color + "  브랜드: " + brand + "  속도: " + speed;
	}
	
}

// main 메소드가 있는 것에 파일명에 'Main' 을 넣어줘야함. 파일명 규칙과 같은 것임
// public이 들어간 클래스는 파일에 딱 1개 여야함. 그래서 보통 main에 붙여줌.

public class CarMain {

	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스명 객체명 = new 클래스명();
		
		Car mycar = new Car();
		mycar.color = "blue";
		mycar.brand = "Audi";
		mycar.speed = 30;
		
		mycar.start();
		System.out.println(mycar.speedUp(100));
		System.out.println(mycar.speed);
		
		System.out.println(mycar.toString());
	}
}
