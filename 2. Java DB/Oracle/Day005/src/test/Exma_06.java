package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static db.JdbcConnect.*;
// import static 오른쪽 클래스의 모든 걸 static 영역에 올려두겠다.(공유)
// import static 패키지명.클래스명.*; 이렇게 붙여야함

public class Exma_06 {

	public static void main(String[] args) {
		String sql = "Delete * From member WHERE nama ='zznag'";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn, pstmt, null);
		}
		
		
		
		
	}

}
