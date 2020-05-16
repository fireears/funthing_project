// 브랜드 update페이지_희지
package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import brand.model.vo.Brand;

/**
 * Servlet implementation class AdminBrandUpdateServlet
 */
@WebServlet("/admin/brandDetail")
public class AdminBrandDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBrandDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bNo = request.getParameter("bNo");
		System.out.println(bNo);
		
		Brand brand = null;
		
		brand = new AdminService().selectOneBrand(bNo);
		
		RequestDispatcher view = null;
		
		String page="";
		if(brand != null) {
			page = "/views/admin/adminBrandUpdate.jsp";
			request.setAttribute("brand", brand);
			
		}else {
			System.out.println("브랜드 datail Servlet에서 에러!");
		}
		 view = request.getRequestDispatcher(page);
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
