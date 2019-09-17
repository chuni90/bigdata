package bank.view;

import java.util.Scanner;

import bank.controller.BankManager;

public class MainProcessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankManager bank = new BankManager(sc);
		int menu = 0;
		
		while(true) {
			bank.mainMenu();
			System.out.print("메뉴 선택 = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: //계좌 개설
				bank.makeAccount();
				break;
			case 2: // 예금
				bank.deposit();
				break;
			case 3: // 출금
				bank.withdraw();
				break;
			case 4: // 전체 잔액
				bank.show();
				break;
			case 5: // 종료
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
			default:
				System.out.println("잘못 입력했음");
			}
			
//			if(menu == 1) {
//				bank.makeAccount();
//			}else if(menu == 2) {
//				bank.deposit();
//			}else if(menu == 3) {
//				bank.withdraw();
//			}else if(menu == 4) {
//				bank.show();  
//			}else if(menu == 5) {
//				System.out.println("프로그램이 종료됩니다.");
//				break;
//			}else
//				System.out.println("잘못 입력했음");
		}
		
	}
		
		
}
