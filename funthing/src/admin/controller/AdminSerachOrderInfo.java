// 주문관리 페이지 검색_혜린
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
 * Servlet implementation class AdminSerachOrderInfo
 */
@WebServlet("/admin/searchOrder")
public class AdminSerachOrderInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSerachOrderInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService aService = new AdminService();
		
		int listCount = aService.getOrderListCount();
		
				// 페이지 수 처리용 변수 선언
				int currentPage;	// 현재 페이지
				int limit;			// 한 페이지에 보여질 게시글 수 
				int maxPage;		// 전체 페이지 수
				int startPage;		// 한 번에 표시될 페이지가 시작할 페이지
				int endPage;		// 한 번에 표시될 페이지가 끝나는 페이지
				System.out.println("servlet detail listCount: " + listCount);
				
				
				currentPage = 0;
				
				if(request.getParameter("currentPage") != null) {
					currentPage = Integer.valueOf(request.getParameter("currentPage"));
				}else {
					currentPage = 1;
				}
				
				limit = 20;				
				maxPage = (int)((double)listCount/limit + 0.95);
				startPage = ((int)(((double)currentPage/limit + 0.95)-1) * limit) +1;
				endPage = startPage + limit -1;
				
				if(maxPage < endPage) {
					endPage = maxPage;
				}
				
				PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
				
				// 검색창 구현 시작
				String searchKind = request.getParameter("searchKind");
				String searchText = null;

				ArrayList<OrderInfo> searchList = aService.selectOrderSearch(currentPage, limit, searchKind, searchText);

				RequestDispatcher view = null;
				System.out.println("servlet search : " + searchList);
				if(!searchList.isEmpty()) {
					view = request.getRequestDispatcher("/views/admin/adminSearchOrder.jsp");
					request.setAttribute("searchList", searchList);
					request.setAttribute("pi", pi);
					request.setAttribute("searchText", searchText);
				}
				if(searchList.isEmpty()) {
					searchText = "";
					response.sendRedirect(request.getContextPath()+"/admin/searchOrder");
					view = request.getRequestDispatcher("/views/admin/adminSearchOrder.jsp");
					request.setAttribute("searchText", "" );
					System.out.println("servlet searchList : " + searchList );
					request.setAttribute("pi", pi); 
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
