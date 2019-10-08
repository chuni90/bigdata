package mov.com.vo;

import static mov.com.db.JdbcUtils.close;
import static mov.com.db.JdbcUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieDAO {
	// 학생 정보를 등록하는 작업을 수행하는 메서드
	public int makeMovie(MovieDTO dto) {
		String sql = "insert into Movie values(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getCountry());
			pstmt.setString(4, dto.getRelease());
			pstmt.setString(5, dto.getDirector());
			
			check = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}
		return check;
	}
	public MovieDTO selectOne(int id) {
	      MovieDTO dto = null;
	      String sql = "SELECT * FROM movie where id = ?";
	      
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, id);
	         
	         rs = pstmt.executeQuery();
	         
	         if(rs.next()) {
	            dto = new MovieDTO(rs.getInt("id"),
	                           rs.getString("title"),
	                           rs.getString("country"),
	                           rs.getString("release"),
	                           rs.getString("director"));
	         }
	      }catch(Exception e) {
	         System.out.println("오류 발생!! >> " + e.getMessage());
	      }finally {
	         close(conn, pstmt, rs);
	      }
	      return dto;
	   }
	public ArrayList<MovieDTO> selectAllMovie() {
	      
	      ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
	      String sql = "select * from movie";
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      MovieDTO dto = null;
	      
	      
	      try {
	         conn =getConnection();
	         pstmt = conn.prepareStatement(sql);
	         rs= pstmt.executeQuery();
	         
	         while(rs.next()) {
	               dto = new MovieDTO(rs.getInt("id"),
	                               rs.getString("title"),
	                               rs.getString("country"),
	                               rs.getString("release"),
	                               rs.getString("director"));
	            list.add(dto);
	         }
	         
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	         
	      }finally {
	         close(conn,pstmt,rs);
	      }
	      return list;
	   }
	public int updateMovie(MovieDTO dto) {
	      String sql = "update movie set title =? , country=?, release=?, director=? where id=?";
	      int check = 0;
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, dto.getTitle());
	         pstmt.setString(2, dto.getCountry());
	         pstmt.setString(3, dto.getRelease());
	         pstmt.setString(4, dto.getDirector());
	         pstmt.setInt(5, dto.getId());
	         
	         check = pstmt.executeUpdate(); 
	         
	      } catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	         close(conn, pstmt, null);
	      }
	      
	      return check;
	   }
	   
	   public int deleteMovie(int id) {
	      String sql = "delete from movie where id = ?";
	      
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      int check = 0;
	      
	      
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement(sql);
	         
	         pstmt.setInt(1, id);
	         
	         check = pstmt.executeUpdate();
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         close(conn, pstmt, null);
	      }
	      return check;
	   }
}
