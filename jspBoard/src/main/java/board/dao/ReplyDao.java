package board.dao;

import java.util.List;

import board.dto.Board;
import board.dto.Reply;

public interface ReplyDao {
	
	List<Reply> selectAllReplys(int board_id);
	
	Reply selectReplyById(int reply_id);

	boolean write(Reply reply, int board_id);
	
	boolean modify(Reply reply);
	
	boolean delete(int reply_id);

	
}
