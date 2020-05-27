package payment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.vo.MemberPoint;
import payment.model.service.PaymentService;
import payment.model.vo.Payment;
import payment.model.vo.ProductOrder;
import product.model.vo.Product;

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
		
		PaymentService pService = new PaymentService();
		
		try
		{
			String[] arrPname = request.getParameterValues("pName");
			String[] arrResult_price = request.getParameterValues("result_price");
			String rcv_name = request.getParameter("rcv_name");
			String rcv_adrs = request.getParameter("rcv_adrs");
			String rcv_phone = request.getParameter("rcv_phone");
			String comment = request.getParameter("comment");
			int point_use = Integer.valueOf(request.getParameter("point_use"));		//사용한 적립금
			int total_price = Integer.valueOf(request.getParameter("total_price"));
			String ship_price = request.getParameter("ship_price");
			int expt_point = Integer.valueOf(request.getParameter("expt_point"));	//총 적립예정 적립금
			int m_point = Integer.valueOf(request.getParameter("m_point"));			//보유 적립금
			String mNo = request.getParameter("mNo");
			String[] pNo = request.getParameterValues("pNo");						//상품번호
			String[] o_num = request.getParameterValues("o_num");					//수량
			
			
			
			int resultM_point = m_point + expt_point - point_use;	//member테이블에 update할 m_point
			
			int point_amount = expt_point;	//point 테이블 update 적립금액
			int my_point = resultM_point;	//point 테이블에 update
			
			//최종 결제 금액
			//상품합계 금액 - 적립금 사용
			int pmnt_price = total_price - point_use;
			
			//payment결제 정보
			Payment p = new Payment(rcv_name, rcv_adrs, rcv_phone, comment, total_price, point_use, ship_price, pmnt_price, expt_point, mNo);
			
			//member table m_point update
			MemberPoint mp = new MemberPoint();
			mp.setmNo(mNo);
			mp.setPointAmount(point_amount);
			mp.setmPoint(my_point);
			mp.setMyPoint(my_point);
			int resultPoint = pService.insertMpoint(mp);
			
			//펀딩 판매금액 업데이트
			ArrayList<Product> productList = new ArrayList<>();
			Product product = new Product();
			String pName;
			String result_price;
			for(int i = 0; i<arrPname.length; i++)
			{
				pName = arrPname[i];
				result_price = arrResult_price[i];
				product.setpName(pName);
				product.setfSelPrice(Integer.valueOf(result_price));
				productList.add(product);
			}
			int result_product = pService.updateProduct(productList);

			//b_no 가져오기
			String[] b_no = pService.searchBrand(pNo);
			
			//productOrder 객체를 담을 list
			ArrayList<ProductOrder> orderList = new ArrayList<>();
			for(int i = 0; i<pNo.length;i++)
			{
				String p_no = pNo[i];
				String bNo = b_no[i];
				int oNum = Integer.valueOf(o_num[i]);
				ProductOrder pd = new ProductOrder(p_no, bNo, oNum);
				orderList.add(pd);
			}
			
			//payment_info insert
			int result = pService.insertPayment(p, mNo, mp, orderList);

			RequestDispatcher view = null;
			if(result > 0 && result_product > 0 && resultPoint > 0)
			{
				System.out.println("결제 완료");
				view = request.getRequestDispatcher("/member/myPageOrderList");
				request.setAttribute("userNo",mNo);
				view.forward(request, response);
			}
			else
			{
				System.out.println("결제 실패");
				view = request.getRequestDispatcher("/main/mainView");
				view.forward(request, response);
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