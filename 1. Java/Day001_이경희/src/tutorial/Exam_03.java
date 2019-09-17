package tutorial;

import java.util.ArrayList;
import java.util.Scanner;


/*
 * �޿����� ���α׷�
 * A�簡 ���� �޿��� ������ �������� ���α׷��� �����Ϸ��� �Ѵ�.
 * - �������, �����޿��� ���, �Ŵ� ���޵Ǵ� �޿��� �Ѿ��� ���
 * - ����(������)�� �̸�, �޿��� ������ �ִ�.
 * 
 * */



// Model
class Permanent{
	private String name;
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
	public String toString() {
		return "Permanent [name=" + name + ", salary=" + salary + "]";
	}	
	
	public void showEmployee() {
		System.out.println("�̸� : " + name);
		System.out.println("�޿� : " + getSalary());
	}
		
}

// Controller
class EmployeeManager{
	//Permanent p1, p2, p3;
	//Permanent p2;
	//Permanent p3;
	//Permanent[] emp = new Permanent[2]; // emp[0], emp[1]
	ArrayList<Permanent> empList = new ArrayList<Permanent>();
	/*
	 * add() : �߰�
	 * get() : ����
	 * size()  : ũ��
	 * */
	//int index = 0;
	
	// ������ ����ϴ� ������ �����ϴ� �޼���
	public void addEmployee(Permanent p) {
		/*if(index >= 2) {
			// �迭�� �籸��
			Permanent[] imsi = new Permanent[emp.length + 1];
			System.arraycopy(emp, 0, imsi, 0, emp.length);
			emp = imsi;
		}*/
		//emp[index++] = p;
		empList.add(p);
	}
	
	// ������ �޿��� ����ϴ� �޼���
	public void showSalary() {
		for(int i = 0; i < empList.size(); i++) {
			//emp[i].showEmployee();
			empList.get(i).showEmployee();
			//System.out.println(emp[i].toString());
			//System.out.println(emp[i]);
		}
	}
	
	// �Ŵ� ���޵Ǵ� �����޿��� ������ ����ϴ� �޼���
	public void totalSalary() {
		int total = 0; // ��� ������ �޿��� ���� ����� ����
		
		for(int i = 0; i < empList.size(); i++) {
			//total += emp[i].getSalary();
			total += empList.get(i).getSalary();
		}
		
		System.out.println("�Ŵ� ���޵Ǵ� �����޿��� ���� : " + total);
	}
	
	// �޴�
	public void showMenu() {
		System.out.println("== �������� ���α׷� ==");
		System.out.println("1. �������");
		System.out.println("2. �޿��������");
		System.out.println("3. �����޾����");
		System.out.println("4. �۾�����");
	}
}

// View
public class Exam_03 {

	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			manager.showMenu();
			System.out.print("���� = ");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("��������� �����մϴ�.");
				System.out.print("�̸� = ");
				String name = sc.nextLine();
				System.out.print("�޿� = ");
				int salary = Integer.parseInt(sc.nextLine());
				manager.addEmployee(new Permanent(name, salary));
				
			}else if(menu == 2) {
				manager.showSalary();
			}else if(menu == 3) {
				manager.totalSalary();
			}else if(menu == 4) {
				//System.out.println("���α׷��� �����մϴ�.");
				break;
				//System.exit(0);
			}else {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
