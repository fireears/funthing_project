package review.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review.model.service.ReviewService;
import review.model.vo.Review;

/**
 * Servlet implementation class MyReviewListServlet
 */
@WebServlet("/myReview")
public class MyReviewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyReviewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("잘 나오나??");
		request.setCharacterEncoding("UTF-8");
		String mNo = request.getParameter("mNo");
		
		System.out.println(mNo);
		
		ArrayList<Review> rvList = new ArrayList<>();
		
		ReviewService rvs = new ReviewService();
		
		rvList = rvs.reviewSelect(mNo);
//		
		for(int i = 0; i < rvList.size(); i ++) {
			System.out.println("ser : " + rvList.get(i));
		}
		
		RequestDispatcher view = null;
		if(!rvList.isEmpty()) {
			view = request.getRequestDispatcher("/views/review/myPageReview.jsp");
			request.setAttribute("rvList", rvList);
			
		}else {
			view = request.getRequestDispatcher("/views/review/myPageReview.jsp");
			request.setAttribute("rvList", rvList);
			String rvMsg = "작성한 리뷰가 없습니다.";
			request.setAttribute("rvMsg", rvMsg);
			
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
