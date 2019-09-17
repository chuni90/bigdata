package bank.controller;

import java.util.Scanner;

import bank.vo.Account;

public class BankManager {
	
	// 멤버 필드
	Account[] accList; 
	int index;
	Scanner sc;
	
	
	// 생성자 : 멤버 필드 초기화
	public BankManager(Scanner sc) {
		accList = new Account[100];
		index = 0;
		this.sc = sc;
	}
	
	// 멤버 메서드 : 개설, 입금, 출금, 잔액 조회
	public void mainMenu() {
		System.out.println("== BANK MENU ==");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금 처리");
		System.out.println("3. 출금 처리");
		System.out.println("4. 잔액 조회");
		System.out.println("5. 작업 종료");
		System.out.println("===============");
	}
	
	public void makeAccount () {
		System.out.println("== 계좌 개설 ==");
		
		System.out.println("계좌번호 = ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("고객명 = ");
		String name = sc.nextLine();
		
		System.out.println("예금액 = ");
		int money = Integer.parseInt(sc.nextLine());
		
		accList[index++] = new Account(id, name, money);
		System.out.println("계좌 개설이 완료되었음.");
		
	}
	
	public void deposit () {
		int id, money;
		
		System.out.println("== 입금 처리 ==");
		System.out.println("계좌번호 = ");
		id = Integer.parseInt(sc.nextLine());
		
		// 객체배열에 저장된 계좌번호가 존재하는 지 확인하는 작업 필요
		for(int i = 0; i < index; i++) {
			if(id == accList[i].getId()) {
				// 일치하는 계좌번호 존재
				do {
				System.out.println("예금액 = ");
				money = Integer.parseInt(sc.nextLine());
				}while (money <= 0);
				accList[i].input(money);
				return ;  // <= return이 있어야 다시 deposit을 호출한 곳으로 보내짐.
						  // 이게 없으면 for문 밖의 "계좌번호가 없습니다."가 호출됨
			}
		}
		System.out.println("계좌번호가 존재하지 않습니다.");
	}
		
		public void withdraw() {
			int id, money;
			
			System.out.println("== 출금 처리 ==");
			System.out.println("계좌번호 = ");
			id = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < index; i++) {
				if(id == accList[i].getId()) {
					do {
					System.out.println("출금액 = ");
					money = Integer.parseInt(sc.nextLine());
					} while(money <= 0);
					if(accList[i].output(money) == 0) {
						System.out.println("예금 잔액이 부족합니다.");
						return;
					}
					return;
				}
			}
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
		
		public void show() {
			System.out.println("== 잔액 조회 ==");
			System.out.println("계좌번호 = ");
			int id = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < index; i++) {
				if(id == accList[i].getId()) {
					System.out.println("잔액 = " + accList[i].getBalance());
					return;
				}
			}
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
		
		public void showAll() {
			int sum = 0;
			System.out.println("== 전체 예금 조회==");
			int id = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < index; i++) {
				if(id == accList[i].getId()) {
					
					System.out.println("잔액 = " + accList[i].getBalance());
					return;
				}
			}
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
		
}