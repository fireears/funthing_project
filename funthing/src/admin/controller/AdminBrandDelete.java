package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;

/**
 * Servlet implementation class AdminBrandDelete
 */
@WebServlet("/admin/brandDelete")
public class AdminBrandDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBrandDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String bNo = request.getParameter("bNo");
		
		int result = new AdminService().brandDelete(bNo);
		
		System.out.println("브랜드 delete Servlet : " + result);
		
		RequestDispatcher view = null;
		
		if(result>0) {
			view = request.getRequestDispatcher("/admin/brandServlet");
			String deleteMsg = "브랜드 삭제에 성공했습니다.";
			request.setAttribute("deleteMsg", deleteMsg);
		
		}else {
			view = request.getRequestDispatcher("/views/admin/adminBrandUpdate.jsp");
			String dErrorMsg = bNo + "삭제가 되지 않습니다.";
			request.setAttribute("dErrorMsg", dErrorMsg);
			
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
