
package tutorial.com.lee;

import java.util.Scanner;

public abstract class MyPoint {
	protected int x;
	protected int y;
	protected static Scanner sc;
	static { // static ���� ����� ����� �ʱ�ȭ�� �� ����ϴ� ����
		sc = new Scanner(System.in);
	}
	
	/*public MyPoint() {
		sc = new Scanner(System.in);
	}*/
	protected abstract void input();
	protected abstract void output();
	
	/*
	 * �������̵��� ��������
	 * - ����������(������)�� �ݵ�� �θ�� ���ų� Ŀ���Ѵ�.
	 * - ����ó������ : �ڽ��� ���ܹ����� ������ �ִٸ� �ݵ�� �θ� ���ܹ����� ��ƾ� �Ѵ�.
	 * 
	 * */
}
