import java.util.Scanner;

public class Array05_movie_book {

	public static void main(String[] args) {
		
		int[] seat = new int[10];
		int[] book_seat = new int[10];
		int seat_num;
		
		for (int i=0; i<seat.length; i+=1) {
//			book_seat[i] = 0; ������ �ʱⰪ�� ��� 0�̶� ���� �� �ʿ� ����.
			seat[i] = i+1;
		}
		
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("------------------------------");
			for(int i=0; i<seat.length; i+=1) {
				System.out.printf("%d  ",seat[i]);
			}System.out.println("\n==============================");
			
			for(int i=0; i<seat.length; i+=1)
				System.out.printf("%d  ",book_seat[i]);
			
				System.out.println("\n\n���Ͻô� �¼� ��ȣ �Է� (��ġ ������ -1 �Է�)>> ");
				seat_num = input.nextInt();
				
				if (seat_num == -1) {
					System.out.println("�����մϴ�.");
					break;
				}else if (seat_num > 10 || seat_num < -1) {
					System.out.println("\n�¼���ȣ�� 1~10���� �Դϴ�. �ٽ� �Է��ϼ�");
				}else if (book_seat[seat_num-1] == 0) {
					book_seat[seat_num-1] = 1;
					System.out.println("\n>> Booking complete!");
				}else System.out.println("\n>> Already booked, another seat select plz");
				
			}
	}

}
