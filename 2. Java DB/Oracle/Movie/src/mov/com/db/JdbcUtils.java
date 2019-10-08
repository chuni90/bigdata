package mov.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtils {
	// 드라이버 로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연동 실패!");
			System.out.println("오류 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// 연동 객체 생성
	public static Connection getConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "big_java";
		String password = "1234";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// 자원 관리 : 클로즈
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		}catch(SQLException e) {
			System.out.println("Close Exception occured!");
		}
	}
	
	// 커밋
	public static void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			System.out.println("Commit Exception occured!");
			e.printStackTrace();
		}
	}
	
	// 롤백
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.out.println("Rollback Exception occured!");
			e.printStackTrace();
		}
		
	}

}
