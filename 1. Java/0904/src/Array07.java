
public class Array07 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] a2 = new int[10];
		
		// System.arraycopy(소스배열, 시작위치, 복사배열, 복사위치, 개수) ;
		// System.arraycopy(src, srcPos, dest, destPos, length);
		
		System.arraycopy(a, 0, a2, 3, 3);
		// 위 코드 해석 : a의 배열 인덱스0에 a2의 인덱스3에다가 3개를 복사해와라.
		
		for(int i: a)
			System.out.print(i+" ");
		
		System.out.println();
		for (int i : a2)
			System.out.println(i);
		
	}

}
