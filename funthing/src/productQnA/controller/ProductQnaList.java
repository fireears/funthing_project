package productQnA.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import productQnA.model.service.ProductQnAService;
import productQnA.model.vo.ProductQnaIn;


/**
 * Servlet implementation class ProductQnaList
 */
@WebServlet("/productQnaList")
public class ProductQnaList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductQnaList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		ProductQnAService aService = new ProductQnAService();
		
		String mNo = request.getParameter("mNo");
		System.out.println("mNo :" + mNo);
		int listCount = aService.getListQnaCount(mNo);
		System.out.println("Listservlet listCount : " + listCount);
		
		
		// 날짜 선택값 받기
		String searchDate = request.getParameter("searchDate");
		String firstDate = request.getParameter("firstDate");
		String secondDate = request.getParameter("secondDate");
		
		
		// 페이징 처리
		int currentPage;		// 현재 페이지를 저장할 변수
		int limit;				// 한 페이지에 보여질 게시글 수
		int maxPage;			// 전체 페이지의 맨 마지막 페이지
		int startPage;			// 한번에 표시될 페이지가 시작할 페이지
		int endPage;			// 한번에 표시될 페이지가 끝나는 페이지
		
		
		currentPage = 0;
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}else {
			currentPage = 1;
		}
		System.out.println("currentPage : " +  currentPage);
		limit = 10;
		maxPage = (int)((double)listCount/limit + 0.9);
		startPage = ((int)((double)currentPage/limit + 0.9)-1)*limit + 1;
		endPage = startPage + limit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);

		
		ArrayList<ProductQnaIn> list = aService.selectProductQnaCList(searchDate, firstDate, secondDate,currentPage, limit, mNo);
		System.out.println("servlet list : " + list);
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/productQnA/productQnAList.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("mNo", mNo);
			
		}else {
			view = request.getRequestDispatcher("/views/productQnA/productQnAList.jsp");
			request.setAttribute("list", list);
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
