import java.util.Scanner;

public class Array05_movie_book {

	public static void main(String[] args) {
		
		int[] seat = new int[10];
		int[] book_seat = new int[10];
		int seat_num;
		
		for (int i=0; i<seat.length; i+=1) {
//			book_seat[i] = 0; 어차피 초기값은 모두 0이라서 굳이 할 필요 없음.
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
			
				System.out.println("\n\n원하시는 좌석 번호 입력 (원치 않으면 -1 입력)>> ");
				seat_num = input.nextInt();
				
				if (seat_num == -1) {
					System.out.println("종료합니다.");
					break;
				}else if (seat_num > 10 || seat_num < -1) {
					System.out.println("\n좌석번호는 1~10까지 입니다. 다시 입력하셈");
				}else if (book_seat[seat_num-1] == 0) {
					book_seat[seat_num-1] = 1;
					System.out.println("\n>> Booking complete!");
				}else System.out.println("\n>> Already booked, another seat select plz");
				
			}
	}

}
