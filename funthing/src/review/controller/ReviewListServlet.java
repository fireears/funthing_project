package review.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import payment.model.vo.OrderInfoDetail;
import review.model.service.ReviewService;
import review.model.vo.Review;

/**
 * Servlet implementation class ReviewListServlet
 */
@WebServlet("/ReviewList")
public class ReviewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("review List servlet");
		ReviewService rvService = new ReviewService();
		ArrayList<Review> rvListView = new ArrayList<>();
		
		String pNo = (String)request.getParameter("rev_pNo");	// 상품 번호 받아옴
		System.out.println(pNo);
		
		rvListView = rvService.selectReview(pNo);
		
		for(int i = 0; i < rvListView.size(); i++) {
			System.out.println(rvListView.get(i));
		}
		
		RequestDispatcher view = null;
		if(!rvListView.isEmpty()) {
			view = request.getRequestDispatcher("views/product/productDetail.jsp");
			request.setAttribute("rvListView", rvListView);
			
		}else {
			
		}

		JSONArray pjArray = new JSONArray();
		JSONObject pjObj = null;
		
		for(Review rv : rvListView) {
			pjObj = new JSONObject();

			pjObj.put("rvNo", rv.getRevNo());
			pjObj.put("rvTitle", rv.getRevTitle());
			pjObj.put("rvpNo", rv.getpNo());
			pjObj.put("rvContents", rv.getRevContents());
			pjObj.put("rvDate", rv.getRevDate());
			pjObj.put("rvView", rv.getViewsNum());
			pjObj.put("rvRate", rv.getRate());
			pjObj.put("rvImg", rv.getRevPic());
			pjObj.put("rvName", rv.getRvName());
			pjObj.put("rvRateStar", rv.getRateStar());
			
			pjArray.add(pjObj);
		}
		

	      response.setContentType("application/json; charset=utf-8"); 
	      
	      PrintWriter out = response.getWriter();
	      out.print(pjArray);
	      out.flush();
	      out.close();
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
