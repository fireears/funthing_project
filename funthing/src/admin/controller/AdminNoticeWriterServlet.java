package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class AdminNoticeWriterServlet
 */
@WebServlet("/admin/noticeWriter")
public class AdminNoticeWriterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminNoticeWriterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   request.setCharacterEncoding("utf-8");
		      

		      Notice nt = new Notice(11,request.getParameter("name"),request.getParameter("content"),"SYSDATE","N");
		      NoticeService ns = new NoticeService();
		      int result=ns.insertList(nt);
		      System.out.println("RESULT"+request.getParameter("title"));
		      System.out.println("RESULT"+result);
		      RequestDispatcher rd=null;     
		      if(result<=0) {
		     request.setAttribute("msg","등록에 실패하셨습니다.");
		     rd = request.getRequestDispatcher("/views/admin/insertNotice.jsp");
		      }else {   
		         System.out.println("인설트 서블릿");
		         rd = request.getRequestDispatcher("/admin/NoticeView");
		         
		      }
		      rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
