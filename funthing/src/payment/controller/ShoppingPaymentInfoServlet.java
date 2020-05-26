package payment.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.MemberPoint;
import payment.model.service.PaymentService;
import payment.model.vo.ShoppingPayment;

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
      PaymentService pService = new PaymentService();
      ArrayList<ShoppingPayment> list = new ArrayList<>();
      ArrayList<ShoppingPayment> resultList = new ArrayList<>();
      ShoppingPayment p = null;
      MemberPoint m = new MemberPoint();
      
      String userNo = request.getParameter("userNo");
      String[] arrPno = request.getParameterValues("p_no");
      String[] arrNumber = request.getParameterValues("number");
      
      System.out.println(userNo);
      for(int i = 0; i<arrPno.length; i++)
      {
         System.out.println(arrPno[i]);
         System.out.println(arrNumber[i]);
         p = new ShoppingPayment(arrPno[i], arrNumber[i]);
         
         list.add(p);
      }
      System.out.println("------------------------------");
      
      
      resultList = pService.searchProducts(list);
      m = new MemberService().paymentMemberSearch(userNo);
      
      for(ShoppingPayment sp : resultList)
      {
         System.out.println(sp);
      }
      System.out.println(m);
      RequestDispatcher view = null;
      if(!resultList.isEmpty())
      {
         view = request.getRequestDispatcher("/views/payment/paymentInfoList.jsp");
         request.setAttribute("resultList", resultList);
         request.setAttribute("m", m);
         view.forward(request, response);
      }
      else
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