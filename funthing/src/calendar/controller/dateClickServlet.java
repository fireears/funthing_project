package calendar.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import calendar.model.service.CalendarService;
import product.model.vo.Product;

/**
 * Servlet implementation class dateClickServlet
 */
@WebServlet("/dateClick")
public class dateClickServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dateClickServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String thisDate = request.getParameter("thisDate");
		
		CalendarService cal = new CalendarService();
		request.setAttribute("thisDate", thisDate);
		
		ArrayList<Product> cList = cal.clickDate(thisDate);

		RequestDispatcher view = null;
		
		if(!cList.isEmpty()) {
			view = request.getRequestDispatcher("views/calendar/calendar.jsp");
			request.setAttribute("cList", cList);
		}else {
			
		}
		
		// json area json으로 배열을 던져줌
		JSONArray pjArray = new JSONArray();
	      JSONObject pjObj = null;
	      
	      for(Product cProd : cList) {
	         pjObj = new JSONObject();
	         
	         // sql.Date -> util.Date
	         java.util.Date utilDate1 = new java.util.Date(cProd.getfStartDate().getTime());
	         java.util.Date utilDate2 = new java.util.Date(cProd.getfEndDate().getTime());

	         
	         // yyyy-MM-dd형의 String으로 바꾸기
	         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	         // 숫자 000,000 으로 바꿔주기
	         DecimalFormat formatter = new DecimalFormat("###,###");
	         
	         String utilfStartDate = sdf.format(utilDate1);
	         String utilfEndtDate = sdf.format(utilDate2);

	         int rp = cProd.getRetailPrice();
	         int pp = cProd.getpPrice();
	         String frp= formatter.format(rp);
	         String fpp = formatter.format(pp);
	      
	         System.out.println();
	         
	         pjObj.put("prodNo", cProd.getpNo());
	         pjObj.put("thumbnail", cProd.getThumbnail());
	         pjObj.put("prodName", cProd.getpName());
	         pjObj.put("prodRetailPrice", frp);
	         pjObj.put("prodPPrice", fpp);
	         pjObj.put("fStartdate", utilfStartDate);
	         pjObj.put("fEnddate", utilfEndtDate);
	         pjObj.put("fPrgRate", cProd.getfPrgRate());
	         
	         pjArray.add(pjObj);
	      }
	      
	      response.setContentType("application/json; charset=utf-8"); 
	      
	      PrintWriter out = response.getWriter();
	      out.print(pjArray);
	      out.flush();
	      out.close();

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
