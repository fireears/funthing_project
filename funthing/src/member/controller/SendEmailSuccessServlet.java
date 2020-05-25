// 인증번호 성공 여부
package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class SendEmailSuccessServlet
 */
@WebServlet("/success.msg")
public class SendEmailSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendEmailSuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
	 	
	 	System.out.println("servlet : " + userId);
		Member m = new MemberService().memberSend(userId);
		
	 	String AuthenticationKey = (String)request.getSession().getAttribute("AuthenticationKey");
        String AuthenticationUser = request.getParameter("message");
        if(!AuthenticationKey.equals(AuthenticationUser))
        {
            System.out.println("인증번호가 일치하지 않습니다.");
            request.setAttribute("msg1", "인증번호가 일치하지 않습니다");
            
            request.getRequestDispatcher("/views/member/searchPwd1.jsp").forward(request, response);
            return;
        }else {
        	System.out.println("인증 성공");
        	request.setAttribute("userId",userId);
        	request.setAttribute("memberPwd", m);
        	request.setAttribute("msg", "인증이 되었습니다.");
        	
        	request.getRequestDispatcher("/views/member/searchPwd4.jsp").forward(request, response);
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
