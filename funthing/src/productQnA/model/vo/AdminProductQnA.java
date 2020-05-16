// 상품문의 페이지_혜린
package productQnA.model.vo;

import java.util.Date;

public class AdminProductQnA {

	private int qnaNo;				// qna 번호
	private String mId;				// 회원아이디
	private String qnaTitle;		// qna 제목
	private String qnaContents;		// qna 내용
	private String qnaDate;			// qna 작성날짜
	private String pNo;				// 상품번호
	private String pName;			// 상품명
	private String bNo;				// 브랜드번호
	private String reYn;			// 답글 여부
	private String reId;			// 관리자 아이디
	private String reContent;		// 답글 내용
	private String reDate;			// 답변날짜

	public AdminProductQnA() {
		super();
	}


	public AdminProductQnA(int qnaNo, String mId, String pNo, String pName,String qnaTitle, String qnaDate, 
			 String reYn) {
		super();
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.qnaTitle = qnaTitle;
		this.qnaDate = qnaDate;
		this.pNo = pNo;
		this.pName = pName;
		this.reYn = reYn;
	}


	public AdminProductQnA(int qnaNo, String mId, String qnaTitle, String qnaContents, String qnaDate, String pNo,
			String pName, String bNo, String reYn, String reId, String reContent, String reDate) {
		super();
		this.qnaNo = qnaNo;
		this.mId = mId;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.pNo = pNo;
		this.pName = pName;
		this.bNo = bNo;
		this.reYn = reYn;
		this.reId = reId;
		this.reContent = reContent;
		this.reDate = reDate;
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

	public String getReId() {
		return reId;
	}

	public void setReId(String reId) {
		this.reId = reId;
	}

	public String getReContent() {
		return reContent;
	}

	public void setReContent(String reContent) {
		this.reContent = reContent;
	}

	public String getReDate() {
		return reDate;
	}

	public void setReDate(String reDate) {
		this.reDate = reDate;
	}

	@Override
	public String toString() {
		return "AdminProductQnA [qnaNo=" + qnaNo + ", mId=" + mId + ", qnaTitle=" + qnaTitle + ", qnaContents="
				+ qnaContents + ", qnaDate=" + qnaDate + ", pNo=" + pNo + ", pName=" + pName + ", bNo=" + bNo
				+ ", reYn=" + reYn + ", reId=" + reId + ", reContent=" + reContent + ", reDate=" + reDate + "]";
	}
	
	

	
	}
