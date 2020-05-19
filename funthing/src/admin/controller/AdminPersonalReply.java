// 1:1문의 페이지 댓글_혜린
package admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import personalQnA.model.vo.PersonalQnaReply;

/**
 * Servlet implementation class AdminPersonalReply
 */
@WebServlet("/admin/personalRe")
public class AdminPersonalReply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPersonalReply() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		try
		{
			int num = Integer.valueOf(request.getParameter("rownum"));
			int perQnaNo = Integer.valueOf(request.getParameter("perQnaNo"));
			String mId = request.getParameter("tossmId");
			String reply = request.getParameter("replyContent");
			
			PersonalQnaReply re = new PersonalQnaReply(num, perQnaNo,mId,reply);
			int result = new AdminService().insertPersonalReply(re);
			
			if(result>0) {
				response.sendRedirect(request.getContextPath()+"/admin/personalQna");
			}else {
				response.sendRedirect(request.getContextPath()+"/admin/personalQna");
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
