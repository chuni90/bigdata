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
			case 1: // ���°���
				bank.makeAccount();	
				break;
			case 2: // �Ա�ó��
				bank.deposit();		
				break;
			case 3: // ���ó��
				bank.withdraw();	
				break;
			case 4: // ��ü�� �ܾ����� ���
				bank.showAllAccount();	
				break;
			case 5: // �۾�����
				System.out.println("���α׷��� �����մϴ�.");	
				System.exit(0);
			default:
				System.out.println("�޴��� ������ �ùٸ��� �ʽ��ϴ�.");
			}
		}
	}

}
