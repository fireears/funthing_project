// 회원 리스트-회원 정보 
package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import member.model.vo.Member;

/**
 * Servlet implementation class AdminMemberSelectServlet
 */
@WebServlet("/admin/modify")
public class AdminMemberSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminMemberSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		Member member = new AdminService().selectMember(userId);
		
		
		
		RequestDispatcher view = null;
		
		if(member != null) {
			String birth = member.getbDay();
			String year = birth.substring(0,4);
			String mon = birth.substring(5,7);
			String day = birth.substring(8,10);
			System.out.println(year);
			System.out.println(mon);
			System.out.println(day);
			view = request.getRequestDispatcher("/views/admin/modifyMember.jsp");
			request.setAttribute("member", member);
			request.setAttribute("year", year);
			request.setAttribute("mon", mon);
			request.setAttribute("day", day);
		}else {
			view = request.getRequestDispatcher("/views/admin/adminMember.jsp");
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
