// 1:1문의 페이지_혜린
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
import personalQnA.model.vo.PersonalQnA;

/**
 * Servlet implementation class AdminPersonalQna
 */
@WebServlet("/admin/personalQna")
public class AdminPersonalQna extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPersonalQna() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		AdminService aService = new AdminService();
		
		int listCount = aService.getListPerQnaCount();
		System.out.println("1:1문의servlet listCount : " + listCount);
		
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
		
		limit = 3;
		maxPage = (int)((double)listCount/limit + 0.9);
		startPage = ((int)((double)currentPage/limit + 0.9)-1)*limit + 1;
		endPage = startPage + limit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);

		// 검색창 구현 시작
		String searchKind = request.getParameter("searchKind");	// 검색 종류 값
		String searchText = request.getParameter("searchText"); // 검색 입력창 값
		if(searchText != null) {
			searchText = request.getParameter("searchText");
		}else {
			searchText = (String) request.getAttribute("searchText");
		}
		System.out.println("servlet searchKind : " + searchKind);
		System.out.println("servlet searchText : " + searchText);
		
		
		ArrayList<PersonalQnA> list = aService.selectTenPersonQnaList(currentPage, limit,searchKind, searchText);
		System.out.println("servlet list : " + list);
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/admin/adminPersonalQna.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
		}else {
			view = request.getRequestDispatcher("/views/admin/adminPersonalQna.jsp");
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
