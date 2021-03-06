// 브랜드 관리자 페이지 Servlet_희지
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
 * Servlet implementation class AdminBrandServlet
 */
@WebServlet("/admin/brandServlet")
public class AdminBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminBrandServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("브랜드 관리자 Servlet");

		request.setCharacterEncoding("UTF-8");
		AdminService aService = new AdminService();

		String bNo = (String) request.getAttribute("bNo");
		String updateMsg = (String) request.getAttribute("updateMsg");
		String deleteMsg = (String) request.getAttribute("deleteMsg");
		String insertMsg = (String) request.getAttribute("insertMsg");

		// 리스트 카운트 하기
		int brandListCount = aService.getBrandListCount();

		System.out.println("Servlet에서 브랜드 리스트 : " + brandListCount);

		// 페이징 관련 변수 선언
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;
		
		currentPage = 0;
		if (request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		} else {
			currentPage = 1;
		}
		System.out.println("currentPage : " +  currentPage);

		limit = 20;

		maxPage = (int) ((double) brandListCount / limit + 0.95);

		startPage = ((int) (((double) currentPage / limit + 0.95) - 1) * limit) + 1;

		endPage = startPage + limit - 1;

		if (endPage > maxPage) {
			endPage = maxPage;
		}

		PageInfo pi = new PageInfo(currentPage, brandListCount, limit, maxPage, startPage, endPage);

//		// 게시판 조회해서 뽑아오기
//		ArrayList<Brand> list = aService.selectBrandList(currentPage, limit);

		// 확인용 출력
//		for(int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}

		  // 검색창 구현 
		 String searchVal = request.getParameter("searchVal");
		 String searchKind = request.getParameter("searchKind");
		 
		 if(searchVal == null || searchVal.equals("null"))
			 searchVal = null;
		 
		 if(searchKind == null || searchKind.equals("null"))
			 searchKind = null;
		 
		  System.out.println("admin brand Servlet searchVal : " + searchVal);
		  System.out.println("admin brand Servlet searchKind : " + searchKind);
		  
		  ArrayList<Brand> list = aService.searchBrand(currentPage, limit, searchKind, searchVal);
		  
		  
		  System.out.println("admin brand Servlet 브랜드 검색: " + list);

		  
		  
		// jsp 화면단으로 넘기기
		RequestDispatcher view = null;
		if (!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchVal", searchVal);

			
			// update 성공시
		} else if (!list.isEmpty() && bNo != null) {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("bNo", bNo);
			request.setAttribute("updateMsg", updateMsg);
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchVal", searchVal);
			
			
			
			// delete 성공시
		} else if (!list.isEmpty() && deleteMsg != null) {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("deleteMsg", deleteMsg);
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchVal", searchVal);
			
			// insert 성공시
		} else if (!list.isEmpty() && insertMsg != null) {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("insertMsg", insertMsg);
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchVal", searchVal);
			
		} else {
			view = request.getRequestDispatcher("/views/admin/adminBrand.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchVal", searchVal);
		}

		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
