package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;

/**
 * Servlet implementation class MemberShoppingDelete
 */
@WebServlet("/MemberShoppingDelete")
public class MemberShoppingDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberShoppingDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String[] check =request.getParameterValues("check");
		MemberService ms = new MemberService();
		int result = ms.shoppingbagDelete(check);
		RequestDispatcher view = null;
		if(result<=0){
			request.setAttribute("msg","게시판 리스트 조회 실패!");
			view = request.getRequestDispatcher("adminMain.jsp");
		}else{	
			view = request.getRequestDispatcher(request.getContextPath()+"/MemberShoppingBagServlet");
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
