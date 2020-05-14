// 브랜드 관리자 페이지 Servlet_희지
package admin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;

/**
 * Servlet implementation class AdminBrandServlet
 */
@WebServlet("/admin/brandServlet")
public class AdminBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("브랜드 관리자 Servlet");
		
		AdminService aService = new AdminService();
		
		// 리스트 카운트 하기
		int brandListCount = aService.getBrandListCount();
		
//		System.out.println("Servlet에서 브랜드 리스트 : " + brandListCount);
		
		
		// 페이징 관련 변수 선언
		int currentPage;
		int limit;
		int maxPage;
		int startPage;
		int endPage;
		
		
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage"));
		}else {
			currentPage = 1;
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
