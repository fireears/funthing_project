// 브랜드 insert Servlet_희지
package admin.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import brand.model.service.BrandService;
import brand.model.vo.Brand;


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
		Date bLchDate = Date.valueOf(request.getParameter("bLchDate")); // date형인데 String으로 형변환!! 나중에 다시 보자
		String bLchYn = request.getParameter("bLchYn");
		
		// Brand객체 생성
		Brand b = new Brand(bNo, bName, bCeo, bPhone, bAddress, bEmail, bLchDate, bLchYn);
		
		int result = new AdminService().insertBrand(b);
		
		 //확인용
		System.out.println("admin 브랜드 insert Serlvet : " + result);
		
		
		// 정보 입력 성공 후 페이지 전환 하기 -> 수정전
		RequestDispatcher view = null;
		if(result>0) {
			view = request.getRequestDispatcher("views/admin/adminBrand.jsp");
			request.setAttribute("msg", bName + " 브랜드 등록에 성공하셨습니다.");
			

		}else {
			
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
