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
import member.model.vo.Member;

/**
 * Servlet implementation class AdminMemberListServlet
 */
@WebServlet("/admin/memberList")
public class AdminMemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		AdminService mListService = new AdminService();
		
		String userName = request.getParameter("userName");	// 아이디 검색 값
		String userId = request.getParameter("userId");		// 이름 검색 값
		
		if(userName == null || userName.equals("null"))
			userName = null;
		if(userId == null || userId.equals("userId"))
			userId = null;
		
		int listCount = mListService.getMemberListCount(userName, userId); 
		System.out.println("memberListServlet listCount : " + listCount);
		// ---------- 페이징 처리 추가 ---------------
		// 페이지 수 처리용 변수 선언
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
		
		startPage = (((int)((double)currentPage/limit + 0.95))-1)*limit + 1;
		
		endPage = startPage + limit - 1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
		
		System.out.println("servlet userName : " + userName);
		System.out.println("servlet userId : " + userId);
		
		ArrayList<Member> list = mListService.selectList(currentPage, limit, userName, userId);
		/*
		 * for(int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */
		System.out.println("servlet list : " + list);
		
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/admin/adminMember.jsp");
			request.setAttribute("userName", userName);
			request.setAttribute("userId", userId);
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
		}else {
			view = request.getRequestDispatcher(request.getContextPath() +  "views/common/errorPage.jsp");
			request.setAttribute("msg", "게시판 리스트 조회 실패!");
			return;
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
