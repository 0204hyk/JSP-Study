package board.service;

import javax.servlet.http.HttpServletRequest;

import board.dao.BoardDao;
import board.dao.BoardDao_impl;
import board.dto.Board;

public class ReadBoardService implements Service{

	BoardDao dao = new BoardDao_impl();
	
	@Override
	public String service(HttpServletRequest req) {
		
		String board_id = req.getParameter("board_id");
		
		if (board_id == null) {
			return "board/not_exists";
		}
		
		int id = Integer.parseInt(board_id);
		
		Board board = dao.selectBoardById(id);
		
		if (board == null) {
			return "board/not_exists";
		}
		
		dao.increaseView(id);
		req.setAttribute("board", board);
		
		return "board/contents";
	}
	
}
