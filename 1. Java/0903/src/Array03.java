import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// �迭�� ����� 5���� ������ ���� �� ��� ���� 

		double sum = 0.;
		double avg = 0.0;
		int[] score = new int[7];

				
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<score.length; i+=1) {
			System.out.print("���� �Է�>> ");
			score[i] = input.nextInt();
			sum = sum + score[i];
			avg = sum/score.length;
		}
		System.out.println("����� " + sum/score.length);
		System.out.printf("Print format���� ���� ����� %.2f \n", avg);
	}

}
