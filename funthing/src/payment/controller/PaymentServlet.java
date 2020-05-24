package payment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import payment.model.service.PaymentService;
import payment.model.vo.Payment;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/Payment")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("paymentServlet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PaymentService pService = new PaymentService();
		try
		{
			String rcv_name = request.getParameter("rcv_name");
			String rcv_adrs = request.getParameter("rcv_adrs");
			String rcv_phone = request.getParameter("rcv_phone");
			String comment = request.getParameter("comment");
			int point_use = Integer.valueOf(request.getParameter("point_use"));
			int total_price = Integer.valueOf(request.getParameter("total_price"));
			String ship_price = request.getParameter("ship_price");
//			String expt_price = request.getParameter("expt_price");
			int expt_point = Integer.valueOf(request.getParameter("expt_point"));
			String mNo = request.getParameter("mNo");
			
			//최종 결제 금액
			//상품합계 금액 - 적립금 사용
			int pmnt_price = total_price - point_use;
			Payment p = new Payment(rcv_name, rcv_adrs, rcv_phone, comment, total_price, point_use, ship_price, pmnt_price, expt_point, mNo);
			
			int result = pService.insertPayment(p);
			System.out.println(mNo);
			System.out.println(rcv_name);
			System.out.println(rcv_adrs);
			System.out.println(rcv_phone);
			System.out.println(comment);
			System.out.println(point_use);
			System.out.println(total_price);
			System.out.println(ship_price);
			System.out.println(pmnt_price);
			System.out.println(expt_point);

			if(result > 0)
			{
				System.out.println("결제 완료");
			}
			else
			{
				System.out.println("결제 실패");
			}
			
		}
		catch(NumberFormatException e)
		{
			
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
