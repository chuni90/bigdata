package com.test;

class Counter{
	
	
	int cnt;
	// �����ڴ� Ŭ������ �����ϰ� ����(���� Ÿ���̳� void�� �ʿ����)
	public Counter() {
		cnt = 10;
	}
	
	// �������� �̿��Ͽ� �Ķ���͸� �ٲ� ������ ����
	public Counter(int c) {
		cnt = c;
	}
	
}


///////////////////////////////////////
public class CountMain {

	public static void main(String[] args) {

		Counter a = new Counter();
		System.out.println(a.cnt);  // ������ cnt�� �⺻���� 10���� ������ �� Ȯ�� ����
		
		Counter b = new Counter();
		System.out.println(b.cnt);
		
		Counter c = new Counter(5);
		System.out.println(c.cnt);
		
		
	}

}
