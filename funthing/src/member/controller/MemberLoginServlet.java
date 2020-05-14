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
 * Servlet implementation class MemberJoinServlet
 */
@WebServlet("/login.me")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		Member member = new Member(userId, userPwd);
//		System.out.println(member);
		
		Member loginMember = new MemberService().loginMember(member);
		System.out.println("Servlet에서 화면에 뿌려주기 전 : " + loginMember);
		
		if(loginMember != null) {	// 로그인이 성공했을 경우
			
			HttpSession session = request.getSession();
			
			session.setMaxInactiveInterval(1800);	//session객체의 time out 설정 30분
			
			session.setAttribute("loginUser", loginMember);
			
			response.sendRedirect(request.getContextPath() + "/main/mainView");
			
		}else {						// 로그인 실패일 경우
			
			request.setAttribute("msg", "로그인 실패");
			
			RequestDispatcher view = request.getRequestDispatcher("/main/mainView");
			view.forward(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
