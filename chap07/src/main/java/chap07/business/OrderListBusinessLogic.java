package chap07.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import chap07.dao.PizzaOrderDAO;
import chap07.dao.PizzaOrderDAO_Impl;
import chap07.dto.PizzaOrder;

public class OrderListBusinessLogic implements BusinessLogic {
	
	PizzaOrderDAO orderDAO = new PizzaOrderDAO_Impl();
	
	@Override
	public String process(HttpServletRequest request) {	
		// # DAO (Data Access Object)
		
		// 수 많은 비즈니스 로직들은 DB에 똑같은 작업들을 많이 진행하게 된다.
		// 그렇기 때문에 비즈니스 로직 내부에서도 DB 관련 작업들(DAO)을 따로 묶어 정리해두면
		// 작업량을 많이 줄일 수 있다.
		List<PizzaOrder> pastOrders = orderDAO.selectAll("SELECT * FROM pizza_order");
		
		request.setAttribute("pastOrders", pastOrders);
		
		return "pizza/order/orderList";

//		try (
//			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
//			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM pizza_order");
//			ResultSet rs = pstmt.executeQuery();
//		){
//			List<String> orders = new ArrayList<>();
//			
//			while (rs.next()) {
//				orders.add(String.format("<tr>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "<td>%s</td>"
//						+ "</tr>",
//						rs.getString("client_name"),
//						rs.getString("street_address"),
//						rs.getString("city"),
//						rs.getString("email"),
//						rs.getString("phone"),
//						rs.getString("crust"),
//						rs.getString("pizza_size"),
//						rs.getString("topping"),
//						rs.getString("instruction")));
//
//			}
//			
//			// DB에서 꺼낸 데이터를 잘 정리하여 어트리뷰트에 추가 
//			// (ArrayList -> List 1차 업캐스팅 / List -> Object 2차 업캐스팅되어 어트리뷰트에 오브젝트 타입으로 저장된다.)
//			request.setAttribute("orders", orders);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		// 다음으로 포워드하는 jsp 리턴
//		return "pizza/order/orderList";
	}

}
