package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 장보고라는 이름을 zzang으로 변경하는 작업 수행 프로그램 구현
 */

public class Exam_05 {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "big_java";
		String password = "1234";
		
		String sql = "UPDATE member SET name = 'zzanga' WHERE id = 'DDD'";
		// String sql ="DELETE FROM member ";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			try {
				int check = pstmt.executeUpdate();
				if(check == 0) {
					System.out.println("Update failed");
				}else {
					System.out.println("Update row count>> " + check);
					System.out.println("Process Succeeded");
				}
			}catch(SQLException i) {
				System.out.println("에러 >> " + i.getMessage());
			}
		}catch(SQLException	e) {
			System.out.println("에러 >> " + e.getMessage());
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception k){
				System.out.println("에러 >> " + k.getMessage());
			}
		}
		System.out.println("E  N  D");
		
	}

}
