class Car{
	//�Ӽ�
	String color;
	String brand;
	int gear;
	int speed;
	
	//�޼ҵ�
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
	
	// StringŸ���� toString �޼ҵ带 java.lang���� �ҷ��ͼ� ���(�θ� -�ڽ� ����� ����)
	public String toString() {
		return "����: " + color + "  �귣��: " + brand + "  �ӵ�: " + speed;
	}
	
}

// main �޼ҵ尡 �ִ� �Ϳ� ���ϸ� 'Main' �� �־������. ���ϸ� ��Ģ�� ���� ����
// public�� �� Ŭ������ ���Ͽ� �� 1�� ������. �׷��� ���� main�� �ٿ���.

public class CarMain {

	public static void main(String[] args) {
		
		// ��ü ����
		// Ŭ������ ��ü�� = new Ŭ������();
		
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
