// 상품문의 댓글 페이지_혜린
package productQnA.model.vo;

import java.util.Date;

public class ProductQnAReply {
	
	private int qnareNo;			// 답변 번호
	private int qnaNo;				// QNA번호
	private String mNo;				// 회원번호
	private String qnareId;			// 관리자 아이디
	private String qnareContent;	// 관리자 답변내용
	private Date qnareDate;			// 관리자 답변날짜
	public ProductQnAReply() {
		super();
	}
	
	public ProductQnAReply(int qnareNo, int qnaNo, String mNo, String qnareId, String qnareContent, Date qnareDate) {
		super();
		this.qnareNo = qnareNo;
		this.qnaNo = qnaNo;
		this.mNo = mNo;
		this.qnareId = qnareId;
		this.qnareContent = qnareContent;
		this.qnareDate = qnareDate;
	}
	public int getQnareNo() {
		return qnareNo;
	}
	public void setQnareNo(int qnareNo) {
		this.qnareNo = qnareNo;
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
	public Date getQnareDate() {
		return qnareDate;
	}
	public void setQnareDate(Date qnareDate) {
		this.qnareDate = qnareDate;
	}
	@Override
	public String toString() {
		return "ProductQnAReply [qnareNo=" + qnareNo + ", qnaNo=" + qnaNo + ", mNo=" + mNo + ", qnareId=" + qnareId
				+ ", qnareContent=" + qnareContent + ", qnareDate=" + qnareDate + "]";
	}
	
}