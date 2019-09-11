import java.util.Scanner;

public class Array2dim02 {

	public static void main(String[] args) {
		
		// 3���� �л��� 3���� ������ ��µ� �� ������ �Է¹޾� �迭�� 3x3���� �ϼ���Ű�� �� ������ �հ�� ����� ���Ͻÿ�
		
		int[][] score_table = new int[3][3];
		int sum = 0;
		int count = 0;
		double ave = 0.0;
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<score_table.length; i+=1) {
			for(int r = 0; r<score_table[i].length; r+=1) {
				System.out.printf("%d��° �л��� %d���� ������ �Է� >> ",i+1,r+1);
				score_table[i][r] = in.nextInt();
				sum = sum + score_table[i][r]; 
				count += 1;  // �̰Ŷ� ���� ���� (score_table.length * score_table[0].length) = 3 * 3
			}
			System.out.println();
		}
		ave = sum / count ;
		System.out.printf("\n�հ�� %d || ����� %.2f\n",sum, ave);
		System.out.println();
		
		// �迭�� ������ �ο��Ͽ� ���� ���� �غ���
		int[][] t = new int[3][3];
		int sum2 = 0;
		int count2 = 0;
		double ave2 = 0.0;
		
		for(int i=0; i<t.length; i+=1) {
			for(int r=0; r<t[i].length; r+=1) {
				t[i][r] = (int) (Math.random()*100 + 1);
				System.out.println(t[i][r]);
				sum2 = sum2 + t[i][r]; 
				count2 += 1;
			}
		}
		ave2 = sum2 / count2 ;
		System.out.printf("\n�հ�� %d || ����� %.2f\n",sum2, ave2);
		
		
	}
}
