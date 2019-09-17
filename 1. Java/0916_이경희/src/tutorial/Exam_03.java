package tutorial;
import java.util.Scanner;
import java.util.ArrayList;

/*
* �޿����� ���α׷� ������
* A�簡 ���� �޿��� ������ �������� ���α׷��� �����Ϸ��� ��.
* - ���� ���, ���� �޿� ���, �Ŵ� ���޵Ǵ� �޿��� �� �ݾ� ���,
* - ����(������)�� �̸�, �޿� ������ �ִ�.
*/


//MVC���� Model �����ϴ� Ŭ����
class Permanent{
	private String name;  // private�� ���ؼ� ������ �����ϵ� Ʋ�� �������� ���ϵ��� ��
	private int salary;
	
	public Permanent(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() { // toString�� ���������� �޼��� ��Ī��, return�̱� ������ print���� �ʿ���
		return "Permanent [name=" + name + ", salary=" + salary + "]";
	}
	
	public void show() {
		System.out.println("�̸�: " + name);
		System.out.println("�޿�: " + getSalary());
	}
	
}

// MVC���� Controller(=Handler) �����ϴ� Ŭ����
class EmployeeManager{
	
//	Permanent[] emp = new Permanent[2];  // <=��������� �����ؾ��� �ٴ� ������ �ʷ�
//	int index = 0;						 // <=

	ArrayList<Permanent> empList = new ArrayList<Permanent>();
	
	
	// ���� ��� �޼���
	public void addEmployee (Permanent p) {
//		if(index >= 2) {
//			// �������(2) �̻��� input ���� ��, �迭�� �籸���� �õ���
//			Permanent[] imsi = new Permanent[emp.length+1];
//			System.arraycopy(emp, 0, imsi, 0, emp.length);
//			emp = imsi;
//		}
		empList.add(p);
	}
	
	// ���� �޿� ��� �޼���
	public void showSalary() {
		for(int i =0; i < empList.size(); i++) {
//			emp[i].show();
			empList.get(i).show();
			// System.out.println(emp[i]); ���� �ڵ�� ������ ����
		}
	}
	
	// �Ŵ� ���޵Ǵ� �����޿��� ���� ��� �޼���
	public void totalSalary() {
		int total = 0;		// ��� ������ �޿��� ���� ����� ����
		
		for (int i = 0; i < empList.size(); i++) {
			total += empList.get(i)].getSalary();
		}
		System.out.println("���� ��: " + index + "��");
		System.out.println("�Ŵ� ���޵Ǵ� �����޿��� ����: " + total);
	}
	
	// �޴� ǥ�� �޼���
	public void showMenu() {
		System.out.println("== Employee Managing Program ==");
		System.out.println("1. ���� ���");
		System.out.println("2. �޿����� ���");
		System.out.println("3. �����޾� ���");
		System.out.println("4. ���α׷� ����");
	}
}

//MVC���� View �����ϴ� Ŭ����
public class Exam_03 {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		Scanner input = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			manager.showMenu();
			System.out.print("���� = ");
			// menu = input.nextInt();  //nextint�� ����ϸ� �����Է� + enter + ���� 3���� ������ �ʿ�
			menu = Integer.parseInt(input.nextLine()); // int parsing
			// Casting : ������ ��ȯ���� ���� �ս��� �����ϴ� ����(10�ڸ� int�� 5�ڸ� int�� �����ϴ� ���)
			// Parsing : �����͸� �սǾ��� ��ȯ�ϴ� ���
			
			if(menu == 1) {
				System.out.println("���� ����� �����մϴ�.");
				System.out.println("�̸� : ");
				String name = input.nextLine();
				System.out.println("�޿� : ");
				int salary = Integer.parseInt(input.nextLine());
				manager.addEmployee(new Permanent(name, salary));
			}else if(menu == 2) {
				manager.showSalary();
			}else if(menu == 3) {
				manager.totalSalary();
			}else if(menu == 4) {
//				System.out.println("���α׷��� ����˴ϴ�.");
				break;  // <= �� break�� while���� �����Ŵ
//				System.exit(0);  //<== ��ü ���α׷��� �����ϴ� ���
			}else {
				System.out.println("Wrong number!!");
			}
		}
		System.out.println("���α׷��� ����˴ϴ�.");
	}

}
