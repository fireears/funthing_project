// 상품문의 페이지_혜린
package productQnA.model.vo;

import java.io.Serializable;
import java.util.Date;

public class AdminProductQnA  implements Serializable	{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6988009231277015510L;
	private int rnum; 				
	private int qnaNo;				// qna 번호
	private String mId;				// 회원아이디
	private String mName;			// 회원 이름
	private String pNo;				// 상품번호
	private String pName;			// 상품명
	private String qnaTitle;		// qna 제목
	private String qnaContents;		// qna 내용
	private String qnaDate;			// qna 작성날짜
	private String bNo;				// 브랜드번호
	private String reYn;			// 답글 여부
	
	// 상품문의 답변 관련 테이블
	private int qnareNo;			// 답변번호
	private String mNo;				// 회원번호
	private String qnareId;			// 관리자 아이디
	private String qnareContent;	// 관리자 답변내용
	private String qnareDate;		// 관리자 답변날짜
	
	
	public AdminProductQnA() {
		super();
	}

	
	// 상품문의 list (답변까지)_혜린
	public AdminProductQnA(int qnaNo,String mNo, String qnaTitle, String qnaContents, String qnaDate,  String pNo,
			String qnareId) {
		super();
		this.qnaNo = qnaNo;
		this.pNo = pNo;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.mNo = mNo;
		this.qnareId = qnareId;
	}




	// 상품문의 클라이언트 상세 페이지 (qna)_혜린
	public AdminProductQnA(String pName,String mId,  String qnaTitle, String qnaDate) {
		super();
		this.mId = mId;
		this.pName = pName;
		this.qnaTitle = qnaTitle;
		this.qnaDate = qnaDate;
	}




	

	// 상품문의 클라이언트 상세 페이지 _혜린
	public AdminProductQnA(int qnaNo, String mId, String mName, String pNo, String pName, String qnaTitle,
			String qnaContents, String qnaDate, String reYn, String qnareId, String qnareContent, String qnareDate) {
		super();
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.mName = mName;
		this.pNo = pNo;
		this.pName = pName;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.reYn = reYn;
		this.qnareId = qnareId;
		this.qnareContent = qnareContent;
		this.qnareDate = qnareDate;
	}
	


	// 상품문의 관리자 페이지 답변_혜린
	public AdminProductQnA(int qnaNo, String mId, String qnareContent) {
		super();
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.qnareContent = qnareContent;
	}




	public AdminProductQnA(int rnum, int qnaNo, String mId, String mName, String pNo, String pName, String qnaTitle,
			String qnaContents, String qnaDate, String reYn) {
		super();
		this.rnum = rnum;
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.mName = mName;
		this.pNo = pNo;
		this.pName = pName;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.reYn = reYn;
	}


	
	
	public AdminProductQnA(int qnaNo, String mId, String mName, String pNo, String pName, String qnaTitle,
			String qnaContents, String qnaDate, String bNo, String reYn, int qnareNo, String mNo, String qnareId,
			String qnareContent, String qnareDate) {
		super();
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.mName = mName;
		this.pNo = pNo;
		this.pName = pName;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.bNo = bNo;
		this.reYn = reYn;
		this.qnareNo = qnareNo;
		this.mNo = mNo;
		this.qnareId = qnareId;
		this.qnareContent = qnareContent;
		this.qnareDate = qnareDate;
	}


	public AdminProductQnA(int qnaNo, String mId, String mName, String pNo, String pName, String qnaTitle,
			String qnaContents, String qnaDate, String bNo, String reYn) {
		super();
		
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.mName = mName;
		this.pNo = pNo;
		this.pName = pName;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.bNo = bNo;
		this.reYn = reYn;
	}
	
	
	

	public int getRnum() {
		return rnum;
	}


	public void setRnum(int rnum) {
		this.rnum = rnum;
	}


	public int getQnareNo() {
		return qnareNo;
	}


	public void setQnareNo(int qnareNo) {
		this.qnareNo = qnareNo;
	}


	public String getmNo() {
		return mNo;
	}


	public void setmNo(String mNo) {
		this.mNo = mNo;
	}


	public String getQnareId() {
		return qnareId;
	}


	public void setQnareId(String qnareId) {
		this.qnareId = qnareId;
	}


	public String getQnareContent() {
		return qnareContent;
	}


	public void setQnareContent(String qnareContent) {
		this.qnareContent = qnareContent;
	}


	public String getQnareDate() {
		return qnareDate;
	}


	public void setQnareDate(String qnareDate) {
		this.qnareDate = qnareDate;
	}


	public int getQnaNo() {
		return qnaNo;
	}


	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}


	public String getmId() {
		return mId;
	}


	public void setmId(String mId) {
		this.mId = mId;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public String getpNo() {
		return pNo;
	}


	public void setpNo(String pNo) {
		this.pNo = pNo;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getQnaTitle() {
		return qnaTitle;
	}


	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}


	public String getQnaContents() {
		return qnaContents;
	}


	public void setQnaContents(String qnaContents) {
		this.qnaContents = qnaContents;
	}


	public String getQnaDate() {
		return qnaDate;
	}


	public void setQnaDate(String qnaDate) {
		this.qnaDate = qnaDate;
	}


	public String getbNo() {
		return bNo;
	}


	public void setbNo(String bNo) {
		this.bNo = bNo;
	}


	public String getReYn() {
		return reYn;
	}


	public void setReYn(String reYn) {
		this.reYn = reYn;
	}


	@Override
	public String toString() {
		return "AdminProductQnA [rnum=" + rnum + ", qnaNo=" + qnaNo + ", mId=" + mId + ", mName=" + mName + ", pNo="
				+ pNo + ", pName=" + pName + ", qnaTitle=" + qnaTitle + ", qnaContents=" + qnaContents + ", qnaDate="
				+ qnaDate + ", bNo=" + bNo + ", reYn=" + reYn + ", qnareNo=" + qnareNo + ", mNo=" + mNo + ", qnareId="
				+ qnareId + ", qnareContent=" + qnareContent + ", qnareDate=" + qnareDate + "]";
	}


	
	
	
	
	}
