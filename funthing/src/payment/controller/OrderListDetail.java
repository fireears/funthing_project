package payment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import payment.model.service.PaymentService;
import payment.model.vo.OrderUpdate;

/**
 * Servlet implementation class OrderListDetail
 */
@WebServlet("/orderListDetail")
public class OrderListDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderListDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userNo = request.getParameter("userNo");
		String oNo = request.getParameter("oNo");
		System.out.println("userNo : " + userNo);
		ArrayList<OrderUpdate> list = new PaymentService().selectOrderDetail(oNo, userNo);
		
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/payment/clientOrderDetail.jsp");
			request.setAttribute("list", list);
			
			System.out.println("여기까지 오니??");
		}else {
			
			view = request.getRequestDispatcher("/member/myPageOrderList");
			request.setAttribute("userNo", userNo);
			System.out.println("주문 상세 목록 실패");
			
		}
		view.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
