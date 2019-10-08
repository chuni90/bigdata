package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 데이터베이스의 작업에서 공통적으로 수행되는 기능을 하나의 객체로 묶어서 관리할 목적의 클래스
 *  - 드라이브 로딩, 연동 객체 생성, 자원 관리
 */

public class JdbcConnect {
	// 드라이버 로딩
	static {
		try {
			Class.forName("oracle.jdbc.dirver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연동 실패!");
			System.out.println("오류 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// 연동 객체 생성
	public static Connection getConnection() {
		// 멤버필드 선언부
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
	
	// 자원 관리
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try{
			if (conn != null) conn.close();
			if (pstmt != null) pstmt.close();
			if (rs != null) rs.close();
		}catch(SQLException e) {
			System.out.println("오류");
		}
	}
	
	
	
}
