// 적립금 내역 페이지_희지
package member.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import member.model.service.MemberPointService;
import member.model.vo.MemberPoint;

/**
 * Servlet implementation class MemberPoint
 */
@WebServlet("/memberPointServlet")
public class MemberPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /*
     * @see HttpServlet#HttpServlet()
     */
	
    public MemberPointServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 로그인 한 유저 정보 받기
		String userNo = request.getParameter("userNo");
		
		MemberPointService mpService = new MemberPointService();

		
		// 회원이름, 등급, 적립금 가져오기
		MemberPoint mp2 = new MemberPoint();
		mp2 = mpService.memberInfo(userNo);
		
		System.out.println("적립금 페이지에서 유저 정보 : " + userNo);
		
		// 날짜 선택값 받기
		String searchDate = "";
		if( request.getParameter("searchDate") !=null) {
			searchDate = request.getParameter("searchDate");
		}else {
			searchDate = null;
		}
		
		String firstDate = "";
		if(request.getParameter("firstDate") != null) {
			firstDate = request.getParameter("firstDate");
		}else {
			firstDate = "2009/01/01";
		}
				
		String secondDate = "";
		if(request.getParameter("secondDate") != null) {
			secondDate = request.getParameter("secondDate");
		}else {
			secondDate = "2009/01/01";
		}
		
		
		// 초기값이 아닌 소비자가 검색 값을 입력했을때
		if(request.getParameter("searchDate") == null && request.getParameter("firstDate") == "2009/01/01" &&  request.getParameter("secondDate")=="2009/01/01") {
			searchDate = request.getParameter("searchDate1");
			firstDate = request.getParameter("firstDate1");
			secondDate = request.getParameter("secondDate1");
				
		}
		
		
//		System.out.println("맴버 적립금 서블릿에서 searchDate : " + searchDate);		// null
//		System.out.println("맴버 적립금 서블릿에서 firstDate : " + firstDate);		// null
//		System.out.println("맴버 적립금 서블릿에서 secondDate : " + secondDate);		// null
		
		
		
		// 로그인 유저에 대한  적립금 리스트 카운트 하기
		int pListCount = mpService.getPListCount(userNo);
		
		System.out.println("memberPoint 서블릿에서 적립금 리스트 갯수 : " + pListCount);
		
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
		
		limit = 10;
		
		maxPage = (int)((double)pListCount / limit + 0.9);
		startPage = ((int)(((double)currentPage / limit + 0.9) -1) *limit) +1;
		endPage = startPage + limit -1;
		
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		// 페이징 처리 관련 객체 만들기
		PageInfo pi = new PageInfo(currentPage, pListCount, limit, maxPage, startPage, endPage);
		
		System.out.println("pi" + pi);
		
		// 페이징 처리 + 날짜 검색 처리
		ArrayList<MemberPoint> list = mpService.selectMemberPoint(searchDate, firstDate, secondDate, currentPage, limit, userNo);
		
		System.out.println("적립금 servlet에서 리스트 : " +  list);
		
		
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/member/myPagePoint.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi",pi);
			request.setAttribute("userNo", userNo);
			request.setAttribute("mp2", mp2);
			request.setAttribute("searchDate", searchDate);
			request.setAttribute("firstDate", firstDate);
			request.setAttribute("secondDate", secondDate);
			
		}else {
			view = request.getRequestDispatcher("/views/member/myPagePoint.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi",pi);
			request.setAttribute("userNo", userNo);
			request.setAttribute("mp2", mp2);
			request.setAttribute("searchDate", searchDate);
			request.setAttribute("firstDate", firstDate);
			request.setAttribute("secondDate", secondDate);
			
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
