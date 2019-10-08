package test;

import java.sql.*;

// DB 연동 Test 실시

//class Member{
//	private String id;
//	private int pass;
//	private String name;
//	private int age;
//	private String phone;
//	
//	public Member(String id, int pass, String name, int age, String phone) {
//		this.id = id;
//		this.pass = pass;
//		this.name = name;
//		this.age = age;
//		this.phone = phone;

//	}
//
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", phone=" + phone + "]";
//	}
//}

public class Exam_02 {

	public static void main(String[] args) {
		
		// 1단계 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연동 실패!");
			System.out.println("오류 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("드라이버 연동 성공");
		
		// 2단계 DB 연동
		// getConnection 메소드는 파라미터로 String만 받아서 아래처럼 구성함
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "big_java";
		String password = "1234";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패!");
			System.out.println("오류 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("데이터베이스 연동 성공");
		
		//3단계 비즈니스 로직
		String sql = "SELECT * FROM member";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
//			Member mem = null;
			
			while(rs.next()) {
//				mem = new Member(rs.getString("id"), rs.getInt("pass"),
//								 rs.getString("name"), rs.getInt("age"), rs.getString("phone"));
				System.out.println("ID: " + rs.getString("id"));
				System.out.println("비번: " + rs.getInt("pass"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("나이: " + rs.getInt("age"));
				System.out.println("폰: " + rs.getString("phone") + "\n");
//				System.out.println(mem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 4단계 자원 닫기
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
