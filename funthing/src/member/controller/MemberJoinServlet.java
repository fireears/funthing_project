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
 * Servlet implementation class MemberJoinServlet
 */
//@WebServlet("/join.me")	// 암호화 처리 전
@WebServlet(name="MemberJoinServlet",urlPatterns="/join.me") // 암호화 처리 후 
public class MemberJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String birth = request.getParameter("year") + request.getParameter("mon") + request.getParameter("day");
		String reference = request.getParameter("reference");
		String alarm_YN = request.getParameter("alarm_YN");
		if(alarm_YN == null) {
			alarm_YN = "N";
		}
		
		System.out.println("servlet alarm_YN : " + alarm_YN);
		Member member = new Member(userId, userPwd, userName, email, phone, birth, reference, alarm_YN);
		
		System.out.println(member);
		int result = new MemberService().insertMember(member);
		
		RequestDispatcher view = null;
		if(result > 0) {
			view = request.getRequestDispatcher("views/member/joinSuccess.jsp");
			request.setAttribute("member", member);
		}else {
			view = request.getRequestDispatcher("views/member/memberJoin.jsp");
			request.setAttribute("msg", "회원가입 실패");
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
