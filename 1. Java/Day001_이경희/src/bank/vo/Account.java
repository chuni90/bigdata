package bank.vo;

/*
 * �� ���� �� ���¿� ���� ������ ���� Ŭ����
 * */

public class Account {
	// ����ʵ�
	private int id;				// ���¹�ȣ
	private String name;		// ���̸�
	private int balance;		// ���ݱݾ�
	
	// �����ڸ޼��� - ����ʵ带 �ʱ�ȭ�� �������� ����, ���°����� ����ϴ� �ǹ�
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	// ����޼���
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccount() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Balance : " + balance + "\n");
	}
	
	// �Ա�ó���� ���� �޼��� : �Աݱݾ��� �޾Ƽ� �����ܾ׿� �����ϴ� ����
	public void input(int money) {
		balance += money;
		System.out.println("�Ա�ó���� �Ϸ�Ǿ����ϴ�.");
	}
	
	// ���ó���� ���� �޼��� : ��ݱݾ��� �޾Ƽ� �����ܾ׿��� �����ϴ� ����
	public int output(int money) {
		if(balance < money)
			return 0;
		else {
			balance -= money;
			System.out.println("���ó���� �Ϸ�Ǿ����ϴ�.");
			return money;
		}
	}
	
	// ��øŬ����
	
}
