// 인증번호
package member.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MessageSendServlet
 */
@WebServlet("/message.send")
public class MessageSendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageSendServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		System.out.println("servlet : " + email);
		Member m = new MemberService().memberemail(email);
		
//		System.out.println("email : " + m.getmEmail());
		// mail server 설정
		String host = "smtp.gmail.com";
		String user = "rngus3698";		// 자신의 gmail 아이디 넣기
		String password = "tkddnjs123";	// 자신의 gmail 비밀번호 넣기
		
		// 메일 받을 주소
		String to_email = m.getmEmail();
		System.out.println("to_email : " + m.getmEmail());
		
		// STMP 서버 정보를 설정한다.
		Properties props = new Properties();
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.port", 465);
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.ssl.enable","true");
		
		// 인증번호 생성기
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			int rIndex = rnd.nextInt(3);
            switch (rIndex) {
            case 0:
                // a-z
                temp.append((char) ((int) (rnd.nextInt(26)) + 97));
                break;
            case 1:
                // A-Z
                temp.append((char) ((int) (rnd.nextInt(26)) + 65));
                break;
            case 2:
                // 0-9
                temp.append((rnd.nextInt(10)));
                break;
			}
		}
		String AuthenticationKey = temp.toString();
		System.out.println(AuthenticationKey);
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
				
			}
		});
		
		// email 전송
		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(user, "FUN-THING"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));
			
			// 메일 제목
			msg.setSubject("안녕하세요 FUN-THING 인증 메일 입니다.");
			// 메일 내용
			msg.setText("인증 번호는:" + temp);
			
			Transport.send(msg);
			System.out.println("이메일 전송");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		HttpSession saveKey= request.getSession();
		saveKey.setAttribute("AuthenticationKey", AuthenticationKey);
		// 패스워드 바꿀때 뭘 바꿀지 조건에 들어가는  email
		request.setAttribute("email", email);
		request.setAttribute("memberSend", m);
		request.getRequestDispatcher("/views/member/searchPwd3.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
