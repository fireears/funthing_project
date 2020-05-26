package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import member.model.service.MemberService;

/**
 * Servlet implementation class MemberShoppingBagInsertServlet
 */
@WebServlet("/SBInsertServlet")
public class MemberShoppingBagInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberShoppingBagInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String pno = request.getParameter("p_no");
		String color = request.getParameter("color");
		String size = request.getParameter("size");
		String p_no = pno+color+size; // 넘버 사이즈 색상을 하나로 합쳐서 원래 걸 만듬
		int number = Integer.valueOf(request.getParameter("number")); //수량	
		String userNo = request.getParameter("userNo");
		MemberService ms = new MemberService();
		System.out.println(pno+","+color+","+size+","+p_no+","+number+","+userNo);
		int result = ms.shoppingbagInsert(p_no,number,userNo);
		System.out.println("result"+result);
		RequestDispatcher view = null;		
		if(result<=0){
			request.setAttribute("msg","게시판 리스트 조회 실패!");
			view = request.getRequestDispatcher("adminMain.jsp");
		}else{	
			request.setAttribute("userNo",userNo);
			view = request.getRequestDispatcher("/MemberShoppingBagServlet");
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
