// �߻�Ŭ����
abstract class Msg {
	// �߻�޼ҵ�, �޼ҵ����¸� �������� ��ü������ ���𰡸� ����� ���� ����
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
