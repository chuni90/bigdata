package bank.controller;

import java.util.Scanner;

import bank.vo.Account;

public class BankManager {
	// 멤버필드
	Account[] accList;  // int a = 100
	int index;
	Scanner sc;
	
	// 생성자 메서드
	public BankManager(Scanner sc) { // Scanner sc = sc
		accList = new Account[100];
		index = 0;
		this.sc = sc;
	}
	
	// 멤버 메서드 : 메뉴, 개설, 입금, 출금, 잔액조회
	public void mainMenu() {
		System.out.println("== Bank Manu == ");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금처리");
		System.out.println("3. 출금처리");
		System.out.println("4. 잔액보기");
		System.out.println("5. 작업종료");
		System.out.println("===============");
	}
	
	public void makeAccount() {
		System.out.println("== 계좌개설 ==");
		System.out.print("계좌번호 = ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("고객이름 = ");
		String name = sc.nextLine();
		System.out.print("예금금액 = ");
		int money = Integer.parseInt(sc.nextLine());
		
		//Account acc = new Account(id, name, money);
		accList[index++] = new Account(id, name, money);
		//index++;
		System.out.println("계좌개설이 완료되었습니다.");
	}
	
	public void deposit() {
		int id, money;
		
		System.out.println("== 입금처리 ==");
		System.out.print("계좌번호 = ");
		id = Integer.parseInt(sc.nextLine());
		
		// 객체배열에 저장된 데이터와 입력받은 계좌번호가 일치하는지 비교하는 작업이 필요
		for(int i = 0; i < index; i++) {
			if(accList[i].getId() == id) {
				// 일치하는 계좌번호가 존재한다면
				do {
					System.out.print("입금금액 = ");
					money = Integer.parseInt(sc.nextLine());
				}while(money <= 0);
				accList[i].input(money);
				return;
			}
		}
		System.out.print("입력하신 계좌번호가 존재하지 않습니다.");		
	}
	
	public void withdraw() {
		int id, money;
		
		System.out.println("== 출금처리 ==");
		System.out.print("계좌번호 = ");
		id = Integer.parseInt(sc.nextLine());
		
		// 객체배열에 저장된 데이터와 입력받은 계좌번호가 일치하는지 비교하는 작업이 필요
		for(int i = 0; i < index; i++) {
			if(accList[i].getId() == id) {
				// 일치하는 계좌번호가 존재한다면
				do {
					System.out.print("출금금액 = ");
					money = Integer.parseInt(sc.nextLine());
				}while(money <= 0);
				if(accList[i].output(money) == 0) {
					System.out.println("잔액이 부족합니다.");
					return;
				}
				return;
			}
		}
		System.out.print("입력하신 계좌번호가 존재하지 않습니다.");		
	}
	
	public void showAllAccount() {
		System.out.println("== 전체고객 계좌정보 ==");
		for(int i = 0; i < index; i++) {
			accList[i].showAccount();
		}
	}

}
