package admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import admin.model.service.AdminService;
import productQnA.model.vo.ProductQnAReply;

/**
 * Servlet implementation class AdminInsertQnaRe
 */
@WebServlet("/admin/insertQnaRe")
public class AdminInsertProductQnaRe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInsertProductQnaRe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String writer = request.getParameter("writer");
		int qnaNo = Integer.parseInt(request.getParameter("qnaNo"));
		String content = request.getParameter("content");
		
		ProductQnAReply r = new ProductQnAReply();
		r.setQnareId(writer);
		r.setQnaNo(qnaNo);
		r.setQnareContent(content);		
		
		ArrayList<ProductQnAReply> rlist = new AdminService().insertReply(r);
		
		JSONArray rlistArray = new JSONArray();
		JSONObject rlistObj = null;
		
		
		for(ProductQnAReply user : rlist) {
			rlistObj = new JSONObject();
			
			java.util.Date qnareDate = new java.util.Date(user.getQnareDate().getTime());
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String qDate = sdf.format(qnareDate);

			rlistObj.put("qnareNo", user.getQnareNo());				// 답변 번호
			rlistObj.put("qnaNo", user.getQnaNo());					// QNA번호
			rlistObj.put("mNo", user.getmNo());						// 회원번호
			rlistObj.put("qnareId", user.getQnareId());				// 관리자 아이디
			rlistObj.put("qnareContent", user.getQnareContent());	// 관리자 답변내용
			rlistObj.put("qnareDate", qnareDate);					// 관리자 답변날짜

			
			rlistArray.add(rlistObj);
		}
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print(rlistArray);
		out.flush();
		out.close();
		
		
		
		// 리스트를 다시 클라이언트로 보내줄건데! 그 때 편한 Gson을 이용해서 보내주자
		// Gson라이브러리를 testAjaxProject에서 복사해서 추가하고 다음과 같이 보내주자
//		response.setContentType("application/json;"); // charset=utf-8은 필터에서 적용해줫으니 생략!!
//		new Gson().toJson(rlist, response.getWriter());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
