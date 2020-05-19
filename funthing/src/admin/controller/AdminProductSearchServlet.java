package admin.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import board.model.vo.PageInfo;
import product.model.vo.Product;

/**
 * Servlet implementation class ProductSearchServlet
 */
@WebServlet("/admin/productSearch")
public class AdminProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("adminProductSearch");
		AdminService aService = new AdminService();
		try
		{
			String pNo = request.getParameter("p_no");
			String bNo = request.getParameter("b_No");
			int sNo = Integer.valueOf(request.getParameter("s_no"));
			String pName = request.getParameter("p_name");
			int pCategory = Integer.valueOf(request.getParameter("pCategory"));
			int pPrice = Integer.valueOf(request.getParameter("p_price"));
			Date fStartDate = Date.valueOf(request.getParameter("f_start_date"));
			Date fEndDate = Date.valueOf(request.getParameter("f_end_date"));
			String fYn = request.getParameter("f_yn");
			
			System.out.println("sNo : " + sNo);
			Product p = new Product(pNo, bNo, pName, pPrice, pCategory, sNo, fStartDate, fEndDate, fYn);
			System.out.println(p);
			
			ArrayList<Product> list = new ArrayList<>();
			
			int listCount = aService.getListCount(p);
			
			System.out.println(listCount);
			
			int currentPage;
			int maxPage;
			int startPage;
			int endPage;
			
			int limit = 20;
			
			currentPage = 0;
			
			if(request.getParameter("currentPage")!=null)
			{
				currentPage = Integer.valueOf(request.getParameter("currentPage"));
			}
			else
			{
				currentPage = 1;
			}
			//페이지 확인용
			System.out.println(currentPage);
			
			maxPage = (int)((double)listCount/limit + 0.95);
			
			startPage = ((int)(((double)currentPage/limit + 0.95)-1) * limit) +1;
			
			endPage = startPage + limit -1;
			
			if(endPage > maxPage)
			{
				endPage = maxPage;
			}
			
			
			PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
			
			list = aService.productSearch(currentPage, limit, p);
			
			
			RequestDispatcher view = null;
			if(!list.isEmpty())
			{
				System.out.println(pi);
//				view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
//				request.setAttribute("list", list);
//				request.setAttribute("pi", pi);
//				request.setAttribute("p",p);
//				view.forward(request, response);
				for(Product pro : list)
				{
					System.out.println(pro);
				}
			}
			else
			{
				System.out.println("검색 결과가 없습니다.");
//				view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
//				request.setAttribute("msg", "검색결과가 없습니다.");
//				view.forward(request, response);
			}
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
