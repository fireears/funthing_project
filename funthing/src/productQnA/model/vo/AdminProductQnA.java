// 상품문의 페이지_혜린
package productQnA.model.vo;

import java.util.Date;

public class AdminProductQnA {
	
	
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


	public AdminProductQnA() {
		super();
	}

	
	public AdminProductQnA(int qnaNo, String mId, String mName, String pNo, String pName, String qnaTitle,
			String qnaContents, String qnaDate, String reYn) {
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
		return "AdminProductQnA [qnaNo=" + qnaNo + ", mId=" + mId + ", mName=" + mName + ", pNo=" + pNo + ", pName="
				+ pName + ", qnaTitle=" + qnaTitle + ", qnaContents=" + qnaContents + ", qnaDate=" + qnaDate + ", bNo="
				+ bNo + ", reYn=" + reYn + "]";
	}



	
	
	
	
	
	}
