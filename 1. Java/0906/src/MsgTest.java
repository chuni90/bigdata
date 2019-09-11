// 추상클래스
abstract class Msg {
	// 추상메소드, 메소드형태만 존재하지 구체적으로 무언가를 만들어 놓지 않음
	abstract void send();
}

class Phone extends Msg{

	@Override
	void send() {
		System.out.println("phone number is 010-33-22");
		System.out.println("content is ");
		
	}
	
}

class Email extends Msg{
	
	@Override
	void send() {
		System.out.println("mail address : lover22@naver.co");
		System.out.println("content is ");
		
	}
}

public class MsgTest {

	public static void main(String[] args) {

		Phone p = new Phone();
		Email e = new Email();
		p.send();
		e.send();
		
	}

}
