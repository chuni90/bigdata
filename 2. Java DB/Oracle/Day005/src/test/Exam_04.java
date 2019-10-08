package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// DB와 관련된 객체 선언부
		
		Connection conn = null;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		// 멤버 필드 선언부
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "big_java";
		String password = "1234";
		
		String id, name, phone;
		int pass, age;
		
		String sql = "INSERT INTO member values(?, ?, ?, ?, ?)";
		
		
		try {
			// 2단계 연동 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			
			// 3단계 비즈니스 로직
			pstmt = conn.prepareStatement(sql);  // → 동적쿼리
			System.out.println("등록할 회언의 정보를 입력해주삼");
			System.out.print("id>> ");
			id = sc.nextLine();

			System.out.print("pass>> ");
			pass = Integer.parseInt(sc.nextLine());

			System.out.print("name>> ");
			name = sc.nextLine();

			System.out.print("age>> ");
			age = Integer.parseInt(sc.nextLine());

			System.out.print("폰>> ");
			phone = sc.nextLine();
			
			// setString(?위치, 넣을 변수명)
			// 위의 sql 변수의 ?(물음표) 위치가 각 괄호 안의 첫번째 파라미터임. 두번째 파라미터는 담을 변수명임
			pstmt.setString(1, id);
			pstmt.setInt(2, pass);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.setString(5, phone);
			
			int check = pstmt.executeUpdate();
			if(check < 1) {
				System.out.println("행 등록에 실패");
			}
			
		}catch(SQLException e) {
			System.out.println("오류 메시지 : "+ e.getMessage());
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				sc.close();
			}catch(SQLException e) {
				System.out.println("오류 메시지 : "+ e.getMessage());
			}
			System.out.println("작업 끝!!");
		}
		
	}

}
