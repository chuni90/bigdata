package mov.com.vo;

import static mov.com.db.JdbcUtils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountDAO {

	public int voteMovie(String movieId, String userId) {
		String sql = "UPDATE account SET mymovie = ? WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;
		
		try {
			conn =getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, movieId);
			pstmt.setString(2, userId);
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		}finally {
			close(conn, pstmt, null);
		}
		return check;
	}
}
