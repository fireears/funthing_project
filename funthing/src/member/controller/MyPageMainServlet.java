// 마이페이지 메인 페이지_희지
package member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import member.model.service.MemberService;
import member.model.vo.MemberPoint;
import payment.model.vo.OrderUpdate;

/**
 * Servlet implementation class MyPageMainServlet
 */
@WebServlet("/myPageMainServlet")
public class MyPageMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageMainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userNoM = request.getParameter("userNoM");
		if(userNoM == null) {
			userNoM = (String)request.getAttribute("userNoM");
		}
		System.out.println("마이페이지 메인 서블릿에서 유저 넘버 : " + userNoM);
		
		MemberService mService = new MemberService();
		
		// 회원이름, 등급, 적립금 가져오기
		MemberPoint mp = new MemberPoint();
		
		mp = mService.memberInfo(userNoM);
		
		
		
		System.out.println("마이 페이지 메인에서 회원 정보 객체 mp : " + mp);
		
		
		// 페이징 관련 변수 선언
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;
		
		currentPage = 0;
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
			
		}else {
			currentPage = 1;
		}
		System.out.println("히지 currentPage : " +  currentPage);
		// 최근 주문 목록 리스트 카운드
		int currentListCount = mService.currentListCount(userNoM);
//		System.out.println("히지 listCount : " + currentListCount);
		limit = 10;
		maxPage = (int) ((double) currentListCount / limit + 0.9);
		startPage = ((int) (((double) currentPage / limit + 0.9) - 1) * limit) + 1;
		endPage = startPage + limit - 1;
		
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		// 페이징 처리 객체 만들기
		PageInfo pi = new PageInfo(currentPage, currentListCount, limit, maxPage, startPage, endPage);
		
		
		
		
		// 최근 주문 목록 select
		ArrayList<OrderUpdate> coList = mService.selectCurrentOrderList(currentPage, limit, userNoM);
		
		System.out.println("myPageMain Serlvet에서 coList : " + coList);
		
		
		
		RequestDispatcher view = null;
		if(mp != null && !coList.isEmpty()) {
			view = request.getRequestDispatcher("/views/member/myPageMain.jsp");
			request.setAttribute("mp",mp);
			request.setAttribute("coList",coList);
			request.setAttribute("userNoM", userNoM);
			request.setAttribute("pi", pi);
		
		}else {
			view = request.getRequestDispatcher("/views/member/myPageMain.jsp");
			request.setAttribute("mp",mp);
			request.setAttribute("coList",coList);
			request.setAttribute("userNoM", userNoM);
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
