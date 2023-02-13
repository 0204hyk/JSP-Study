package chap04.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/quiz/login")
public class LoginServlet extends HttpServlet{
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		HttpSession session = req.getSession();
		
		session.setAttribute("id", req.getParameter("mem-id"));
		session.setAttribute("password", req.getParameter("password"));
		
		String id = (String)session.getAttribute("id");
		String password = (String)session.getAttribute("password");
		HashMap<String, String> map = (HashMap)session.getAttribute("info");
		
		if (map == null || !map.containsKey(id)) { 
			System.out.println("아이디 존재하지않음");
			req.getRequestDispatcher("/quiz/login.jsp").forward(req, resp);
		} else {
			if (map.get(id).equals(password)) {
				System.out.println("로그인 성공");
				req.getRequestDispatcher("/quiz/main.jsp").forward(req, resp);
			} else {
				System.out.println("비밀번호 불일치");
				req.getRequestDispatcher("/quiz/login.jsp").forward(req, resp);
			}
		}
		
	}
}
