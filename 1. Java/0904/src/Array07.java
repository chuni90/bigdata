
public class Array07 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] a2 = new int[10];
		
		// System.arraycopy(�ҽ��迭, ������ġ, ����迭, ������ġ, ����) ;
		// System.arraycopy(src, srcPos, dest, destPos, length);
		
		System.arraycopy(a, 0, a2, 3, 3);
		// �� �ڵ� �ؼ� : a�� �迭 �ε���0�� a2�� �ε���3���ٰ� 3���� �����ؿͶ�.
		
		for(int i: a)
			System.out.print(i+" ");
		
		System.out.println();
		for (int i : a2)
			System.out.println(i);
		
	}

}
