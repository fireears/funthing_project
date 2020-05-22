// 일대일 문의 리스트_희지
package personalQnA.controller;

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
import personalQnA.model.service.PersonalQnAService;
import personalQnA.model.vo.PersonalQnA;

/**
 * Servlet implementation class PersonalQnAServlet
 */
@WebServlet(name = "PersonalQnA", urlPatterns = "/PersonalQnA")
public class PersonalQnAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalQnAServlet() {
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
		
		System.out.println("서블릿에 로그인 값이 잘 넘어왔는가" + userNo);
		
		// 날짜 선택값 받기
		String searchDate = request.getParameter("searchDate");
		String firstDate = request.getParameter("firstDate");
		String secondDate = request.getParameter("secondDate");
		
		
//		// 이거 뭔지 모르겠어여 -희지
//		int maxSize = 1024*1024*10;	// 이미지 사이즈 제한함 10Mbytes
		
		
		PersonalQnAService pqService = new PersonalQnAService();
		
		
		// 로그인 유저에 대한 일대일 문의 리스트 카운트하기
		int perListCount = pqService.getPerListCount(userNo);
		
		System.out.println("Servlet에서 로그인 유저에 대한 일대일 문의 리스트  갯수 :" + perListCount);
		
		
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
		
		maxPage = (int)((double)perListCount / limit + 0.9);
		startPage = ((int)(((double)currentPage / limit + 0.9) -1) *limit) +1;
		endPage = startPage + limit -1;
		
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		// 페이징 처리 관련 객체 만들기
		PageInfo pi = new PageInfo(currentPage, perListCount, limit, maxPage, startPage, endPage);
		
		System.out.println("pi" + pi);
		
		// 페이징 처리 + 날짜 검색 처리
		ArrayList<PersonalQnA> list = pqService.selectPersonalQnA(searchDate, firstDate, secondDate, currentPage, limit, userNo);
		
		System.out.println("Servlet에서 일대일 문의 리스트" + list);
		
		
		
		// 서비스 다녀와서 리스트 화면 처리
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("/views/personalQnA/myPagePerQnAList.jsp");
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
			request.setAttribute("userNo", userNo);
			
		}else {
			view = request.getRequestDispatcher("/views/personalQnA/myPagePerQnAList.jsp");
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
