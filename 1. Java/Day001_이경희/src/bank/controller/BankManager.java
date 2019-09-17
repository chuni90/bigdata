package bank.controller;

import java.util.Scanner;

import bank.vo.Account;

public class BankManager {
	// ����ʵ�
	Account[] accList;  // int a = 100
	int index;
	Scanner sc;
	
	// ������ �޼���
	public BankManager(Scanner sc) { // Scanner sc = sc
		accList = new Account[100];
		index = 0;
		this.sc = sc;
	}
	
	// ��� �޼��� : �޴�, ����, �Ա�, ���, �ܾ���ȸ
	public void mainMenu() {
		System.out.println("== Bank Manu == ");
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�ó��");
		System.out.println("3. ���ó��");
		System.out.println("4. �ܾ׺���");
		System.out.println("5. �۾�����");
		System.out.println("===============");
	}
	
	public void makeAccount() {
		System.out.println("== ���°��� ==");
		System.out.print("���¹�ȣ = ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("���̸� = ");
		String name = sc.nextLine();
		System.out.print("���ݱݾ� = ");
		int money = Integer.parseInt(sc.nextLine());
		
		//Account acc = new Account(id, name, money);
		accList[index++] = new Account(id, name, money);
		//index++;
		System.out.println("���°����� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deposit() {
		int id, money;
		
		System.out.println("== �Ա�ó�� ==");
		System.out.print("���¹�ȣ = ");
		id = Integer.parseInt(sc.nextLine());
		
		// ��ü�迭�� ����� �����Ϳ� �Է¹��� ���¹�ȣ�� ��ġ�ϴ��� ���ϴ� �۾��� �ʿ�
		for(int i = 0; i < index; i++) {
			if(accList[i].getId() == id) {
				// ��ġ�ϴ� ���¹�ȣ�� �����Ѵٸ�
				do {
					System.out.print("�Աݱݾ� = ");
					money = Integer.parseInt(sc.nextLine());
				}while(money <= 0);
				accList[i].input(money);
				return;
			}
		}
		System.out.print("�Է��Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�.");		
	}
	
	public void withdraw() {
		int id, money;
		
		System.out.println("== ���ó�� ==");
		System.out.print("���¹�ȣ = ");
		id = Integer.parseInt(sc.nextLine());
		
		// ��ü�迭�� ����� �����Ϳ� �Է¹��� ���¹�ȣ�� ��ġ�ϴ��� ���ϴ� �۾��� �ʿ�
		for(int i = 0; i < index; i++) {
			if(accList[i].getId() == id) {
				// ��ġ�ϴ� ���¹�ȣ�� �����Ѵٸ�
				do {
					System.out.print("��ݱݾ� = ");
					money = Integer.parseInt(sc.nextLine());
				}while(money <= 0);
				if(accList[i].output(money) == 0) {
					System.out.println("�ܾ��� �����մϴ�.");
					return;
				}
				return;
			}
		}
		System.out.print("�Է��Ͻ� ���¹�ȣ�� �������� �ʽ��ϴ�.");		
	}
	
	public void showAllAccount() {
		System.out.println("== ��ü�� �������� ==");
		for(int i = 0; i < index; i++) {
			accList[i].showAccount();
		}
	}

}
