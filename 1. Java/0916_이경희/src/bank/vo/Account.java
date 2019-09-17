package bank.vo;
/*
 * 한 명의 고객 계좌에 대한 정보를 담을 클래스
 * 여려명을 담으려면 배열이 필요함
 */


public class Account {
	
	//member field
	private int id;				// 계좌 번호
	private String name;		// 고객명
	private int balance;		// 예금액
	
	//생성자 메서드 : 멤버필드 초기화 목적으로 구현, 계좌 개설 시 사용하는 메소드로서 활용
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//멤버메서드
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
	
	// 입금처리를 위한 메서드 : 입금 금액을 받아서 예금 잔액을 누적하는 행위
	public void input(int money) {
		balance += money;
		System.out.println("입금 처리가 완료. " + balance);
	}
	
	// 출금처리를 위한 메서드 : 출금 금액을 받아서 예금 잔액을 누적하는 행위
	public int output(int money) {
		if(balance < money) {
			return 0;
		}else {
			balance -= money;
			System.out.println("출금 처리가 완료. " + balance);
			return money;
		}
	}
		
	//중첩클래스
	
}
