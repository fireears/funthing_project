package payment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShoppingPaymentInfoServlet
 */
@WebServlet("/ShoppingPaymentInfo")
public class ShoppingPaymentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingPaymentInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ShoppingPaymentInfo");
		
		String userNo = request.getParameter("userNo");
		String[] arrPno = request.getParameterValues("p_no");
		String[] arrNumber = request.getParameterValues("number");
		
		System.out.println(userNo);
		for(int i = 0; i<arrPno.length; i++)
		{
			System.out.println(arrPno[i]);
			System.out.println(arrNumber[i]);
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
