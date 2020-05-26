// 아이디 찾기
package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MemberSearchId
 */
@WebServlet("/searchId.me")
public class MemberSearchIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
//		System.out.println(userName);
		
			
		
		Member member = new Member(userName, email, phone);
		
		System.out.println(member);
//		System.out.println("멤버" + member);
		
		Member searchIdMember = new MemberService().searchIdMember(member);
		
//		System.out.println("Servlet에서 화면에 뿌려주기 전 : " + searchIdMember);
		RequestDispatcher view = null;
		
		if(searchIdMember != null) {
			
			request.setAttribute("searchId", searchIdMember);
			
			view = request.getRequestDispatcher("views/member/memberLogin.jsp");
		}else{
			request.setAttribute("msg", "입력하신 정보가 없습니다.");
			
			view = request.getRequestDispatcher("views/member/searchId.jsp");

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
