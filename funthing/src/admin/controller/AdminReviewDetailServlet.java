package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import review.model.vo.Review;

/**
 * Servlet implementation class AdminReviewDetailServlet
 */
@WebServlet("/admin/AdminReviewDetail")
public class AdminReviewDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminReviewDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int revNo = Integer.valueOf(request.getParameter("revNo"));
		System.out.println("servlet rvNo : " + revNo);
		
		Review rv = new AdminService().reviewDatail(revNo);
		
		RequestDispatcher view = null;
		if(rv != null) {
			view = request.getRequestDispatcher("/views/admin/adminReviewDetail.jsp");
			request.setAttribute("rv", rv);
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
