package payment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import payment.model.service.PaymentService;
import payment.model.vo.OrderList;
import payment.model.vo.OrderUpdate;

/**
 * Servlet implementation class MyPageOrderListServlet
 */
@WebServlet("/member/myPageOrderList")
public class MyPageOrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyPageOrderListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("member/myPageOrderList");

		String userNo = request.getParameter("userNo");
		if(userNo == null) {
			userNo = (String)request.getAttribute("userNo");
		}

		System.out.println("로그인값 넘어왔니?" + userNo);
		
		// 날짜 선택값 받기
		String searchDate = request.getParameter("searchDate");
		String firstDate = request.getParameter("firstDate");
		String secondDate = request.getParameter("secondDate");
		
		/*
		 * if(searchDate.equals("null") && firstDate.equals("null")) { searchDate =
		 * null; firstDate = null; }
		 */
		
		
		System.out.println("servlet searchDate : " +  searchDate);
		
		PaymentService pService = new PaymentService();

		int orderListCount = pService.getOrderListCount(userNo);

		System.out.println("리스트 갯수 : " + orderListCount);

		// 페이징 관련 변수 선언
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;

		currentPage = 0;
		if (request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));

		} else {
			currentPage = 1;
		}

		limit = 10;

		maxPage = (int) ((double) orderListCount / limit + 0.9);
		startPage = ((int) (((double) currentPage / limit + 0.9) - 1) * limit) + 1;
		endPage = startPage + limit - 1;

		if (endPage > maxPage) {
			endPage = maxPage;
		}
		
		// 페이징 처리 관련 객체 만들기
		PageInfo pi = new PageInfo(currentPage, orderListCount, limit, maxPage, startPage, endPage);
		
		System.out.println("pi" + pi);
		
		// 페이징 처리 + 날짜 검색 처리
		/*
		 * ArrayList<OrderList> list = pService.selectOrderList(searchDate, firstDate,
		 * secondDate, currentPage, limit, userNo);
		 */
		ArrayList<OrderUpdate> list = pService.selectOrderList(searchDate, firstDate, secondDate, currentPage, limit, userNo);
		// 배송지 수정 및 주문취소
		
		
		System.out.println("Servlet에서  주문목록 리스트" + list);

		// 서비스 다녀와서 리스트 화면 처리
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/member/myPageOrderList.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("userNo", userNo);
			
		}else {
			view = request.getRequestDispatcher("/views/member/myPageOrderList.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
		}
		
		view.forward(request, response);		
		
		
				
				
				
//		ArrayList<OrderList> list = new ArrayList<>();
//		
//		list = new PaymentService().orderList();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
