package bank.controller;

import java.util.Scanner;

import bank.vo.Account;

public class BankManager {
	
	// ��� �ʵ�
	Account[] accList; 
	int index;
	Scanner sc;
	
	
	// ������ : ��� �ʵ� �ʱ�ȭ
	public BankManager(Scanner sc) {
		accList = new Account[100];
		index = 0;
		this.sc = sc;
	}
	
	// ��� �޼��� : ����, �Ա�, ���, �ܾ� ��ȸ
	public void mainMenu() {
		System.out.println("== BANK MENU ==");
		System.out.println("1. ���� ����");
		System.out.println("2. �Ա� ó��");
		System.out.println("3. ��� ó��");
		System.out.println("4. �ܾ� ��ȸ");
		System.out.println("5. �۾� ����");
		System.out.println("===============");
	}
	
	public void makeAccount () {
		System.out.println("== ���� ���� ==");
		
		System.out.println("���¹�ȣ = ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("���� = ");
		String name = sc.nextLine();
		
		System.out.println("���ݾ� = ");
		int money = Integer.parseInt(sc.nextLine());
		
		accList[index++] = new Account(id, name, money);
		System.out.println("���� ������ �Ϸ�Ǿ���.");
		
	}
	
	public void deposit () {
		int id, money;
		
		System.out.println("== �Ա� ó�� ==");
		System.out.println("���¹�ȣ = ");
		id = Integer.parseInt(sc.nextLine());
		
		// ��ü�迭�� ����� ���¹�ȣ�� �����ϴ� �� Ȯ���ϴ� �۾� �ʿ�
		for(int i = 0; i < index; i++) {
			if(id == accList[i].getId()) {
				// ��ġ�ϴ� ���¹�ȣ ����
				do {
				System.out.println("���ݾ� = ");
				money = Integer.parseInt(sc.nextLine());
				}while (money <= 0);
				accList[i].input(money);
				return ;  // <= return�� �־�� �ٽ� deposit�� ȣ���� ������ ������.
						  // �̰� ������ for�� ���� "���¹�ȣ�� �����ϴ�."�� ȣ���
			}
		}
		System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
	}
		
		public void withdraw() {
			int id, money;
			
			System.out.println("== ��� ó�� ==");
			System.out.println("���¹�ȣ = ");
			id = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < index; i++) {
				if(id == accList[i].getId()) {
					do {
					System.out.println("��ݾ� = ");
					money = Integer.parseInt(sc.nextLine());
					} while(money <= 0);
					if(accList[i].output(money) == 0) {
						System.out.println("���� �ܾ��� �����մϴ�.");
						return;
					}
					return;
				}
			}
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
		
		public void show() {
			System.out.println("== �ܾ� ��ȸ ==");
			System.out.println("���¹�ȣ = ");
			int id = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < index; i++) {
				if(id == accList[i].getId()) {
					System.out.println("�ܾ� = " + accList[i].getBalance());
					return;
				}
			}
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
		
		public void showAll() {
			int sum = 0;
			System.out.println("== ��ü ���� ��ȸ==");
			int id = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < index; i++) {
				if(id == accList[i].getId()) {
					
					System.out.println("�ܾ� = " + accList[i].getBalance());
					return;
				}
			}
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
		
}