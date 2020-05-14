package main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import brand.model.service.BrandService;
import brand.model.vo.Brand;
import product.model.service.ProductService;
import product.model.vo.Product;

/**
 * Servlet implementation class MainSearchServlet
 */
@WebServlet("/MainSearch")
public class MainSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("MainSearchServlet");
		ArrayList<Product> plist = new ArrayList<>();
		ArrayList<Product> blist = new ArrayList<>();
		
		String search = request.getParameter("search");
		
		ProductService pService = new ProductService();
		
		
		plist = pService.productSearch(search);
		blist = pService.brandSearch(search);
		
		RequestDispatcher view = null;
		if(!plist.isEmpty())
		{
			view = request.getRequestDispatcher("views/main/mainSearch.jsp");
			request.setAttribute("plist", plist);
			request.setAttribute("blist", blist);
			request.setAttribute("search", search);
			for(Product p : plist)
			{
				System.out.println(p);
			}
			
		}
		else if(!blist.isEmpty())
		{
			view = request.getRequestDispatcher("views/main/mainSearch.jsp");
			request.setAttribute("plist", plist);
			request.setAttribute("blist", blist);
			request.setAttribute("search", search);
			for(Product b : blist)
			{
				System.out.println(b);
			}
		}
		else
		{
			System.out.println("검색 결과 없습니다.");
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
