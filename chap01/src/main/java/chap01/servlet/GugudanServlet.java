package chap01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan") // URL Mapping
public class GugudanServlet extends HttpServlet{
	/*
	 	/chap01/gugudan으로 접속하는 사용자들에게
	 	멋있는 구구단 페이지를 응답하는 서블릿을 만들어보세요.
	*/
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// request 객체는 주로 클라이언트의 정보를 담고 있다.
		System.out.println(req.getRemoteAddr() + "로부터 요청이 왔습니다.");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1 style=\"text-align: center;\">구구단</h1>");
		out.print("<div style=\"border: solid 1px black; display: grid; grid-template-columns: repeat(10, 1fr); height: 500px; box-sizing: border-box; border-radious: 15%;\">");
		for(int i = 2; i <= 9; ++i) {
			for (int j = 0; j <= 9; ++j) {
				if (j == 0) {
					out.print("<div style=\"font-size: 20px; border:solid 1px black; text-align: center; font-weight: bold; padding-top: 15px; background-color: blue; color: white;\">" + i + "단</div>");				
				} else {
					out.print("<div style=\"font-size: 20px; border:solid 1px black; text-align: center; padding-top: 15px; background-color: skyblue;\">" + i + "x" + j + "=" + i * j + "</div>");					
				}
			}
		}
		out.print("</div>");
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
