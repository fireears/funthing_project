package personalQnA.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import member.model.vo.Member;
import personalQnA.model.service.PersonalQnAService;
import personalQnA.model.vo.PersonalQnA;

/**
 * Servlet implementation class InsertPerQnAServlet
 */
@WebServlet("/InsertPerQnA")
public class InsertPerQnAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPerQnAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	
		int maxSize = 1024 * 1024 * 10;
		
		String root = request.getSession().getServletContext().getRealPath("/images/");
//		System.out.println(root);
		
		String savePath = root + "personalQnA/";
		
		MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
		
		String q1_tit = multiRequest.getParameter("q1_tit");
		
		// 주문 내역 어케 받지??
		
		String q1_type = multiRequest.getParameter("q1_type");
		// 로그인 유저 아이디값 받아옴
		String q1_name = ((Member)request.getSession().getAttribute("loginUser")).getmName().toString();
		String q1_num = ((Member)request.getSession().getAttribute("loginUser")).getmNo().toString();
		
//		System.out.println(q1_num);		
		
		String q1_saveFile = multiRequest.getFilesystemName("q1_file");
		String q1_originFile = multiRequest.getOriginalFileName("q1_file");
		
		String q1_cont = multiRequest.getParameter("q1_cont");
		
		// 자동등록방지 인증값 어떻게 받을 건지?
		
		PersonalQnA perQA = new PersonalQnA();
		
		perQA.setPerTitle(q1_tit);		// 게시판 제목
		perQA.setPerContents(q1_cont);	// 게시판 내용
		perQA.setpName(q1_name);		// 작성자 이름 (수정 X 로그인 된 이름 뽑아옴)
		
//		PerQA.setpNo(q1_prodNo);		// 상품 번호
		perQA.setPerCate(q1_type); 		// 문의 유형
		perQA.setAddFile(q1_saveFile);	// 업로드 파일
		
		int result = new PersonalQnAService().insertPerQnA(perQA, q1_num);
		
		if(result > 0) {
//			response.sendRedirect("perQnAlist");	// list Servlet으로 연결해주기
			System.out.println("insert 성공");
			
		}else {

			// 글쓰기 실패시 업로드한 파일 삭제
			File failedFile = new File(savePath + q1_saveFile);	// file은 io package 안에 있는 것 import
			failedFile.delete();
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
