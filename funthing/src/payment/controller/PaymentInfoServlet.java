package payment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.MemberPoint;
import payment.model.vo.ShoppingPayment;
import product.model.service.ProductService;

/**
 * Servlet implementation class PaymentInfoServlet
 */
@WebServlet("/PaymentInfo")
public class PaymentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p_no = request.getParameter("p_no");
		String color = request.getParameter("color");
		String size = request.getParameter("size");
		String userNo = request.getParameter("userNo");
		String number = request.getParameter("number");
//		String mEmail = request.getParameter("mEmail");
		
		System.out.println("productDetail.jsp에서 받은 값 : " + p_no + color + size);
		
		String pNo = p_no + color + size;
		System.out.println("pNo " + pNo);
		System.out.println("userNo : " + userNo);
//		System.out.println("mEmail" + mEmail);
		System.out.println("number : " + number);
		
		ShoppingPayment p = new ProductService().paymentProductSearch(pNo, number);
		MemberPoint m = new MemberService().paymentMemberSearch(userNo);
		
		System.out.println(p);
//		Payment pm = new Payment(pNo, userNo, mEmail, number);
		System.out.println(m);
		RequestDispatcher view = null;
		if(p != null)
		{
			view = request.getRequestDispatcher("/views/payment/paymentInfo.jsp");
			request.setAttribute("p", p);
			request.setAttribute("m", m);
			request.setAttribute("number", number);
//			request.setAttribute("mEmail", mEmail);
			view.forward(request, response);
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
