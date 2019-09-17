package emp.controller;
import java.util.ArrayList;
import java.util.Scanner;

import emp.model.Employee;
import emp.model.Permanent;
import emp.model.SalesWork;
import emp.model.Temporary;

//MVC에서 Controller(=Handler) 역할하는 클래스
public class EmployeeManager{
	
	ArrayList<Employee> empList;
	Scanner input;
	
	public EmployeeManager(Scanner input) { // 생성자 메서드 - 멤버필드를 초기화 시켜주는 역할을 수행한다.
		empList = new ArrayList<Employee>();
//		input = new Scanner(System.in);
		this.input = input;
	}
	
	
	// 직원 등록 메서드
	public void addEmployee() {
		System.out.print("직군(1.정규직  2.영업직  3.임시직) = ");
		int check = Integer.parseInt(input.nextLine());
		
		switch (check) {
		case 1 :
			makePermanent();
			break;
		case 2 :
			makeSales();
			break;
		case 3 :
			makeTemporary();
		}
	}
	
	private void makePermanent() {
		System.out.print("name = ");
		String name = input.nextLine();
		System.out.print("Pay = ");
		int pay = Integer.parseInt(input.nextLine());
//		Permanent p = new Permanent(name, pay);
		empList.add(new Permanent(name, pay));
		
	}
	
	private void makeSales() {
		System.out.print("name = ");
		String name = input.nextLine();
		System.out.print("Pay = ");
		int pay = Integer.parseInt(input.nextLine());
		System.out.print("Bonus = ");
		float bonus = Float.parseFloat(input.nextLine());		
		System.out.print("Sales = ");
		int sales = Integer.parseInt(input.nextLine());
		empList.add(new SalesWork(name, pay, bonus, sales));
		
	}
	
	private void makeTemporary() {
		System.out.print("name = ");
		String name = input.nextLine();
		System.out.print("hour = ");
		int hour = Integer.parseInt(input.nextLine());
		System.out.print("Bonus = ");
		int pay = Integer.parseInt(input.nextLine());
		empList.add(new Temporary(name, hour, pay));
	}
	
	// 직원 급여 출력 메서드
	public void showSalary() {
		for(int i =0; i < empList.size(); i++) {
			empList.get(i).show();
		}
	}
	
	// 매달 지급되는 직원급여의 총합 출력 메서드
	public void totalSalary() {
		int total = 0;		// 모든 직원의 급여의 합이 저장될 변수
		
		for (int i = 0; i < empList.size(); i++) {
			total += empList.get(i).getSalary();
		}
		System.out.println("매달 지급되는 직원급여의 총합: " + total);
	}
	
	// 메뉴 표시 메서드
	public void showMenu() {
		System.out.println("== Employee Managing Program ==");
		System.out.println("1. 직원 등록");  //정규직, 영업직, 임시직으로 구분 필요(salary 산출이 다르므로)
		System.out.println("2. 급여정보 출력");
		System.out.println("3. 총지급액 출력");
		System.out.println("4. 프로그램 종료");
	}
}