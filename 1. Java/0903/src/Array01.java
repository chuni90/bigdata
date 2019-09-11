
public class Array01 {

	public static void main(String[] args) {
		
		// 배열 만들기
		// 배열명.length = 배열의 원소 개수 반환
		int[] a = new int[9];
		System.out.println("a의 length는 "+a.length);
		
		a[0] = 1;
		a[1] = 2;
		
		int[] a1 = {1,2,3,4,5};
		System.out.println("a1의 length는 "+a1.length);
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
