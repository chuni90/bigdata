package emp.controller;
import java.util.ArrayList;
import java.util.Scanner;

import emp.model.Employee;
import emp.model.Permanent;
import emp.model.SalesWork;
import emp.model.Temporary;

//MVC���� Controller(=Handler) �����ϴ� Ŭ����
public class EmployeeManager{
	
	ArrayList<Employee> empList;
	Scanner input;
	
	public EmployeeManager(Scanner input) { // ������ �޼��� - ����ʵ带 �ʱ�ȭ �����ִ� ������ �����Ѵ�.
		empList = new ArrayList<Employee>();
//		input = new Scanner(System.in);
		this.input = input;
	}
	
	
	// ���� ��� �޼���
	public void addEmployee() {
		System.out.print("����(1.������  2.������  3.�ӽ���) = ");
		int check = Integer.parseInt(input.nextLine());
		
		switch (check) {
		case 1 :
			makePermanent();
			break;
		case 2 :
			makeSales();
			break;
		case 3 :
			makeTemporary();
		}
	}
	
	private void makePermanent() {
		System.out.print("name = ");
		String name = input.nextLine();
		System.out.print("Pay = ");
		int pay = Integer.parseInt(input.nextLine());
//		Permanent p = new Permanent(name, pay);
		empList.add(new Permanent(name, pay));
		
	}
	
	private void makeSales() {
		System.out.print("name = ");
		String name = input.nextLine();
		System.out.print("Pay = ");
		int pay = Integer.parseInt(input.nextLine());
		System.out.print("Bonus = ");
		float bonus = Float.parseFloat(input.nextLine());		
		System.out.print("Sales = ");
		int sales = Integer.parseInt(input.nextLine());
		empList.add(new SalesWork(name, pay, bonus, sales));
		
	}
	
	private void makeTemporary() {
		System.out.print("name = ");
		String name = input.nextLine();
		System.out.print("hour = ");
		int hour = Integer.parseInt(input.nextLine());
		System.out.print("Bonus = ");
		int pay = Integer.parseInt(input.nextLine());
		empList.add(new Temporary(name, hour, pay));
	}
	
	// ���� �޿� ��� �޼���
	public void showSalary() {
		for(int i =0; i < empList.size(); i++) {
			empList.get(i).show();
		}
	}
	
	// �Ŵ� ���޵Ǵ� �����޿��� ���� ��� �޼���
	public void totalSalary() {
		int total = 0;		// ��� ������ �޿��� ���� ����� ����
		
		for (int i = 0; i < empList.size(); i++) {
			total += empList.get(i).getSalary();
		}
		System.out.println("�Ŵ� ���޵Ǵ� �����޿��� ����: " + total);
	}
	
	// �޴� ǥ�� �޼���
	public void showMenu() {
		System.out.println("== Employee Managing Program ==");
		System.out.println("1. ���� ���");  //������, ������, �ӽ������� ���� �ʿ�(salary ������ �ٸ��Ƿ�)
		System.out.println("2. �޿����� ���");
		System.out.println("3. �����޾� ���");
		System.out.println("4. ���α׷� ����");
	}
}