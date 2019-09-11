//���� Ŭ���� (=�߻� Ŭ����)
abstract class Shape {
	// �߻� �޼ҵ� ->> �� �޼ҵ�� ��ӹ޴� Ŭ�������� �������̵� �ϸ鼭 ��üȭ ����߸� ������ �߻� �� ��.
	abstract void draw();
	
}

//�θ� Ŭ����
class Rect extends Shape{
	int x, y;
	
	void draw() {
		System.out.println("Rect: "+ x +", "+ y+"\n");
	}
	
}

class Cir extends Shape {
	double r ;
	
	void draw() {
		System.out.println(r+": Cir\n");
	}
	
}

//�ڽ� Ŭ����
class ColRect extends Rect {
	String col;
	
	void draw() {
		System.out.println("ColRect\n");
	}
	
	
}
/////////////////////////////////////////////////////////////////
public class ShapeMain {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		r.x = 10;
		r.y = 5;
		r.draw();

		Cir c = new Cir();
		c.draw();
		
		ColRect cr = new ColRect();
		cr.draw();
	}

}
