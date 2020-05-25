// 제품 상세 페이지_혜린
package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import product.model.service.ProductService;
import product.model.vo.ProductDetail;
import productQnA.model.vo.AdminProductQnA;

/**
 * Servlet implementation class ProductDetailServlet
 */
@WebServlet("/productDateil")
public class ProductDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("까꿍");
		ProductService pService = new ProductService();
		// 상품이름
		String pName = request.getParameter("pName");
		System.out.println("servlet pName : " + pName );
		
		ArrayList<ProductDetail> list  = pService.selectProDetail(pName);
		ArrayList<ProductDetail> sizeList = pService.sizeSelectProDetail(pName);
		ArrayList<ProductDetail> colorList = pService.colorSelectProDetail(pName);
		ArrayList<AdminProductQnA> qnaList = pService.qnaSelectProduct(pName);
		RequestDispatcher view = null;
		
			
		int listCount = pService.getListCount(pName);
//		System.out.println("제품상세 servlet listCount : " + listCount);
		
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
		
		limit = 10;
		maxPage = (int)((double)listCount/limit + 0.9);
		startPage = ((int)((double)currentPage/limit + 0.9)-1)*limit + 1;
		endPage = startPage + limit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
		
		if(list != null) {
			view = request.getRequestDispatcher("/views/product/productDetail.jsp");
			request.setAttribute("list", list);
			request.setAttribute("sizeList", sizeList);
			request.setAttribute("qnaList", qnaList);
			request.setAttribute("colorList", colorList);
			
		}else {
			System.out.println("제품상세 업로드  실패");
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
