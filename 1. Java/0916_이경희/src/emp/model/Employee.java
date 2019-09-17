package emp.model;

/* 	직원 - 이름, 급여
 * 		정규직 - 급여(기본급)
 * 		영업직 - 급여(기본급 + 판매실적*상여율)
 * 		임시직 - 급여(근무시간 * 시급)
 */

public class Employee {
	private String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("name: " + name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return 0;		// 자식들이 오버라이딩 하기 위해서 만들어논 추상 메소드 형식임. 구체화는 자식클래스에서 실시
	}
	
	
}
