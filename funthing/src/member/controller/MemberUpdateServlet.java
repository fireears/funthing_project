// myPage 정보 수정 update
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
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/update.me") 
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String mNo = request.getParameter("mNo");
		String userId = request.getParameter("userId");
		// 비번 X
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String birth = request.getParameter("year") + request.getParameter("mon") + request.getParameter("day");
		System.out.println("mNo : " + mNo);
		// 추천인 X
		System.out.println(birth);
		
		Member m = new Member(userId, userName, email, phone, birth, mNo);
		
		int result = new MemberService().updateMember(m);
		System.out.println("회원 정보 수정 Servlet에서 update 결과 : " + result);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			// 현재 로그인한 사람의 session도 수정
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", m);
			
			view = request.getRequestDispatcher("/myPageMainServlet");
			request.setAttribute("userNoM", mNo);
			request.setAttribute("msg", "회원정보 수정 완료");
			
		}else {
			view = request.getRequestDispatcher("views/member/myPageMain.jsp");
			request.setAttribute("userNoM", mNo);
			request.setAttribute("msg", "회원 정보 수정 실패");
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
