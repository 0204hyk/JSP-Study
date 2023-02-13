package chap07.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import chap07.dao.PizzaOrderDAO;

public class OrderInsertBusinessLogic implements BusinessLogic{
	
	PizzaOrderDAO orderDao;
	
	@Override
	public String process(HttpServletRequest request) {		
		
		String sql = "INSERT INTO pizza_order VALUES(?,?,?,?,?,?,?,?,?)";

		String name = request.getParameter("name");
		String streetAddress = request.getParameter("street-address"); 
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String crust = request.getParameter("crust");
		String size = request.getParameter("size");
		String[] toppings = request.getParameterValues("toppings");
		String topping = String.join("/", toppings);
		String instruction = request.getParameter("instruction");

		// DAO를 이용해서 일련의 과정을 아래 주석처리한 부분만큼 줄일 수 있다.
//		// 인터페이스를 통해 나중에 만들겠다고 약속만 해놓은 상태
//		int row = orderDao.insert(new PizzaOrder
//				(name, streetAddress, city, email, phone, crust, size, topping, instruction));
//		
//		// row 값에 따라 redirect를 결정
//		if (row == 1) {
//			return "redirect::/chap07/pizza/order/result?name=" + name;
//		} else {
//			return "redirect::/chap07/pizza/order/failed";
//		}
		
		try (
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, name);
			pstmt.setString(2, streetAddress);
			pstmt.setString(3, city);
			pstmt.setString(4, email);
			pstmt.setString(5, phone);
			pstmt.setString(6, crust);
			pstmt.setString(7, size);
			pstmt.setString(8, topping);
			pstmt.setString(9, instruction);
			
			int row = pstmt.executeUpdate();
			
			if (row > 0) {
				System.out.println("주문 성공함");
			} else {
				System.out.println("주문 실패");
			}
			
//			request.setAttribute("success", row);
//			request.setAttribute("info", new PizzaOrder(name, streetAddress, city, 
//						email, phone, crust, size, topping, instruction));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		return "pizza/order/orderSummary";
		// 리다이렉트 경로에 ?를 추가해 원하는 정보를 보낼 수도 있다.
		return "redirect::/chap07/pizza/order/result?name=" + name;

	}

}
