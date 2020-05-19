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
 * Servlet implementation class AdminMainServlet
 */
@WebServlet("/admin/mainView")
public class AdminMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		AdminService aService = new AdminService();
		
		if(request.getParameter("s_no") == null)
		{
			
			System.out.println("-------------------------------");
//			System.out.println(request.getParameter("adminMainPage"));
			System.out.println("adminMainServlet");
			String pNo = (String)request.getAttribute("pNo");
			String msg = (String)request.getAttribute("msg");
			
			
			int listCount = aService.getListCount();
			
//			System.out.println("listCount : " + listCount);
			
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
			
			ArrayList<Product> list = new ArrayList<>();
			
			list = aService.selectProductList(currentPage, limit);
			System.out.println("listSize : " + list.size());
			
			if(!list.isEmpty())
			{
				RequestDispatcher view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
				request.setAttribute("pi", pi);
				request.setAttribute("list", list);
				view.forward(request, response);
			}
//			else if(!list.isEmpty() && pNo != null)
//			{
//				RequestDispatcher view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
//				request.setAttribute("pi", pi);
//				request.setAttribute("list", list);
//				request.setAttribute("pNo", pNo);
//				request.setAttribute("msg", msg);
//				view.forward(request, response);
//			}
			else
			{
				RequestDispatcher view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
				request.setAttribute("msg", "list가 비어있습니다");
				view.forward(request, response);
			}
			
		}
		
		
		//상품검색
		else if(request.getParameter("s_no") != null)
		{
			System.out.println("-----------------------------------");
			System.out.println("product search");
			ArrayList<Product> list = new ArrayList<>();
			try
			{
				String pNo = request.getParameter("p_no");
				String bNo = request.getParameter("b_no");
				int sNo = Integer.valueOf(request.getParameter("s_no"));
				String pName = request.getParameter("p_name");
				int pCategory = Integer.valueOf(request.getParameter("pCategory"));
				int pPrice = Integer.valueOf(request.getParameter("p_price"));
				Date fStartDate = Date.valueOf(request.getParameter("f_start_date"));
				Date fEndDate = Date.valueOf(request.getParameter("f_end_date"));
				String fYn = request.getParameter("f_yn");
				
				Product product = new Product(pNo, bNo, pName, pPrice, pCategory, sNo, fStartDate, fEndDate, fYn);
				int listCount = aService.getListCount(product);

				System.out.println("sNo : " + sNo);
				System.out.println(product);
				System.out.println("listCount : " + listCount);
				
				
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
				System.out.println("currentPage" + currentPage);
				
				maxPage = (int)((double)listCount/limit + 0.95);
				
				startPage = ((int)(((double)currentPage/limit + 0.95)-1) * limit) +1;
				
				endPage = startPage + limit -1;
				
				if(endPage > maxPage)
				{
					endPage = maxPage;
				}
				
				
				PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
				
				list = aService.productSearch(currentPage, limit, product);
				System.out.println("listSize : " + list.size());
				
				
				RequestDispatcher view = null;
				if(!list.isEmpty())
				{
					//DB출력 확인용
//				for(Product p : list)
//				{
//					System.out.println(p);
//				}
					view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
					request.setAttribute("pi", pi);
					request.setAttribute("list", list);
					request.setAttribute("product", product);
					view.forward(request, response);
				}
				
				else if(list.isEmpty())
				{
					System.out.println("adminMain.jsp 이덩");
					view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
					System.out.println("list가 비어있음");
					request.setAttribute("pi", pi);
					request.setAttribute("list", list);
					request.setAttribute("product", product);
					request.setAttribute("msg", "검색결과가 없습니다.");
					view.forward(request, response);
				}
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
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
