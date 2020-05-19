// 회원 리스트-회원 정보 update
package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.model.service.AdminService;
import member.model.vo.Member;

/**
 * Servlet implementation class AdminMemberUpdateServlet
 */
@WebServlet("/admin/modifyUpdate")
public class AdminMemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("userId");
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
		
		int result = new AdminService().updateMember(m);
		System.out.println("회원 정보 수정 Servlet에서 update 결과 : " + result);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			// 현재 로그인한 사람의 session도 수정
			/*
			 * HttpSession session = request.getSession();
			 * session.setAttribute("modifyUpdate", m);
			 */
			
			view = request.getRequestDispatcher("/memberList.me");
			request.setAttribute("msg", "회원정보 수정 완료");
		}else {
			view = request.getRequestDispatcher("views/login/fail.jsp");
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
