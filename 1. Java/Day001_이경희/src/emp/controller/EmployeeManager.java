package emp.controller;

import java.util.ArrayList;
import java.util.Scanner;

import emp.model.Employee;
import emp.model.Permanent;
import emp.model.Sales;
import emp.model.Temporary;

public class EmployeeManager{

	ArrayList<Employee> empList;	
	Scanner sc;
	
	public EmployeeManager(Scanner sc) { // �����ڸ޼��� - ����ʵ带 �ʱ�ȭ�����ִ� ������ �����Ѵ�.
		empList = new ArrayList<Employee>();
		//sc = new Scanner(System.in);
		this.sc = sc;
	}
	
	// ������ ����ϴ� ������ �����ϴ� �޼���
	public void addEmployee() {	
		System.out.print("����(1.������  2.������  3.�ӽ���) = ");
		int check = Integer.parseInt(sc.nextLine());
		switch(check) {
		case 1:
			makePermanent();
			break;
		case 2:
			makeSales();
			break;
		case 3:
			makeTemporary();			
		}
		
	}
	
	private void makeTemporary() {
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("hour = ");
		int hour = Integer.parseInt(sc.nextLine());
		System.out.print("pay = ");
		int pay = Integer.parseInt(sc.nextLine());
		empList.add(new Temporary(name, hour, pay));
	}

	private void makeSales() {
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("pay = ");
		int pay = Integer.parseInt(sc.nextLine());
		System.out.print("sales = ");
		int sales = Integer.parseInt(sc.nextLine());
		System.out.print("bonus = ");
		float bonus = Float.parseFloat(sc.nextLine());
		
		empList.add(new Sales(name, pay, bonus, sales)); 
	}

	private void makePermanent() {
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("pay = ");
		int pay = Integer.parseInt(sc.nextLine());
		//Permanent p = new Permanent(name, pay);
		empList.add(new Permanent(name, pay));
	}

	// ������ �޿��� ����ϴ� �޼���
	public void showSalary() {
		for(int i = 0; i < empList.size(); i++) {		
			empList.get(i).show();			
		}
	}
	
	// �Ŵ� ���޵Ǵ� �����޿��� ������ ����ϴ� �޼���
	public void totalSalary() {
		int total = 0; // ��� ������ �޿��� ���� ����� ����
		
		for(int i = 0; i < empList.size(); i++) {			
			total += empList.get(i).getSalary();
		}
		
		System.out.println("�Ŵ� ���޵Ǵ� �����޿��� ���� : " + total);
	}
	
	// �޴�
	public void showMenu() {
		System.out.println("== �������� ���α׷� ==");
		System.out.println("1. �������"); // ������, ������, �ӽ���
		System.out.println("2. �޿��������");
		System.out.println("3. �����޾����");
		System.out.println("4. �۾�����");
	}
}
