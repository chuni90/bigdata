package tutorial;

import java.util.ArrayList;
import java.util.Scanner;


/*
 * 급여관리 프로그램
 * A사가 직원 급여를 관리할 목적으로 프로그램을 구현하려고 한다.
 * - 직원등록, 직원급여를 출력, 매달 지급되는 급여의 총액을 출력
 * - 직원(정규직)은 이름, 급여를 가지고 있다.
 * 
 * */



// Model
class Permanent{
	private String name;
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
	public String toString() {
		return "Permanent [name=" + name + ", salary=" + salary + "]";
	}	
	
	public void showEmployee() {
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + getSalary());
	}
		
}

// Controller
class EmployeeManager{
	//Permanent p1, p2, p3;
	//Permanent p2;
	//Permanent p3;
	//Permanent[] emp = new Permanent[2]; // emp[0], emp[1]
	ArrayList<Permanent> empList = new ArrayList<Permanent>();
	/*
	 * add() : 추가
	 * get() : 추출
	 * size()  : 크기
	 * */
	//int index = 0;
	
	// 직원을 등록하는 역할을 수행하는 메서드
	public void addEmployee(Permanent p) {
		/*if(index >= 2) {
			// 배열의 재구성
			Permanent[] imsi = new Permanent[emp.length + 1];
			System.arraycopy(emp, 0, imsi, 0, emp.length);
			emp = imsi;
		}*/
		//emp[index++] = p;
		empList.add(p);
	}
	
	// 직원의 급여를 출력하는 메서드
	public void showSalary() {
		for(int i = 0; i < empList.size(); i++) {
			//emp[i].showEmployee();
			empList.get(i).showEmployee();
			//System.out.println(emp[i].toString());
			//System.out.println(emp[i]);
		}
	}
	
	// 매달 지급되는 직원급여의 총합을 출력하는 메서드
	public void totalSalary() {
		int total = 0; // 모든 직원의 급여의 합이 저장될 변수
		
		for(int i = 0; i < empList.size(); i++) {
			//total += emp[i].getSalary();
			total += empList.get(i).getSalary();
		}
		
		System.out.println("매달 지급되는 직원급여의 총합 : " + total);
	}
	
	// 메뉴
	public void showMenu() {
		System.out.println("== 직원관리 프로그램 ==");
		System.out.println("1. 직원등록");
		System.out.println("2. 급여정보출력");
		System.out.println("3. 총지급액출력");
		System.out.println("4. 작업종료");
	}
}

// View
public class Exam_03 {

	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			manager.showMenu();
			System.out.print("선택 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("직원등록을 시작합니다.");
				System.out.print("이름 = ");
				String name = sc.nextLine();
				System.out.print("급여 = ");
				int salary = Integer.parseInt(sc.nextLine());
				manager.addEmployee(new Permanent(name, salary));
				
			}else if(menu == 2) {
				manager.showSalary();
			}else if(menu == 3) {
				manager.totalSalary();
			}else if(menu == 4) {
				//System.out.println("프로그램을 종료합니다.");
				break;
				//System.exit(0);
			}else {
				System.out.println("선택이 올바르지 않습니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
