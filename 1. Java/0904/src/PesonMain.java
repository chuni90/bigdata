
public class PesonMain {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명();
		// 클래스명 객체명 = new 생성자();
		// new를 통해 허공에 있던 클래스를 객체화해서 hip에 저장함으로써 우리가 실제적으로 사용할 수 있는 것임.

		Person obj = new Person();
		
		// 클래스를 객체로 만들고(여기선 Person을 obj로 객체화함), 그 후에  객체화한 클래스 내부의 (속성,동작)을 사용함
		
		obj.name = "han";
		obj.age = 32;
		obj.height = 182;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.height);
		obj.eat();
		
		System.out.println();
		
		Person 승현 = new Person();
		승현.name="천승현";
		승현.age = 30;
		승현.sleep();
		
		System.out.println(승현.age);
		
		// 승현의 height는 따로 값을 주지 않았기에 기본값인 0.0(double로 선언됨)으로 나타남
		// 기본값 int 0 | float 0.0 | String null
		System.out.println(승현.height);
		
	}

}
