// 주문관리 페이지_혜린
package admin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import board.model.vo.PageInfo;
import payment.model.vo.OrderInfo;

/**
 * Servlet implementation class AdminOrderInfo
 */
@WebServlet("/admin/orderInfo")
public class AdminOrderInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminOrderInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			AdminService aService = new AdminService();
			String searchKind = request.getParameter("searchKind");	// 검색 종류 값
			String searchText = request.getParameter("searchText"); // 검색 입력창 값
			
			int listCount = aService.getOrderListCount(searchKind,searchText);
			
			// 페이지 수 처리용 변수 선언
			int currentPage;	// 현재 페이지
			int limit;			// 한 페이지에 보여질 게시글 수 
			int maxPage;		// 전체 페이지 수
			int startPage;		// 한 번에 표시될 페이지가 시작할 페이지
			int endPage;		// 한 번에 표시될 페이지가 끝나는 페이지
			System.out.println("servlet listCount: " + listCount);
			
			currentPage = 0;
			
			if(request.getParameter("currentPage") != null) {
				currentPage = Integer.valueOf(request.getParameter("currentPage"));
			}else {
				currentPage = 1;
			}

			limit = 10;
			maxPage = (int)((double)listCount/limit + 0.9); // +1 안하면 페이지 한정 덜나옴 왜그러지?
			startPage = ((int)(((double)currentPage/limit + 0.9)-1) * limit) +1;
			endPage = startPage + limit -1;
			
			if(maxPage < endPage) {
				endPage = maxPage;
			}
			
			PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
			
			// 검색창 구현 시작
			
		
//			if(searchText != null) {
//				searchText = request.getParameter("searchText");
//			}else {
//				searchText = (String) request.getAttribute("searchText");
//			}
			
//				System.out.println("servlet searchKind : " + searchKind);
//				System.out.println("servlet searchText : " + searchText);
			
			ArrayList<OrderInfo> searchList = aService.selectOrderSearch(currentPage, limit, searchKind, searchText);
			
			RequestDispatcher view = null;
			if(!searchList.isEmpty()) {		// 검색의 조건이 알맞을 때
				view = request.getRequestDispatcher("/views/admin/adminOrderInfo.jsp");
				request.setAttribute("searchList", searchList);
//				request.setAttribute("searchList", searchList);
//				request.setAttribute("searchText", searchText);
				request.setAttribute("pi", pi);
			
			}else {							// 검색의 조건이 틀렸을 때 
				view = request.getRequestDispatcher("/views/admin/adminOrderInfo.jsp");
				request.setAttribute("searchList", searchList);
				request.setAttribute("pi", pi);
//				response.sendRedirect(request.getContextPath()+"/admin/searchOrder");
//				request.setAttribute("searchText", "" );
//					System.out.println("servlet searchList : " + searchList );
//				request.setAttribute("pi", pi); 
//				return;		// 하지않으면 완료된 commit error
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
