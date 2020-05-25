// 비밀번호 변경
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
 * Servlet implementation class MessagePwdModifyServlet
 */
//@WebServlet("/update.pwd") 암호화 처리 전
@WebServlet(name="MessagePwdModifyServlet", urlPatterns="/update.pwd") // 암호화 처리 후
public class MessagePwdModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessagePwdModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		System.out.println("servlet으로 넘어온 mNo : " + userId);
		System.out.println("servelt으로 넘어온 userPwd : " + userPwd);
		
		Member m = new Member(userId, userPwd);
		
		int result = new MemberService().UpdatePwd(m);
		System.out.println("회원 정보 수정 Servlet에서 update 결과 : " + result);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			// 현재 로그인한 사람의 session도 수정
			HttpSession session = request.getSession();
			session.setAttribute("member", m);
			
			view = request.getRequestDispatcher("views/member/searchPwd5.jsp");
			request.setAttribute("msg", "비밀번호 변경이 되었습니다.");
		}else {
			view = request.getRequestDispatcher("views/member/searchPwd1.jsp");
			request.setAttribute("msg2", "비밀번호 변경 실패");
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
