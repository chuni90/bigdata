package mov.com.vo;
import static mov.com.db.JdbcUtils.close;
import static mov.com.db.JdbcUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDAO {
	
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
		
		
}
