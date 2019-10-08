package test;

import java.sql.*;

public class Exam_03 {
	
	static {
		try {
			Class.forName("oracle.jdbc.dirver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연동 실패!");
			System.out.println("오류 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "big_java";
		String password = "1234";
		int check = 0;
		
		String sql = "INSERT INTO member values('CCC', '1234', 'chun', 19, '010-3944-2266')";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			check = pstmt.executeUpdate();
		
			if(check > 0) {
				System.out.println("Row Insert Succeeded");
			}else 
				System.out.println("Row Insert Failed");
			
		} catch (SQLException e) {
			System.out.println("DB 연동 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
