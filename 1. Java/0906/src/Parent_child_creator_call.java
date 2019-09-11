class Parent{
	public Parent() {
		System.out.println("부모생성자 호출\n");
		
	}
	
}
////////////////////////////
class Child extends Parent{
	public Child () {
		System.out.println("자식생성자 호출\n");
	}
	
}
public class Parent_child_creator_call {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("변경 전 p의 메모리 주소: " + p);
		
		// c객체를 p객체로 붙여넣기 하는 코드. 그렇다면 기존의 p저장메모리는 garbage로 이동
		// 우측의 결과를 보면 p의 주소가 c의 주소로 바뀐 것을 볼 수 있음.
		p = c;  
		System.out.println("변경 후 p의 메모리 주소: " + p);
		System.out.println(c+"\n");
		
		// 아래 코드는 dtype은 부모, 생성자는 자식인 case. 
		// 즉 자식으로 만들고 부모타입에 넣을 수 있음(자식이 개념적으로는 더 확장된 형태니까)
		// 반대의 경우는 당연히 불가능
		Parent c2 = new Child();
	}

}
