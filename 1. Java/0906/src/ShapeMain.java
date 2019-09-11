//조상 클래스 (=추상 클래스)
abstract class Shape {
	// 추상 메소드 ->> 이 메소드는 상속받는 클래스에서 오버라이드 하면서 구체화 해줘야만 에러가 발생 안 함.
	abstract void draw();
	
}

//부모 클래스
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

//자식 클래스
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
