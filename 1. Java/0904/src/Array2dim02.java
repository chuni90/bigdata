import java.util.Scanner;

public class Array2dim02 {

	public static void main(String[] args) {
		
		// 3명의 학생이 3개의 과목을 듣는데 각 점수를 입력받아 배열을 3x3으로 완성시키고 총 성적의 합계와 평균을 구하시오
		
		int[][] score_table = new int[3][3];
		int sum = 0;
		int count = 0;
		double ave = 0.0;
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<score_table.length; i+=1) {
			for(int r = 0; r<score_table[i].length; r+=1) {
				System.out.printf("%d번째 학생의 %d과목 점수를 입력 >> ",i+1,r+1);
				score_table[i][r] = in.nextInt();
				sum = sum + score_table[i][r]; 
				count += 1;  // 이거랑 같은 것이 (score_table.length * score_table[0].length) = 3 * 3
			}
			System.out.println();
		}
		ave = sum / count ;
		System.out.printf("\n합계는 %d || 평균은 %.2f\n",sum, ave);
		System.out.println();
		
		// 배열에 랜덤을 부여하여 위와 같이 해보기
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
		System.out.printf("\n합계는 %d || 평균은 %.2f\n",sum2, ave2);
		
		
	}
}
