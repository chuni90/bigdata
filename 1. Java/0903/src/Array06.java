
public class Array06 {

	public static void main(String[] args) {
	
		
		// for-each 문 사용하기
		
		int[] a = {1, 3, 5, 7};
		
		// for each 문에서 변경된 요소는 for each 내에서만 유효하다.
		for(int i : a) {
			i = i + 1;
			System.out.println(i);
		}
		
		// 위에서 각 원소별로 +1을 했으나 a 배열엔 영향이 없는 모습을 확인할 수 있다.
		for(int i : a) {
			System.out.println(i);
		}
		
		
		// 문자열 배열을 만들 경우, String을 사용해야하며, for 문 안에서도 string으로 기재해야 작동함.
		
		String[] name = {"한", "경","천"};
		
		for(String i : name)
			System.out.println(i);
		
		
		int[] b = new int[3];
		
		for (int i : b) {
			b[i] = i + 1;
			System.out.println(b[i]);
		}
	}

}
