package chap01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	/*
		C:\JavaFullStack_KHY\jsp-workspace
		\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\chap01\org\apache\jsp
		
		내부의 파일을 메모장, vscode등으로 열어보면 작성한 jsp파일이 서블릿 형태로 저장되어있다.
	*/ 
	
	
	// JSP의 <%! %> 부분
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// HttpServletRequest : 사용자의 요청 정보가 담겨있는 객체
		// HttpServletResponse : 모든 처리가 끝난 후 응답해야하는 객체
		
		// JSP의 <%  %> 부분
		
		//resp.getWriter() : PrintWriter를 리턴
		PrintWriter out = resp.getWriter();
		
		// JSP는 1차로 서블릿 형태로 변환된다.
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1 style=\"color: red;\">Hello</h1>");
		out.print("<p>Hello, Servlet!</p>");
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
