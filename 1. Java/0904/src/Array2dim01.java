
public class Array2dim01 {

	public static void main(String[] args) {
		
		// 2���� �迭 for������ ����ϱ�
		// java Ư¡���δ� �迭�� ũ�⿡�� ���� length�� �������̶�� ����. ���� �޶� ��
		
		int[][] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 76},
				{88, 99, 110, 120}
		};
		
		// 2��° for���� i�� ������ array[r].length�� �ؾ��� �� ���� ���Ұ����� ������ ���� ���� ����
		
		for (int r = 0; r < array.length; r+=1) {
			for	(int i = 0; i < array[r].length; i+=1) {
				
				System.out.println(r + "�� " + i + "��: " + array[r][i] + " ");
			}
		}

		System.out.println(); 
		
		// �迭 ũ�� ���캸��
		
		int[][] a = {
				{1,2,3},
				{1,2},
				{1,2,3,4,5}
		};
		
		System.out.println(a.length); // ��ũ��
		System.out.println(a[0].length); // 0�� ũ��
		System.out.println(a[1].length); // 1�� ũ��
		System.out.println(a[2].length); // 2�� ũ��
		
		System.out.println(); 
		
		for(int i=0; i<a.length; i+=1) {
			for(int j=0; j<a[i].length; j+=1)
				System.out.print(a[i][j]+" ");
		}
	}
}
