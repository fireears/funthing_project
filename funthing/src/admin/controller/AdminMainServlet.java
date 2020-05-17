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

		System.out.println("adminMainServlet");
		String pNo = (String)request.getAttribute("pNo");
		String msg = (String)request.getAttribute("msg");
		
		AdminService aService = new AdminService();
		
		int listCount = aService.getListCount();
		
//		System.out.println("listCount : " + listCount);
		
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
		
		
		if(!list.isEmpty())
		{
			//DB출력 확인용
//			for(Product p : list)
//			{
//				System.out.println(p);
//			}
			RequestDispatcher view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
			request.setAttribute("pi", pi);
			request.setAttribute("list", list);
			view.forward(request, response);
		}
		else if(!list.isEmpty() && pNo != null)
		{
			RequestDispatcher view = request.getRequestDispatcher("/views/admin/adminMain.jsp");
			request.setAttribute("pi", pi);
			request.setAttribute("list", list);
			request.setAttribute("pNo", pNo);
			request.setAttribute("msg", msg);
			view.forward(request, response);
		}
		else
		{
//			RequestDispatcher view = request.getRequestDispatcher(path);
			System.out.println("list가 비어있음");
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
