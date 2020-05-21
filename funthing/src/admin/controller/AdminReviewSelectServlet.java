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
import review.model.vo.Review;

/**
 * Servlet implementation class AdminReviewSelectServlet
 */
@WebServlet("/admin/AdminReviewSelect")
public class AdminReviewSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminReviewSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
		
		AdminService adSev = new AdminService();
		int rvListCont = adSev.getRvListCount();
		
//		System.out.println("rvservlet : " + rvListCont);
		
		int currentPage;
		int maxPage;
		int startPage;
		int endPage;

		int limit = 10;
		currentPage = 0;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}else {
			currentPage = 1;
		}
		
		maxPage = (int)((double)rvListCont/limit + 0.9);
		startPage = ((int)((double)currentPage/limit + 0.9)-1)*limit + 1;
		endPage = startPage + limit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, rvListCont, limit, maxPage, startPage, endPage);
		
		
		//
		ArrayList<Review> rvList = new ArrayList<>();
		String searchpName = request.getParameter("ad_rvPrdName");
		
		System.out.println(searchpName);
		
		rvList = adSev.selectReviewLIst(currentPage, limit, searchpName);

		for(int i = 0; i < rvList.size(); i ++) {
			System.out.println(rvList.get(i));
		}
		
		
		RequestDispatcher view = null;
		if(!rvList.isEmpty()) {
			view = request.getRequestDispatcher("/views/admin/adminReviewList.jsp");
			request.setAttribute("rvList", rvList);
			request.setAttribute("pi", pi);
			
		}else {
			
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
