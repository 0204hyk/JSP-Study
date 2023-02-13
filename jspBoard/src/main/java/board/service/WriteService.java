package board.service;

import javax.servlet.http.HttpServletRequest;

import board.dao.BoardDao;
import board.dao.BoardDao_impl;
import board.dto.Board;

public class WriteService implements Service{

	BoardDao dao = new BoardDao_impl();
	
	@Override
	public String service(HttpServletRequest req) {
		
		// 1. request에 실려온 파라미터 정보를 모두 읽는다.
		String writer_id = req.getParameter("writer_id");
		String writer_pw = req.getParameter("writer_pw");
		String write_title = req.getParameter("write_title");
		String write_content = req.getParameter("write_content");
		
		// 1-2. 데이터를 전달하기 편한 형태로 만들어 준다. (dto에 담는다.)
		Board b = new Board();
		
		b.setWriter_id(writer_id);
		b.setWriter_pw(writer_pw);
		b.setWrite_title(write_title);
		b.setWrite_content(write_content);
		
		// 2. 전달받은 내용을 DB에 쓴다. (DAO가 할 일)
		boolean result = dao.write(b);
		
		// 3. 결과에 따라 하고싶은 일을 한다.
		// ex > 글쓰기 실패 화면, 성공 화면
		
		return "redirect::" + req.getContextPath() + "/list";
	}
	
}
