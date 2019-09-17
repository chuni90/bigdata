package emp.view;

import java.util.Scanner;

import emp.controller.EmployeeManager;

public class MainProcessor {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeManager manager = new EmployeeManager(input);
		int menu = 0;
		
		while(true) {
			manager.showMenu();
			System.out.print("선택 = ");
			menu = Integer.parseInt(input.nextLine()); // int parsing
			
			if(menu == 1) {
				System.out.println("직원 등록을 시작합니다.");
				manager.addEmployee();
			}else if(menu == 2) {
				manager.showSalary();
			}else if(menu == 3) {
				manager.totalSalary();
			}else if(menu == 4) {
				break;  
			}else {
				System.out.println("Wrong number!!");
			}
		}
		System.out.println("프로그램이 종료됩니다.");
	}
	
	
}
