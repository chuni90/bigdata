package tutorial;

/*
 * 객체지향적인 프로그래밍
 * 객체(Object과 Instance) : 현실세계의 유형, 무형의 물질 또는 대상
 * 1. 객체 모델링 : 객체의 상태 또는 속성 그리고 객체의 행위를 찾아 구현하는 것
 *   "나는 사과장수에게 2000원어치 사과를 구매했다."
 *   - 객체 : 명사형, 행위의 주체가 되는 것 => 나, 사과장수
 *   - 상태(속성) : 멤버필드
 *     나 : 구매할 돈, 구매한 사과수
 *     사과장수 : 판매할 사과, 사과가격, 매출
 *   - 행위(동작) : 멤버메서드
 *     나 : 사과를 구매하는 행위
 *     사과장수 : 사과를 판매하는 행위
 * */
class AppleBuyer{ // 나
	int money;
	int apple;
	
	// 생성자 메서드
	public AppleBuyer(int money, int apple) {		
		this.money = money;
		this.apple = apple;
	}
	
	// 사과를 구매하는 행위
	public void buy(AppleSeller seller, int don) {
		apple = seller.appleSales(don);
		money -= don;
	}
	
	

	// 사과를 구매한 후
	public void disp() {
		System.out.println("구매한 사과수 : " + apple);
		System.out.println("남은 돈 : " + money);
	}
}

class AppleSeller{ // 사과장수
	int apples;
	int price;
	int sales;
	
	public AppleSeller(int apples, int price, int sales) {
		this.apples = apples;
		this.price = price;
		this.sales = sales;
	}
	
	// 사과를 판매하는 행위를 기술할 메서드
	public int appleSales(int money) {
		int retApple = money/price;
		apples -= retApple;
		sales += money;
		return retApple;
	}
	
	// 매출내역을 출력하는 메서드
	public void disp() {
		System.out.println("남은 사과수 : " + apples);
		System.out.println("매출 금액 : " + sales);
	}	
}

public class Exam_02 {

	public static void main(String[] args) {
		AppleBuyer buyer = new AppleBuyer(10000, 0);
		AppleSeller seller = new AppleSeller(50, 1000, 0);
		AppleSeller seller2 = new AppleSeller(100, 500, 0);
		
		System.out.println("사과판매전 상태");
		buyer.disp();
		seller.disp();
		seller2.disp();
		
		System.out.println("사과구매후 상태");
		buyer.buy(seller2, 2000);
		buyer.disp();
		seller.disp();
		seller2.disp();
	}

}
