package member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import member.model.service.MemberService;
import member.model.vo.MemberShoppingBag;

/**
 * Servlet implementation class MemberShoppingBagServlet
 */
@WebServlet("/MemberShoppingBagServlet")
public class MemberShoppingBagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberShoppingBagServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");
		MemberService ms = new MemberService();
		ArrayList<MemberShoppingBag> list = ms.shoppingbagselectList(userId);
		RequestDispatcher view = null;		
		if(list.isEmpty()){
			request.setAttribute("msg","게시판 리스트 조회 실패!");
			view = request.getRequestDispatcher("adminMain.jsp");
		}else{	
			request.setAttribute("list", list);
			view = request.getRequestDispatcher("/views/member/shoppingbag.jsp");
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
