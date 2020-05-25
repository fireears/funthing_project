// 포인트 관리자 페이지_희지
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
import member.model.vo.MemberPoint;

/**
 * Servlet implementation class AdminPoint
 */
@WebServlet("/admin/point")
public class AdminPoint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPoint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		AdminService aService = new AdminService();
		
		// 검색창
		String searchKind = request.getParameter("searchKind");
		String searchText = request.getParameter("searchText");
		if(searchKind == null || searchKind.equals("null"))
			searchText = null;
		if(searchKind == null || searchKind.equals("null"))
			searchText = null;
		
		int listCount = aService.getPointListCount(searchKind, searchText);
		System.out.println("admin point servlet list count : " + listCount);
		
		
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
		
		
		limit = 20;
		maxPage = (int)((double)listCount/limit + 0.95);
		startPage = ((int)(((double)currentPage/limit + 0.95)-1)*limit)+ 1;
		endPage = startPage + limit -1;
		
		if(endPage > maxPage ) {
			endPage = maxPage;
		}
		
//		System.out.println("servlet에서 리스트 카운트  : " + listCount);
//		System.out.println("servlet에서 currentPage : " + currentPage);
//		System.out.println("startPage : " +startPage);
//		System.out.println("maxPage : " + maxPage);
		
		
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);

		
		ArrayList<MemberPoint> list = aService.selectPointList(currentPage, limit, searchKind, searchText);
		
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/admin/adminPoint.jsp");
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchText", searchText);
			request.setAttribute("list", list);
			request.setAttribute("pi",pi);			
		}else {
			view = request.getRequestDispatcher("/views/admin/adminPoint.jsp");
			request.setAttribute("searchKind", searchKind);
			request.setAttribute("searchText", searchText);
			request.setAttribute("list", list);
			request.setAttribute("pi",pi);
		}
		view.forward(request,response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
