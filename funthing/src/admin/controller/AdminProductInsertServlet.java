package admin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
		
		request.setCharacterEncoding("utf-8");
		
		int maxSize = 1024*1024*10;
		
		String root = request.getSession().getServletContext().getRealPath("/");
		
		String thumbnailSavePath = root + "/images/thumbnail";
		
		MultipartRequest tumbnailMultipart = new MultipartRequest(request, thumbnailSavePath, maxSize, "utf-8", new DefaultFileRenamePolicy());
		
		
		System.out.println("productInsertServlet");
		String pNo = request.getParameter("pNo");
		String bNo = request.getParameter("bNo");
//		String thumbnail = request.getParameter(")
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
