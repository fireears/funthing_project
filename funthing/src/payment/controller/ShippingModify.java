package payment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import payment.model.service.PaymentService;
import payment.model.vo.OrderUpdate;



/**
 * Servlet implementation class ShippingModify
 */
@WebServlet("/shippingModify")
public class ShippingModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShippingModify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String searchDate = request.getParameter("searchDate");
		String firstDate = request.getParameter("firstDate");
		String userNo = request.getParameter("userNo");
//		System.out.println("update servlet userNo : " + userNo);
//		System.out.println("update servlet searchDate : " + searchDate);
//		System.out.println("update Servlet firstDate :" + firstDate);
		String oNo = request.getParameter("oNo");
		String shipName = request.getParameter("shipName");
		String shipAds = request.getParameter("shipAds");
		int shipTel = Integer.valueOf(request.getParameter("shipTel"));
		String shipCom = request.getParameter("shipCom");
		
//		System.out.println("oNo : " + oNo);
		
		OrderUpdate ou = new OrderUpdate(oNo, shipName, shipAds, shipTel, shipCom);
		
		int result = new PaymentService().updateShipModi(ou);
		
		RequestDispatcher view = null;
		
		if(result>0) {
			view = request.getRequestDispatcher("/member/myPageOrderList");
			request.setAttribute("userNo" , userNo );
		}else {
			view = request.getRequestDispatcher("/member/myPageOrderList");
			request.setAttribute("userNo" , userNo );
			System.out.println("배송지수정 실패");
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
