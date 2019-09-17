package tutorial;
import java.util.Scanner;
import java.util.ArrayList;

/*
* 급여관리 프로그램 만들어보기
* A사가 직원 급여를 관리할 목적으로 프로그램을 구현하려고 함.
* - 직원 등록, 직원 급여 출력, 매달 지급되는 급여의 총 금액 출력,
* - 직원(정규직)은 이름, 급여 가지고 있다.
*/


//MVC에서 Model 역할하는 클래스
class Permanent{
	private String name;  // private을 통해서 내용은 변경하되 틀은 변경하지 못하도록 함
	private int salary;
	
	public Permanent(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() { // toString은 생략가능한 메서드 명칭임, return이기 때문에 print문이 필요함
		return "Permanent [name=" + name + ", salary=" + salary + "]";
	}
	
	public void show() {
		System.out.println("이름: " + name);
		System.out.println("급여: " + getSalary());
	}
	
}

// MVC에서 Controller(=Handler) 역할하는 클래스
class EmployeeManager{
	
//	Permanent[] emp = new Permanent[2];  // <=저장공간을 지정해야한 다는 불편함 초래
//	int index = 0;						 // <=

	ArrayList<Permanent> empList = new ArrayList<Permanent>();
	
	
	// 직원 등록 메서드
	public void addEmployee (Permanent p) {
//		if(index >= 2) {
//			// 저장공간(2) 이상이 input 됐을 때, 배열의 재구성을 시도함
//			Permanent[] imsi = new Permanent[emp.length+1];
//			System.arraycopy(emp, 0, imsi, 0, emp.length);
//			emp = imsi;
//		}
		empList.add(p);
	}
	
	// 직원 급여 출력 메서드
	public void showSalary() {
		for(int i =0; i < empList.size(); i++) {
//			emp[i].show();
			empList.get(i).show();
			// System.out.println(emp[i]); 위의 코드와 동일한 역할
		}
	}
	
	// 매달 지급되는 직원급여의 총합 출력 메서드
	public void totalSalary() {
		int total = 0;		// 모든 직원의 급여의 합이 저장될 변수
		
		for (int i = 0; i < empList.size(); i++) {
			total += empList.get(i)].getSalary();
		}
		System.out.println("직원 수: " + index + "명");
		System.out.println("매달 지급되는 직원급여의 총합: " + total);
	}
	
	// 메뉴 표시 메서드
	public void showMenu() {
		System.out.println("== Employee Managing Program ==");
		System.out.println("1. 직원 등록");
		System.out.println("2. 급여정보 출력");
		System.out.println("3. 총지급액 출력");
		System.out.println("4. 프로그램 종료");
	}
}

//MVC에서 View 역할하는 클래스
public class Exam_03 {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		Scanner input = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			manager.showMenu();
			System.out.print("선택 = ");
			// menu = input.nextInt();  //nextint를 사용하면 숫자입력 + enter + 숫자 3개의 공간이 필요
			menu = Integer.parseInt(input.nextLine()); // int parsing
			// Casting : 데이터 변환으로 인해 손실을 감수하는 행위(10자리 int를 5자리 int로 변경하는 경우)
			// Parsing : 데이터를 손실없이 변환하는 경우
			
			if(menu == 1) {
				System.out.println("직원 등록을 시작합니다.");
				System.out.println("이름 : ");
				String name = input.nextLine();
				System.out.println("급여 : ");
				int salary = Integer.parseInt(input.nextLine());
				manager.addEmployee(new Permanent(name, salary));
			}else if(menu == 2) {
				manager.showSalary();
			}else if(menu == 3) {
				manager.totalSalary();
			}else if(menu == 4) {
//				System.out.println("프로그램이 종료됩니다.");
				break;  // <= 이 break는 while문만 종료시킴
//				System.exit(0);  //<== 전체 프로그램을 종료하는 경우
			}else {
				System.out.println("Wrong number!!");
			}
		}
		System.out.println("프로그램이 종료됩니다.");
	}

}
