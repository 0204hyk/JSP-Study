package board.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.dao.BoardDao;
import board.dao.BoardDao_impl;
import board.dao.ReplyDao;
import board.dao.ReplyDao_impl;
import board.dto.Board;
import board.dto.Reply;

public class ReadBoardService implements Service{

	BoardDao boardDao = new BoardDao_impl();
	ReplyDao replyDao = new ReplyDao_impl();
	
	@Override
	public String service(HttpServletRequest req) {
		
		String board_id = req.getParameter("board_id");
		
		if (board_id == null) {
			return "board/not_exists";
		}
		
		int id = Integer.parseInt(board_id);
		
		Board board = boardDao.selectBoardById(id);
		
		if (board == null) {
			return "board/not_exists";
		}
		
		boardDao.increaseView(id);
		req.setAttribute("board", board);
		
		List<Reply> replys = replyDao.selectAllReplys(id); 
		
		req.setAttribute("replys", replys);
		
		return "board/contents";
	}
	
}
