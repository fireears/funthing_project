package qna.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class QnA implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1193750417539051426L;
	
	private int qnaNo;			//qna번호
	private String mNo;			//회원번호
	private String qnaTitle;	//qna 제목
	private String qnaContents;	//qna 내용
	private Date qnaDate;		//qna작성날짜
	private String pNo2;		//상품번호
	private String bNo;			//브랜드번호
	private String reYn;		//답변여부
	private String reContent;	//관리자답변 내용
	public QnA() {
		super();
	}
	
	
	public QnA(String qnaTitle, Date qnaDate) {
		super();
		this.qnaTitle = qnaTitle;
		this.qnaDate = qnaDate;
	}


	public QnA(int qnaNo, String mNo, String qnaTitle, String qnaContents, Date qnaDate, String pNo2, String bNo,
			String reYn, String reContent) {
		super();
		this.qnaNo = qnaNo;
		this.mNo = mNo;
		this.qnaTitle = qnaTitle;
		this.qnaContents = qnaContents;
		this.qnaDate = qnaDate;
		this.pNo2 = pNo2;
		this.bNo = bNo;
		this.reYn = reYn;
		this.reContent = reContent;
	}
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public String getmNo() {
		return mNo;
	}
	public void setmNo(String mNo) {
		this.mNo = mNo;
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
	public Date getQnaDate() {
		return qnaDate;
	}
	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}
	public String getpNo2() {
		return pNo2;
	}
	public void setpNo2(String pNo2) {
		this.pNo2 = pNo2;
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
	public String getReContent() {
		return reContent;
	}
	public void setReContent(String reContent) {
		this.reContent = reContent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "QnA [qnaNo=" + qnaNo + ", mNo=" + mNo + ", qnaTitle=" + qnaTitle + ", qnaContents=" + qnaContents
				+ ", qnaDate=" + qnaDate + ", pNo2=" + pNo2 + ", bNo=" + bNo + ", reYn=" + reYn + ", reContent="
				+ reContent + "]";
	}
	
	
}
