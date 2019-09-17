package tutorial;

/*
 * ��ü�������� ���α׷���
 * ��ü(Object�� Instance) : Object�� �ؾƲ, Instance�� ������ �޸𸮿� ������ ��ü
 * 1. ��ü �𵨸� : ��ü�� ���� �Ǵ� �Ӽ� �׸��� ��ü�� ������ ã�� �����ϴ� ��
 *  "���� ���������� 2000����ġ�� ����� �����ߴ�."
 *  - ��ü : �����, ������ ��ü�� �Ǵ� �� => ��, ������
 *  - ����(�Ӽ�) : ����ʵ� 
 *  	�� : ������ ��, ������ �������
 *  	������ : �Ǹ��� �������, ��� ����, ����
 *  - ����(����) : ����޼���
 *  	�� : ��������
 *  	������ : �Ǹ�����
 * */

class AppleBuyer{ // ��
	int money;
	int apple;
	
	// ������ �޼���
	
	 public AppleBuyer(int money, int apple) {
			this.money = money;
			this.apple = apple;
	 }
	
	// ����� �����ϴ� ���� �޼ҵ�
	 public void buy(AppleSeller seller, int don) {
		 apple = seller.appleSales(don);
		 money -= don;
	 }
	
	

	// ����� ������ ��
	 public void disp() {
		 System.out.println("������ ������� : " + apple);
		 System.out.println("���� �� : " + money);
	 }
	
}

class AppleSeller { // ������
	int apples;
	int price;
	int sales;
	
	public AppleSeller(int apples, int price, int sales) {
		this.apples = apples;
		this.price = price;
		this.sales = sales;
		
	}
	
	// ��� �Ǹ� ���� �޼ҵ�
	public int appleSales(int money) {
		int retApple = money / price;
		apples -= retApple;
		sales += money;
		return retApple;
	}
	
	// ���⳻���� ����ϴ� �޼ҵ�
	public void disp() {
		System.out.println("���� �����: " + apples);
		System.out.println("���� : " + sales);
	}
	
}
public class Exam_02 {

	public static void main(String[] args) {
		
		AppleBuyer b = new AppleBuyer(10000,0);
		AppleSeller seller = new AppleSeller(50, 1000, 0);
		AppleSeller seller2 = new AppleSeller(100, 500, 0);
		
		
		System.out.println("����Ǹ� �� ����");
		b.disp();
		seller.disp();
		seller2.disp();
		System.out.println("--------------------");
		
		System.out.println("����Ǹ� �� ����");
		b.buy(seller2, 2000);
		b.disp();
		seller.disp();
		seller2.disp();
	}

}
