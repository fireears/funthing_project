package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import productQnA.model.vo.AdminProductQnA;

/**
 * Servlet implementation class AdminProductQnAReServlet
 */
@WebServlet("/admin/productQnaRe")
public class AdminProductQnAReServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductQnAReServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
		
		try {
	//		int num = Integer.valueOf(request.getParameter("rownum"));
			int proQnaNo = Integer.valueOf(request.getParameter("proQnaNo"));
			String mId = request.getParameter("tossmId");
			String reply = request.getParameter("replyContent");
			System.out.println("proQnaNo : " + proQnaNo);
			System.out.println("mId : " + mId);
			System.out.println("reply : " + reply);
			AdminProductQnA re = new AdminProductQnA(proQnaNo,mId,reply);
			int result = new AdminService().insertProductReply(re);
			
			if(result>0) {
				response.sendRedirect(request.getContextPath()+"/admin/productQnA");
			}else {
				response.sendRedirect(request.getContextPath()+"/admin/productQnA");
				System.out.println("댓글실패");

			}
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
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
