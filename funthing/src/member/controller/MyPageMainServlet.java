// 마이페이지 메인 페이지_희지
package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.MemberPoint;

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
		
		String userNo = request.getParameter("userNo");
		
		System.out.println("마이페이지 메인 서블릿에서 유저 넘버 : " + userNo);
		
		MemberService mService = new MemberService();
		
		
		// 리스트 카운드
//		int listCount = mService.currentListCount(userNo);
		
		
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
		
		
		
		// 회원이름, 등급, 적립금 가져오기
		MemberPoint mp = new MemberPoint();
		
		mp = mService.memberInfo(userNo);
		
		System.out.println("마이 페이지 메인에서 회원 정보 객체 mp : " + mp);
		
		RequestDispatcher view = null;
		if(mp != null) {
			view = request.getRequestDispatcher("/views/member/myPageMain.jsp");
			request.setAttribute("mp",mp);
			request.setAttribute("userNo", userNo);
		}else {
			view = request.getRequestDispatcher("/views/member/myPageMain.jsp");
			request.setAttribute("mp",mp);
			request.setAttribute("userNo", userNo);
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
