package chap04.quiz;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/quiz/memo")
public class MemoServlet extends HttpServlet{
	List<String> memoList = new ArrayList<>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		memoList.add(req.getParameter("memo"));
	
		session.setAttribute("memoList", memoList);
		
		req.getRequestDispatcher("/quiz/memolist.jsp").forward(req, resp);
	}
}
