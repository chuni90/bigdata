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
			System.out.print("�޴� ���� = ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: //���� ����
				bank.makeAccount();
				break;
			case 2: // ����
				bank.deposit();
				break;
			case 3: // ���
				bank.withdraw();
				break;
			case 4: // ��ü �ܾ�
				bank.show();
				break;
			case 5: // ����
				System.out.println("���α׷��� ����˴ϴ�.");
				System.exit(0);
			default:
				System.out.println("�߸� �Է�����");
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
//				System.out.println("���α׷��� ����˴ϴ�.");
//				break;
//			}else
//				System.out.println("�߸� �Է�����");
		}
		
	}
		
		
}
