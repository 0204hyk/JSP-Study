package chap04.quiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/quiz/join")
public class JoinServlet extends HttpServlet{

	HashMap<String, String> map = new HashMap<>();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		HttpSession session = req.getSession();
		
		
		session.setAttribute("id", req.getParameter("join-id"));
		session.setAttribute("password", req.getParameter("join-pw"));
		
		String id = (String)session.getAttribute("id");
		String password = (String)session.getAttribute("password");
		
		
		if (!map.containsKey(id)) {
			map.put(id, password);
		} else {
			PrintWriter writer = resp.getWriter();
			writer.println("<script>alert('아이디 중복'); location.href='./join.jsp'</script>"); 
			writer.close();
			return;
		}
		
		session.setAttribute("info", map);
		
		
		System.out.println(id);
		System.out.println(password);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		req.getRequestDispatcher("/quiz/login.jsp").forward(req, resp);
	}
}
