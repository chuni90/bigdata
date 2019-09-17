package emp.view;

import java.util.Scanner;

import emp.controller.EmployeeManager;


public class MainProcessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManager manager = new EmployeeManager(sc);
		
		int menu = 0;
		
		while(true) {
			manager.showMenu();
			System.out.print("선택 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("직원등록을 시작합니다.");
				manager.addEmployee();
			}else if(menu == 2) {
				manager.showSalary();
			}else if(menu == 3) {
				manager.totalSalary();
			}else if(menu == 4) {				
				break;			
			}else {
				System.out.println("선택이 올바르지 않습니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
