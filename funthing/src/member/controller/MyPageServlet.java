// myPage 회원정보 창
package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/myPage.me")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		Member member = new MemberService().selectMember(userId);
		
	
		
		
		RequestDispatcher view = null;
		
		if(member != null) {
			String birth = member.getbDay();
			String year = birth.substring(0,4);
			String mon = birth.substring(5,7);
			String day = birth.substring(8,10);
			System.out.println(year);
			System.out.println(mon);
			System.out.println(day);
			view = request.getRequestDispatcher("views/member/memberModify.jsp");
			request.setAttribute("member", member);
			request.setAttribute("year", year);
			request.setAttribute("mon", mon);
			request.setAttribute("day", day);
		}else {
			view = request.getRequestDispatcher("views/member/memberModify.jsp");
			request.setAttribute("msg", "회원조회에 실패");
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
