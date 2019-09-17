package emp.model;


// 정규직(Permanent) 직원의 정보를 저장하기 위한 객체

public class Permanent extends Employee{
//	private String name;
	private int salary;
	
	public Permanent(String name, int salary) {
		super(name);  // 부모의 생성자가 default가 아니라서 초기화 값에 파라미터 name을 전달함
		this.salary = salary;
		
	}

//	@Override
//	public String toString() {
//		return "Permanent [name=" + name + ", salary=" + salary + "]";
//	}
	
	public void show() {
//		System.out.println("Name >> "+ name);  <<== name 변수가 부모한테 있으므로 에러
		super.show();	// <= show를 오버라이드 했지만 부모것을 가져오므로 super.메소드() 사용
		System.out.println("Pay >> "+ getSalary());
	}
	

//	public String getName() {
//		return name;
//	}

	public int getSalary() {
		return salary;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
