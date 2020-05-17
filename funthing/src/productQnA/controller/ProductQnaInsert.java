package productQnA.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import productQnA.model.service.ProductQnAService;
import productQnA.model.vo.ProductQnaIn;

/**
 * Servlet implementation class ProductQnaInsert
 */
@WebServlet("/productQnaInsert")
public class ProductQnaInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @param bNo 
     * @param pNo 
     * @param content 
     * @param title 
     * @param mNo 
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doGet(HttpS	ervletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String mNo = request.getParameter("mNo");
		String title = request.getParameter("q1_tit");
		String content = request.getParameter("q1_cont");
		// 상품번호와 브랜드번호도 불러와야함
		String pNo = "W0101001BKS";
		String bNo = "01";
		
		ProductQnaIn qna = new ProductQnaIn(mNo, title, content, pNo, bNo);
		int result = new ProductQnAService().productQnaInsert(qna);
		
		RequestDispatcher view = null;
		if(result>0) {
			view = request.getRequestDispatcher("/productQnaList");
			request.setAttribute("mNo", mNo);
			
		}else {
			view = request.getRequestDispatcher(request.getContextPath()+"/productQnaList");
			request.setAttribute("mNo", mNo);
			System.out.println("상품문의 작성 실패");
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
