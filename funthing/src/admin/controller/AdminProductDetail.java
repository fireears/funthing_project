package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import product.model.vo.Product;

/**
 * Servlet implementation class AdminProductDetail
 */
@WebServlet("/admin/productDetail")
public class AdminProductDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNo = request.getParameter("pNo");
		System.out.println(pNo);
		
		Product product = null;
		
		product = new AdminService().selectOneProductDetail(pNo);
		
		RequestDispatcher view = null;
		String page = "";
		if(product != null)
		{
			page = "/views/admin/adminProductDetail.jsp";
			request.setAttribute("product", product);
			System.out.println(product);
		}
		else
		{
			String msg = pNo + "상품 검색 결과 상품이 없습니다.";
			request.setAttribute("msg", msg);
			System.out.println("검색 결과 없습니다.");
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
