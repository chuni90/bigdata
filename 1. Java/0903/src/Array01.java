
public class Array01 {

	public static void main(String[] args) {
		
		// �迭 �����
		// �迭��.length = �迭�� ���� ���� ��ȯ
		int[] a = new int[9];
		System.out.println("a�� length�� "+a.length);
		
		a[0] = 1;
		a[1] = 2;
		
		int[] a1 = {1,2,3,4,5};
		System.out.println("a1�� length�� "+a1.length);
		System.out.println(a1[2]);
		
		for(int i=0; i<a1.length; i+=1) {
			System.out.println(+a1[i]);
		}
		
		int[] list = new int[5];
		int[] list2 = {1, 2, 3, 5, 6};
		
		for(int i=0; i<list.length; i+=1)
			list[i] = i * 2;
		
		for(int i=0; i<list.length; i+=1) {
			System.out.println("list>>"+list[i]);
			System.out.println("list2>>"+list2[i]);
		}
	}

}
