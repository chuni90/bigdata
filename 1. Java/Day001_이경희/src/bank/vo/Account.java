package bank.vo;

/*
 * 한 명의 고객 계좌에 대한 정보를 담을 클래스
 * */

public class Account {
	// 멤버필드
	private int id;				// 계좌번호
	private String name;		// 고객이름
	private int balance;		// 예금금액
	
	// 생성자메서드 - 멤버필드를 초기화할 목적으로 구현, 계좌개설시 사용하는 의미
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	// 멤버메서드
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
	
	// 입금처리를 위한 메서드 : 입금금액을 받아서 예금잔액에 누적하는 행위
	public void input(int money) {
		balance += money;
		System.out.println("입금처리가 완료되었습니다.");
	}
	
	// 출금처리를 위한 메서드 : 출금금액을 받아서 예금잔액에서 차감하는 행위
	public int output(int money) {
		if(balance < money)
			return 0;
		else {
			balance -= money;
			System.out.println("출금처리가 완료되었습니다.");
			return money;
		}
	}
	
	// 중첩클래스
	
}
