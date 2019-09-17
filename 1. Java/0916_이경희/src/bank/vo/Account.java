package bank.vo;
/*
 * �� ���� �� ���¿� ���� ������ ���� Ŭ����
 * �������� �������� �迭�� �ʿ���
 */


public class Account {
	
	//member field
	private int id;				// ���� ��ȣ
	private String name;		// ����
	private int balance;		// ���ݾ�
	
	//������ �޼��� : ����ʵ� �ʱ�ȭ �������� ����, ���� ���� �� ����ϴ� �޼ҵ�μ� Ȱ��
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//����޼���
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
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("balance : " + balance + "\n");
	}
	
	// �Ա�ó���� ���� �޼��� : �Ա� �ݾ��� �޾Ƽ� ���� �ܾ��� �����ϴ� ����
	public void input(int money) {
		balance += money;
		System.out.println("�Ա� ó���� �Ϸ�. " + balance);
	}
	
	// ���ó���� ���� �޼��� : ��� �ݾ��� �޾Ƽ� ���� �ܾ��� �����ϴ� ����
	public int output(int money) {
		if(balance < money) {
			return 0;
		}else {
			balance -= money;
			System.out.println("��� ó���� �Ϸ�. " + balance);
			return money;
		}
	}
		
	//��øŬ����
	
}
