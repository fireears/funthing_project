// 주문관리 페이지 상세보기_혜린
package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import payment.model.vo.OrderInfoDetail;

/**
 * Servlet implementation class AdminOrderInfoDetail
 */
@WebServlet("/admin/orderInfoDetail")
public class AdminOrderInfoDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminOrderInfoDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid");
		System.out.println("servlet mid : "+ mid);
		
		OrderInfoDetail od = new AdminService().selectOrderDetail(mid);
		
		
		RequestDispatcher view = null;
		if(od != null) {
			view = request.getRequestDispatcher("/views/admin/adminOrderInfoDetail.jsp");
			request.setAttribute("od", od);
			System.out.println("servlet od :" + od);
			
		}else {
			view = request.getRequestDispatcher("views/admin/common/errorPage.jsp");
			request.setAttribute("msg", "게시판 상세조회 실패");
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
