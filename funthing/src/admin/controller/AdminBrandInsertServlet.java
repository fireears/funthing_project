// 브랜드 insert Servlet_희지
package admin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import brand.model.service.BrandService;
import brand.model.vo.Brand2;

/**
 * Servlet implementation class AdminBrandInsertServlet
 */
@WebServlet("/admin/brandInsert")
public class AdminBrandInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBrandInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 입력받은 브랜드 정보 저장
		String bNo = request.getParameter("bNo");
		String bName = request.getParameter("bName");
		String bCeo = request.getParameter("bCeo");
		String bPhone = request.getParameter("bPhone");
		String bAddress = request.getParameter("bAddress");
		String bEmail = request.getParameter("bEamil");
		String bLchDate = request.getParameter("bLchDate"); // date형인데 String으로 형변환!! 나중에 다시 보자
		String bLchYn = request.getParameter("bLchYn");
		
		// Brand2객체 생성
		Brand2 b = new Brand2(bNo, bName, bCeo, bPhone, bAddress, bEmail, bLchDate, bLchYn);
		
		int result = new AdminService().insertBrand(b);
		
		
		
		// 여기 부분 에러 남!! 여기 확인해야 함
		RequestDispatcher view = null;
		if(result>0) {
			view = request.getRequestDispatcher("/views/admin/insertBrand.jsp");
			request.setAttribute("result",result);
			
		}else {
			view = request.getRequestDispatcher("/views/admin/insertBrand.jsp");
			request.setAttribute("msg", "브랜드 정보 등록에 실패하셨습니다.");
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
