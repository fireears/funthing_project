package admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import admin.model.service.AdminService;
import product.model.vo.Product;

/**
 * Servlet implementation class AdminProductInsertServlet
 */
@WebServlet("/admin/productInsert")
public class AdminProductInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProductInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/admin/productInsert");
		
		AdminService aService = new AdminService();
		request.setCharacterEncoding("utf-8");
		try
		{
			int maxSize = 1024*1024*10;
			
			String root = request.getSession().getServletContext().getRealPath("/");
			String thumbnailSavePath = root + "/images/thumbnail";
			System.out.println(thumbnailSavePath);

			MultipartRequest Multipart = new MultipartRequest(request, thumbnailSavePath, maxSize, "utf-8", new DefaultFileRenamePolicy());
			
			String thumbnail = Multipart.getFilesystemName("thumbnail");
			String imgRouter = Multipart.getFilesystemName("imgRouter");
			String bNo = Multipart.getParameter("bNo");
			String gender = Multipart.getParameter("gender");
			String pName = Multipart.getParameter("pName");
			String pCategory = Multipart.getParameter("pCategory");
			String color = Multipart.getParameter("color");
			String pSize = Multipart.getParameter("pSize");
			int retailPrice = Integer.valueOf(Multipart.getParameter("retailPrice"));
			int dcRate = Integer.valueOf(Multipart.getParameter("dcRate"));
			int pPoint = Integer.valueOf(Multipart.getParameter("pPoint"));
			String pDetail = Multipart.getParameter("pDetail");
			Date shipDate = Date.valueOf(Multipart.getParameter("shipDate"));
			Date fStartDate = Date.valueOf(Multipart.getParameter("fStartDate"));
			Date fEndDate = Date.valueOf(Multipart.getParameter("fEndDate"));
			int fGoal = Integer.valueOf(Multipart.getParameter("fGoal"));
			String fYn = Multipart.getParameter("fYn");
			
			//스타일 넘버 시퀀스 가져오기
			String s_no = aService.selectSno();
			String pNo = gender + bNo + pCategory + s_no + color + pSize;
			int pPrice = (int)(double)(retailPrice - ((double)retailPrice * ((double)dcRate * 0.01)));
			
			Product p = new Product(pNo, bNo, thumbnail, pName, color, pSize, retailPrice, dcRate, pPrice, Integer.valueOf(pCategory), Integer.valueOf(s_no), pDetail, imgRouter, pPoint, shipDate, fStartDate, fEndDate, fGoal, fYn);
		
			
			System.out.println(p);
			
			int result = aService.productInsert(p);
			System.out.println("productInsert servlet result : " + result);
			
			RequestDispatcher view = null;
			if(result > 0)
			{
				view = request.getRequestDispatcher("/admin/mainView");
				view.forward(request, response);
			}
			else
			{
				//error
				view = request.getRequestDispatcher("/admin/mainView");
				view.forward(request, response);
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
