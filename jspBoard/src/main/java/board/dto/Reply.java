package board.dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Reply {
	
	private Integer reply_id;
	private String commenter_id;
	private String commenter_pw;
	private String reply_content;
	private Date reply_date;
	private Integer board_id;
	
	private static SimpleDateFormat dayFormat = new SimpleDateFormat("yy.MM.dd");
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

	
	public Reply() {}
	
	public Reply(Integer reply_id, String commenter_id, 
			String commenter_pw, String reply_content, Date reply_date, Integer board_id) {
		this.reply_id = reply_id;
		this.commenter_id = commenter_id;
		this.commenter_pw = commenter_pw;
		this.reply_content = reply_content;
		this.reply_date = reply_date;
		this.board_id = board_id;
	}
	
	public Reply(ResultSet rs) throws SQLException {
		reply_id = rs.getInt("reply_id");
		commenter_id = rs.getString("commenter_id");
		commenter_pw = rs.getString("commenter_pw");
		reply_content = rs.getString("reply_content");
		reply_date = rs.getDate("reply_date");
		board_id = rs.getInt("board_id");
	}

	public String getCreationDateTime() {
		LocalDate creationDate = ((java.sql.Date)reply_date).toLocalDate();
				
		LocalDate today = LocalDate.now();
		
		return creationDate.isEqual(today) ? 
				timeFormat.format(reply_date) : dayFormat.format(reply_date);
	}
	
	public Integer getReply_id() {
		return reply_id;
	}

	public void setReply_id(Integer reply_id) {
		this.reply_id = reply_id;
	}

	public String getCommenter_id() {
		return commenter_id;
	}

	public void setCommenter_id(String commenter_id) {
		this.commenter_id = commenter_id;
	}

	public String getCommenter_pw() {
		return commenter_pw;
	}

	public void setCommenter_pw(String commenter_pw) {
		this.commenter_pw = commenter_pw;
	}

	public String getReply_content() {
		return reply_content;
	}

	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}

	public Date getReply_date() {
		return reply_date;
	}

	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}

	public Integer getBoard_id() {
		return board_id;
	}

	public void setBoard_id(Integer board_id) {
		this.board_id = board_id;
	}
	
	
}
