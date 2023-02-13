package board.service;

import javax.servlet.http.HttpServletRequest;

import board.dao.BoardDao;
import board.dao.BoardDao_impl;
import board.dto.Board;

public class ModifyCompleteService implements Service {

	BoardDao dao = new BoardDao_impl();
	
	@Override
	public String service(HttpServletRequest req) {
		int board_id = Integer.parseInt(req.getParameter("board_id"));
		String write_title = req.getParameter("write_title");
		String write_content = req.getParameter("write_content");
		
		Board b = new Board();
		
		b.setBoard_id(board_id);
		b.setWrite_title(write_title);
		b.setWrite_content(write_content);
		
		dao.modify(b);
		
		return "board/modify_complete";
	}
	
}
