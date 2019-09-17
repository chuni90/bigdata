package tutorial.com.lee;

import java.util.Scanner;

public abstract class MyPoint {
	protected int x, y;
	protected static Scanner sc;
	static { // static���� ����� ����� �̷��� �ʱ�ȭ ��ų �� ����
		sc = new Scanner(System.in);
	}
	
	protected abstract void input();  // protected�� ��� �ڽ�Ŭ������ ��� ��������.
	protected abstract void output();
	
}
