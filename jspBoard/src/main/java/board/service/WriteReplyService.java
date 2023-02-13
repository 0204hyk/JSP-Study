package board.service;

import javax.servlet.http.HttpServletRequest;

import board.dao.ReplyDao;
import board.dao.ReplyDao_impl;
import board.dto.Reply;

public class WriteReplyService implements Service{

	ReplyDao dao = new ReplyDao_impl();
	
	@Override
	public String service(HttpServletRequest req) {
		
		String commenter_id = req.getParameter("commenter_id");
		String commenter_pw = req.getParameter("commenter_pw");
		String reply_content = req.getParameter("reply_content");
		int board_id = Integer.parseInt(req.getParameter("board_id"));
		
		Reply reply = new Reply();
		
		reply.setCommenter_id(commenter_id);
		reply.setCommenter_pw(commenter_pw);
		reply.setReply_content(reply_content);
		
		dao.write(reply, board_id);
		
		return "redirect::" + req.getContextPath() + "/contents?board_id=" + board_id;
	}
	
}
