
public class Array_Mine {

	public static void main(String[] args) {
		
		boolean[][] board = new boolean[10][10];
		
		for (int i = 0; i < board.length; i+=1) {
			for (int r = 0; r< board[i].length; r+=1) {
				if (Math.random() < 0.3) {
					board[i][r] = true;
					System.out.print("-");
				}else {
					board[i][r] = false;
					System.out.print("@");
				}
			}System.out.println();
		}
		
	}

}
