package productQnA.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productQnA.model.service.ProductQnAService;
import productQnA.model.vo.AdminProductQnA;

/**
 * Servlet implementation class ProductQnaDetail
 */
@WebServlet("/productQnaDetail")
public class ProductQnaDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductQnaDetail() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mNo = request.getParameter("mNo");
		String qnaNo = request.getParameter("qnaNo");
		
		AdminProductQnA apq = new ProductQnAService().ProductQnaDetail(mNo, qnaNo);
		RequestDispatcher view = null;
		if(apq != null) {
			view = request.getRequestDispatcher("/views/admin/adminOrderInfoDetail.jsp");
			request.setAttribute("od", apq);
			System.out.println("servlet od :" + apq);
			
		}else {
			
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
