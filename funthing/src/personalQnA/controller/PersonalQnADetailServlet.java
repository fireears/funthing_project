// 일대일 문의 디테일 페이지_희지
package personalQnA.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import personalQnA.model.service.PersonalQnAService;
import personalQnA.model.vo.PersonalQnA;

/**
 * Servlet implementation class PersonalQnADetailServlet
 */
@WebServlet("/personalQnADetail")
public class PersonalQnADetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalQnADetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		String mNo = request.getParameter("mNo");
		String perNo = request.getParameter("perNo");
		
		PersonalQnA pq = new PersonalQnAService().perDetail(mNo, perNo);
		
		RequestDispatcher view = null;
		
		
		if(pq != null) {
			view = request.getRequestDispatcher("/views/personalQnA/myPagePersonalDetail.jsp");
			request.setAttribute("pq", pq);
			System.out.println("servlet에서 pq : " + pq);
			
		}else{
			request.setAttribute("msg", "게시판 상세조회 실패");
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
