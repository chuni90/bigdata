package mov.com.vo;

import static mov.com.db.JdbcUtils.close;
import static mov.com.db.JdbcUtils.getConnection;
import static mov.com.util.ConsoleUtils.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SeatDAO {
	
	public int bookSeat(String seat_id, String userId) {
		String sql = "UPDATE seat SET status = ?, user_id = ? WHERE seat_id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "1");
			pstmt.setString(2, userId);
			pstmt.setString(3, seat_id);
			
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}finally {
			close(conn, pstmt, null);
		}
		return check;
	}
}
