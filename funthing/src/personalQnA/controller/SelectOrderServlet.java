package personalQnA.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import member.model.vo.Member;
import payment.model.vo.OrderInfoDetail;
import personalQnA.model.service.PersonalQnAService;
 
/**
 * Servlet implementation class SelectOrderServlet
 */
@WebServlet("/SelectOrder")
public class SelectOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		OrderInfo oi = new OrderInfo();
		PersonalQnAService perQAservice = new PersonalQnAService();
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getmId().toString();
		System.out.println(userId);

		ArrayList<OrderInfoDetail> oiList = perQAservice.orderListView(userId);
		
		RequestDispatcher view = null;
		if(!oiList.isEmpty()) {
			view = request.getRequestDispatcher("views/personalQnA/orderSelectPage.jsp");
			request.setAttribute("oiList", oiList);
			
		}else {
			
		}

		JSONArray pjArray = new JSONArray();
		JSONObject pjObj = null;
		
		for(OrderInfoDetail oid : oiList) {
			pjObj = new JSONObject();

			pjObj.put("oipNo", oid.getoNo());
			pjObj.put("oiTnumbnail", oid.getPerThumbnail());
			pjObj.put("oiPerName", oid.getPerPnName());
			pjObj.put("oiTotalPrice", oid.getTotalPrice());
			pjObj.put("oimId", oid.getmId());
			
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
