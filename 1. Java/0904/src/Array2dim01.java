
public class Array2dim01 {

	public static void main(String[] args) {
		
		// 2차원 배열 for문으로 출력하기
		// java 특징으로는 배열의 크기에서 열의 length는 가변적이라는 것임. 서로 달라도 됨
		
		int[][] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 76},
				{88, 99, 110, 120}
		};
		
		// 2번째 for문의 i의 범위를 array[r].length로 해야지 각 행의 원소개수를 범위로 넣을 수가 있음
		
		for (int r = 0; r < array.length; r+=1) {
			for	(int i = 0; i < array[r].length; i+=1) {
				
				System.out.println(r + "행 " + i + "열: " + array[r][i] + " ");
			}
		}

		System.out.println(); 
		
		// 배열 크기 살펴보기
		
		int[][] a = {
				{1,2,3},
				{1,2},
				{1,2,3,4,5}
		};
		
		System.out.println(a.length); // 행크기
		System.out.println(a[0].length); // 0행 크기
		System.out.println(a[1].length); // 1행 크기
		System.out.println(a[2].length); // 2행 크기
		
		System.out.println(); 
		
		for(int i=0; i<a.length; i+=1) {
			for(int j=0; j<a[i].length; j+=1)
				System.out.print(a[i][j]+" ");
		}
	}
}
