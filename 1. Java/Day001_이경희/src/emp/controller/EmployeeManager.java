package emp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import emp.model.Employee;
import emp.model.Permanent;
import emp.model.Sales;
import emp.model.Temporary;

public class EmployeeManager{

	ArrayList<Employee> empList;	
	Scanner sc;
	
	public EmployeeManager(Scanner sc) { // 생성자메서드 - 멤버필드를 초기화시켜주는 역할을 수행한다.
		empList = new ArrayList<Employee>();
		//sc = new Scanner(System.in);
		this.sc = sc;
	}
	
	// 직원을 등록하는 역할을 수행하는 메서드
	public void addEmployee() {	
		System.out.print("직군(1.정규직  2.영업직  3.임시직) = ");
		int check = Integer.parseInt(sc.nextLine());
		switch(check) {
		case 1:
			makePermanent();
			break;
		case 2:
			makeSales();
			break;
		case 3:
			makeTemporary();			
		}
		
	}
	
	private void makeTemporary() {
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("hour = ");
		int hour = Integer.parseInt(sc.nextLine());
		System.out.print("pay = ");
		int pay = Integer.parseInt(sc.nextLine());
		empList.add(new Temporary(name, hour, pay));
	}

	private void makeSales() {
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("pay = ");
		int pay = Integer.parseInt(sc.nextLine());
		System.out.print("sales = ");
		int sales = Integer.parseInt(sc.nextLine());
		System.out.print("bonus = ");
		float bonus = Float.parseFloat(sc.nextLine());
		
		empList.add(new Sales(name, pay, bonus, sales)); 
	}

	private void makePermanent() {
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("pay = ");
		int pay = Integer.parseInt(sc.nextLine());
		//Permanent p = new Permanent(name, pay);
		empList.add(new Permanent(name, pay));
	}

	// 직원의 급여를 출력하는 메서드
	public void showSalary() {
		for(int i = 0; i < empList.size(); i++) {		
			empList.get(i).show();			
		}
	}
	
	// 매달 지급되는 직원급여의 총합을 출력하는 메서드
	public void totalSalary() {
		int total = 0; // 모든 직원의 급여의 합이 저장될 변수
		
		for(int i = 0; i < empList.size(); i++) {			
			total += empList.get(i).getSalary();
		}
		
		System.out.println("매달 지급되는 직원급여의 총합 : " + total);
	}
	
	// 메뉴
	public void showMenu() {
		System.out.println("== 직원관리 프로그램 ==");
		System.out.println("1. 직원등록"); // 정규직, 영업직, 임시직
		System.out.println("2. 급여정보출력");
		System.out.println("3. 총지급액출력");
		System.out.println("4. 작업종료");
	}
}
