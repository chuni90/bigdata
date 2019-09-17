package bank;

import java.util.Scanner;

import bank.controller.BankManager;

public class MainProcessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankManager bank = new BankManager(sc);
		int menu = 0;
		
		//while(true) {
		for( ; ; ) {
			bank.mainMenu();
			System.out.print("menu = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // 계좌개설
				bank.makeAccount();	
				break;
			case 2: // 입금처리
				bank.deposit();		
				break;
			case 3: // 출금처리
				bank.withdraw();	
				break;
			case 4: // 전체고객 잔액정보 출력
				bank.showAllAccount();	
				break;
			case 5: // 작업종료
				System.out.println("프로그램을 종료합니다.");	
				System.exit(0);
			default:
				System.out.println("메뉴의 선택이 올바르지 않습니다.");
			}
		}
	}

}
