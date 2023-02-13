package board.service;

import javax.servlet.http.HttpServletRequest;

import board.dao.BoardDao;
import board.dao.BoardDao_impl;
import board.dto.Board;

public class ModifyPasswordCheckService implements Service{

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
		req.setAttribute("board", b);
		
		if (b != null && b.getWriter_pw().equals(user_pw)) {
			
			return "board/modi_form";
		} else {
			System.out.println("비밀번호 틀림");
			return "redirect::" + req.getContextPath() + "/list";
		}		
	}

}
