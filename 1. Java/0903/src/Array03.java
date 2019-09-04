import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열을 만들고 5명의 성적을 넣은 후 평균 산출 

		double sum = 0.;
		double avg = 0.0;
		int[] score = new int[7];

				
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<score.length; i+=1) {
			System.out.print("성적 입력>> ");
			score[i] = input.nextInt();
			sum = sum + score[i];
			avg = sum/score.length;
		}
		System.out.println("평균은 " + sum/score.length);
		System.out.printf("Print format으로 뽑은 평균은 %.2f \n", avg);
	}

}
