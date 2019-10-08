package stu.com.vo;
import static stu.com.db.JdbcUtils.close;
import static stu.com.db.JdbcUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * CRUD와 관련된 명령어를 모아서 처리하는 객체
 *  INSERT, SELECT, UPDATE, DELETE
 */

public class StudentDAO {
	
	// 학생정보를 DB에 등록하는 메서드
	public int makestudent(StudentDTO dto) {
		String sql = "INSERT INTO student values(?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int check = 0;
		
		
		try {
			// JdbcUtils에다가 static으로 getConnetion을 구현해놨기에 바로 사용 가능
			conn = getConnection();    
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMath());
			
			check = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}
		
		return check;
	}
	
	// 수정 또는 검색 시, 학번을 이용하여 해당 학생 객체를 얻어오는 메서드
	public StudentDTO selectOne(String id) {
		StudentDTO dto = null;
		String sql = "SELECT * FROM student WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			// next() 메소드는 테이블에서 테이블의 다음 행을 가르키는 cursor와 같은 역할
			// 다음 행이 존재한다면(값이 있다면) true, 없다면 false를 return값으로 줌
			if(rs.next()) { 
				dto = new StudentDTO(rs.getString("id"),
									 rs.getString("name"),
									 rs.getInt("kor"),
									 rs.getInt("eng"),
									 rs.getInt("math"));
			}
		}catch(Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		}finally {
			close(conn, pstmt, rs);
		}
		return dto;
	}
	
	// 수정한 학생 객체 1개를 DB에 담는 메서드
	public int updateStudent(StudentDTO dto) {
		String sql = "UPDATE student SET name=?, kor=?, eng=?, math=? WHERE id=?";
		int check = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();    
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMath());
			pstmt.setString(5, dto.getId());
			
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		}finally {
			close(conn, pstmt, null);
		}
		return check;
	}
	
	// 학생 한 명 삭제 메서드
	public int deleteStudent(String id) {
		String sql = "delete from student where id = ?";
		
		int check = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		}finally {
			close(conn, pstmt, null);
		}
		return check;
	}
	
	// DB에 저장된 학생 정보를 모두 출력하는 메서드
	public ArrayList<StudentDTO> selectAllStudent(){
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		String sql = "SELECT * FROM student";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentDTO dto = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				dto = new StudentDTO(rs.getString("id"),
								     rs.getString("name"),
									 rs.getInt("kor"),
									 rs.getInt("eng"),
									 rs.getInt("math"));
				list.add(dto);
			}
		}catch(Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		}finally {
			close(conn, pstmt, rs);
		}
		return list;
		
	}
}
