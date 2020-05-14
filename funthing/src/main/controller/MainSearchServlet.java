package main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		
		if(!plist.isEmpty())
		{
			for(Product p : plist)
			{
				System.out.println(p);
			}
			
		}
		else if(!blist.isEmpty())
		{
			for(Product b : blist)
			{
				System.out.println(b);
			}
		}
		else
		{
			System.out.println("검색 결과 없습니다.");
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
