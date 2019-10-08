package mov.com.vo;

import static mov.com.db.JdbcUtils.close;
import static mov.com.db.JdbcUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDAO {

	public ArrayList<AccountDTO> selectAllMoviee() {

		ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
		String sql = "select * from account";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AccountDTO dto = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				dto = new AccountDTO(rs.getString("id"), rs.getString("name"), rs.getString("mymovie"),
						rs.getString("power"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close(conn, pstmt, null);
		}
		return list;
	}

	public int voteMovie(String movieId, String userId) {
		String sql = "UPDATE account SET mymovie = ? WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, movieId);
			pstmt.setString(2, userId);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}
		return check;
	}

	public AccountDTO selectAcc(String id) {
		AccountDTO ato = null;
		String sql = "SELECT * FROM account where id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				ato = new AccountDTO(rs.getString("id"), rs.getString("name"), rs.getString("mymovie"),
						rs.getString("power"));
			}
		} catch (Exception e) {
			System.out.println("오류 발생!! >> " + e.getMessage());
		} finally {
			close(conn, pstmt, rs);
		}
		return ato;
	}

	public int makeAccount(AccountDTO dto) {
		String sql = "insert into account values(?,?,0,0)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			// pstmt.setString(0, dto.getMymovie());
			// pstmt.setString(0, dto.getPower());

			check = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}
		return check;
	}

	public ArrayList<JoinDTO> selectResult() {
		String sql = "SELECT m.id, m.title, COUNT(a.mymovie) as vote_count "
				+ "FROM movie m, account a WHERE m.id = a.mymovie GROUP BY m.id, m.title " + "ORDER BY vote_count desc";
		ArrayList<JoinDTO> list = new ArrayList<JoinDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		JoinDTO dto = new JoinDTO(0, sql, 0);

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new JoinDTO(rs.getInt("id"), rs.getString("title"), rs.getInt("vote_count"));
				list.add(dto);
			}

		} catch (Exception e) {
			System.out.println("오류 발생 >" + e.getMessage());
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}
		return list;
	}

}
