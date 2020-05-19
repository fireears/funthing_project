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
import brand.model.vo.Brand;

/**
 * Servlet implementation class AdminBrandSearchServlet
 */
@WebServlet("/admin/brandSearch")
public class AdminBrandSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBrandSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ 
		AdminService aService = new AdminService();
		
		// 리스트 카운트 하기
		int brandListCount = aService.getBrandListCount();
	
		
		// 페이징 관련 변수 선언
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;
		
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}else {
			currentPage = 1;
		}
		
		
		limit = 20;
		
		maxPage = (int)((double)brandListCount/limit + 0.95);
		
		startPage = ((int)(((double)currentPage/limit + 0.95)-1)* limit) +1;
		
		endPage = startPage + limit -1;
		
		if(endPage > maxPage) 
		{
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, brandListCount, limit, maxPage, startPage, endPage);
		
		
		// 검색창 구현
		String searchKind = request.getParameter("searchKind");
		String searchVal = request.getParameter("searchVal");
		
		if(searchVal != null) {
			searchVal = request.getParameter("searchVal");
		}else {
			searchVal = (String)request.getAttribute("searchVal");
		}
		
		System.out.println("admin brand Servlet searchVal : " + searchVal);
		System.out.println("admin brand Servlet searchKind : " + searchKind);
		
		ArrayList<Brand> searchList =  aService.searchBrand(currentPage, limit,searchKind, searchVal);
		
		System.out.println("admin brand Servlet 브랜드 검색: " + searchList);
		
		
		// 화면에 뿌려주기
		RequestDispatcher view = null;
		if(!searchList.isEmpty()) {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("searchList", searchList);
			request.setAttribute("pi", pi);
			
		}else {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("searchList", searchList);
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
