package board.service;

import javax.servlet.http.HttpServletRequest;

import board.dao.BoardDao;
import board.dao.BoardDao_impl;
import board.dto.Board;

public class DeletePasswordCheckService implements Service{
	
	BoardDao dao = new BoardDao_impl();
	
	@Override
	public String service(HttpServletRequest req) {		
		String user_pw = req.getParameter("user_pw");
		String board_id = req.getParameter("board_id");
		
		if (board_id == null) {
			System.out.println("board_id 없음");
			return "redirect::" + req.getContextPath() + "/list";
		}
		
		Board b = dao.selectBoardById(Integer.parseInt(board_id));
		
		if (b != null && b.getWriter_pw().equals(user_pw)) {
			dao.delete(Integer.parseInt(board_id));
			
			return "board/delete_complete";
			
		} else {
			return "redirect::" + req.getContextPath() + "/list";
		}

		
	}

}
