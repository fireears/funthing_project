package admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.View;

import admin.model.service.AdminService;
import product.model.vo.Product;

/**
 * Servlet implementation class AdminProductUpdateServlet
 */
@WebServlet("/admin/productUpdate")
public class AdminProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("adminProductUpdateServlet");
		try {
			String pNo = request.getParameter("pNo");
			String p_color = request.getParameter("color");
			String p_size = request.getParameter("size");
			int retail_price = Integer.valueOf(request.getParameter("retail_price"));
			int dcRate = Integer.valueOf(request.getParameter("dcRate"));
			int pPrice = (int)(double)(retail_price - ((double)retail_price * ((double)dcRate * 0.01)));
			String pDetail = request.getParameter("pDetail");
			int pPoint = Integer.valueOf(request.getParameter("pPoint"));
			Date shipDate = Date.valueOf(request.getParameter("shipDate"));
			Date fStartDate = Date.valueOf(request.getParameter("fStartDate"));
			Date fEndDate = Date.valueOf(request.getParameter("fEndDate"));
			int fGoal = Integer.valueOf(request.getParameter("fGoal"));
			int fSelPrice = Integer.valueOf(request.getParameter("fSelPrice"));
			String fYn = request.getParameter("fYn");
			String calNo = request.getParameter("calNo");
			
//			색상이랑 사이즈 변경시 상품번호 자동수정알고리즘
			String beforePno = pNo.substring(0,8);
			System.out.println(beforePno);
			String afterPno = beforePno + p_color + p_size;
			System.out.println("after : " + afterPno);
			Product p = new Product(p_color, p_size, retail_price, dcRate, pPrice, pDetail, pPoint, shipDate, fStartDate, fEndDate, fGoal, fSelPrice, fYn, calNo);
			
			int result = new AdminService().productUpdate(p, pNo, afterPno);
			
			if(result > 0)
			{
				RequestDispatcher view = request.getRequestDispatcher("/admin/mainView");
				request.setAttribute("msg", pNo + "상품의 수정이 완료되었습니다.");
				view.forward(request, response);
				
			}
			else
			{
//				RequestDispatcher view = request.getRequestDispatcher(request.getContextPath() + "/admin/mainView");
//				request.setAttribute("msg", pNo + "상품의 수정이 실패했습니다.");
//				view.forward(request, response);
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
