// �������̽��� ��� ���� ���� implements�� �����. �θ�Ŭ���� ��Ӱ� �ٸ��� 2�� �̻��� ��ǥ�� ���� ����
// �� �Ŀ� �߻�޼ҵ���� ��üȭ ���ִ� �۾��� ����

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
		
		// ��ü ����
		Tv t = new Tv();
		t.turnOn();
		t.turnOff();
		
	}

	

	
}
