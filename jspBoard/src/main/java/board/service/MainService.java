package board.service;

import javax.servlet.http.HttpServletRequest;

public class MainService implements Service{
	@Override
	public String service(HttpServletRequest req) {
		return "main";
	}
}
