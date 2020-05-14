package admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductSearchServlet
 */
@WebServlet("/admin/productSearch")
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("adminProductSearch");
		
		String pNo = request.getParameter("p_no");
		String sNo = request.getParameter("s_no");
		String pName = request.getParameter("p_name");
		int pCategory = Integer.valueOf(request.getParameter("p_category"));
		int pPrice = Integer.valueOf(request.getParameter("p_price"));
		Date fStartDate = Date.valueOf(request.getParameter("f_start_date"));
		Date fEndDate = Date.valueOf(request.getParameter("f_end_date"));
		String fYn = request.getParameter("f_yn");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
