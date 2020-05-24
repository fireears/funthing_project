package review.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import member.model.vo.Member;
import member.model.vo.MemberPoint;
import review.model.service.ReviewService;
import review.model.vo.Review;

/**
 * Servlet implementation class ReviewInsertServlet
 */
@WebServlet("/ReviewInsert")
public class ReviewInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
	
		 ReviewService rvService = new ReviewService();
		
		int maxSize = 1024 * 1024 * 10;
		String root = request.getSession().getServletContext().getRealPath("/images/");
//		System.out.println(root);
		
		String savePath = root + "review/";

		MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
		// 이미지
		String rev_saveFile = multiRequest.getFilesystemName("rev_file");
		String rev_originFile = multiRequest.getOriginalFileName("rev_file");
		
		// 확장자 잘라주기
		if(rev_saveFile != null) {
			int rev_imgDot = rev_saveFile.indexOf(".");
			rev_saveFile = rev_saveFile.substring(0, rev_imgDot);
			
			System.out.println(". 자른 이름 :" + rev_saveFile);
			
		}

		
		// 멤버 넘버
		String revmNo = ((Member)request.getSession().getAttribute("loginUser")).getmNo().toString();
		// 멤버 이름
		String revmName = ((Member)request.getSession().getAttribute("loginUser")).getmName().toString();
		//
		String revmId = ((Member)request.getSession().getAttribute("loginUser")).getmId().toString();
		int revmPoint = ((Member)request.getSession().getAttribute("loginUser")).getmPoint();
		
		System.out.println(revmPoint);
		
		//상품번호 불러오기
		String revpNo = multiRequest.getParameter("rev_pNo");
		
		//별점
		int revRate = Integer.valueOf(multiRequest.getParameter("rev_rateS"));
		System.out.println(revRate);
		
		// 리뷰 제목
		String revTitle = multiRequest.getParameter("rev_tit");
		// 리뷰 컨텐츠
		String revContent = multiRequest.getParameter("rev_textArea");
		
		
		String prdName = null;
		String oNo = null;

		ArrayList<Review> rvList = new ArrayList<>();
		// 아이디와 상품 번호를 가지고 조회
//		Boolean rvb = rvService.searchOrder(revmId,revpNo);
		rvList = rvService.searchOrder(revmId,revpNo);
		
		RequestDispatcher view = null;
		
		String msg = "";
		
		if(rvList.size() != 0) {
			prdName = rvList.get(0).getpNo();
			oNo = rvList.get(0).getRevONo();
			
			System.out.println(oNo);
		}
		
		// 멤버가 해당 상품을 산 경우 내용 insert
		if(!rvList.isEmpty()) {
			
			Review rv = new Review();
			
			rv.setmNo(revmNo);				// 작성자 회원번호 (작성 X 로그인하면 강제 입력)
			rv.setRvName(revmName);			// 작성자 이름
			rv.setRvmId(revmId); 			// 작성자 아이디
			rv.setRate(revRate);			// 별점
			rv.setRevTitle(revTitle);		// 리뷰 제목
			rv.setRevContents(revContent);	// 리뷰 내용
			rv.setpNo(prdName);				// 조합된 상품 번호
			rv.setRevPic(rev_saveFile);		// 리뷰 업로드 이미지

			int result = rvService.insertReview(rv,revmId);
			System.out.println("값이 있다");

			// 리뷰 작성을 성공한 경우 포인트 지급
			if(result > 0) {
//				response.sendRedirect("/product/product.jsp");
//				Member mbp = new Member();
				
				int pointRs = rvService.insertReviewPoint(oNo, revmNo, revmPoint);
				
				if(pointRs > 0) {
					// point 테이블에 인서트 성공한 경우 멤버 테이블의 h_point에도 포인트 추가
					int mbRs = rvService.updateMemberPoint(revmNo);
					
					
					if(mbRs > 0) {
						System.out.println("meber point update");
						msg = "리뷰가 등록되었습니다.";
					}
					
					
				}
				
				// 어떻게 다시 프로덕트 페이지로 넘기지?
//				view = request.getRequestDispatcher("/views/product/productDetail.jsp");
			}
			
		}else {
			System.out.println("리뷰 업로드 실패");
		}
		
//		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
