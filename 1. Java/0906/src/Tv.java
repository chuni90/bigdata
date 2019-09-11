// 인터페이스를 상속 받을 때는 implements를 사용함. 부모클래스 상속과 다르게 2개 이상을 쉼표로 적용 가능
// 그 후에 추상메소드들을 구체화 해주는 작업을 진행

public class Tv implements Remote, Vol{

	@Override
	public void turnOn() {
		System.out.println("Turn on the Tv");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the Tv");
	}
	
	@Override
	public void volUp() {
		
	}

	@Override
	public void volDown() {
		
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		Tv t = new Tv();
		t.turnOn();
		t.turnOff();
		
	}

	

	
}
