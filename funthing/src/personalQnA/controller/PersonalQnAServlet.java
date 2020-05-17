package personalQnA.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class PersonalQnAServlet
 */
@WebServlet("/PersonalQnA")
public class PersonalQnAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalQnAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int maxSize = 1024*1024*10;	// 이미지 사이즈 제한함 10Mbytes
		
		MultipartRequest multiRequest = new MultipartRequest(request, "utf-8");
		

		String q1_tit = multiRequest.getParameter("q1_tit");
		String q1_cont = multiRequest.getParameter("q1_cont");
		
		System.out.println(q1_tit);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
