// 비밀번호 찾기
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
 * Servlet implementation class MemberSearchPwdServlet
 */
@WebServlet("/searchPwd.me")
public class MemberSearchPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchPwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		Member searchPwd = new MemberService().searchPwd(userId);
		
		RequestDispatcher view = null;
//		System.out.println("Servlet에서 화면에 뿌려주기전 : " + searchPwd);
		
		if(searchPwd != null) {
			view = request.getRequestDispatcher("views/member/searchPwd2.jsp");
			request.setAttribute("searchPwd",searchPwd);
		}else {
			request.setAttribute("msg", "비밀번호 찾기 실패");
			
			view = request.getRequestDispatcher("views/login/fail.jsp");
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
