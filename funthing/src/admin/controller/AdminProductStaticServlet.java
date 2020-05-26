package admin.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import admin.model.vo.ProductStatic;

/**
 * Servlet implementation class ProductStaticServlet
 */
@WebServlet("/admin/productStatic")
public class AdminProductStaticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductStaticServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/admin/productStatic");
		request.setCharacterEncoding("UTF-8");
		AdminService aService = new AdminService();
		
		try
		{
			String searchDate = request.getParameter("searchDate");
			String firstDate = request.getParameter("firstDate");
			String secondDate = request.getParameter("secondDate");
			String gender = request.getParameter("gender");
			String pCategory = request.getParameter("category");
			System.out.println(pCategory);
			System.out.println(gender);
			System.out.println(firstDate);
			ProductStatic pStatic = new ProductStatic(pCategory, searchDate, firstDate, secondDate, gender);
			
			ArrayList<ProductStatic> list = new ArrayList<>();
			list = aService.searchProduct(pStatic);
			
			RequestDispatcher view = null;
			if(!list.isEmpty())
			{
				for(ProductStatic p : list)
				{
					System.out.println(p);
				}
				view = request.getRequestDispatcher("/views/admin/productStatic.jsp");
				request.setAttribute("list", list);
				view.forward(request, response);
				
			}
			else
			{
				System.out.println("조회x");
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
