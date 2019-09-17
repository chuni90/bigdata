package emp.model;

/* 직원 - 이름
 *   정규직 -  급여(기본급)
 *   영업직 -  급여(기본급 + 판매실적 * 상여율)
 *   임시직 -  급여(근무시간 * 시간당급여)
 * */

public class Employee {
	private String name;

	public Employee(String name) {
		
		this.name = name;
	}
	
	public void show() {
		System.out.println("name : " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return 0;
	}
}
