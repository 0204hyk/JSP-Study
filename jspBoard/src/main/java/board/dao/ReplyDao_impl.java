package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.dto.Board;
import board.dto.Reply;

public class ReplyDao_impl implements ReplyDao {

	@Override
	public List<Reply> selectAllReplys(int board_id) {
		List<Reply> replys = new ArrayList<>();
		String sql = "SELECT * FROM reply WHERE board_id=? ORDER BY reply_id";
		
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setInt(1, board_id);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				replys.add(new Reply(rs));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return replys;
	}

	@Override
	public Reply selectReplyById(int reply_id) {
		return null;
	}

	@Override
	public boolean write(Reply reply, int board_id) {
		String sql = "INSERT INTO reply VALUES(reply_id_seq.NEXTVAL, ?, ?, ?, sysdate, ?)";
		
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, reply.getCommenter_id());
			pstmt.setString(2, reply.getCommenter_pw());
			pstmt.setString(3, reply.getReply_content());
			pstmt.setInt(4, board_id);
			
			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		

	}

	@Override
	public boolean modify(Reply reply) {
		return false;
	}

	@Override
	public boolean delete(int reply_id) {
		return false;
	}

}
