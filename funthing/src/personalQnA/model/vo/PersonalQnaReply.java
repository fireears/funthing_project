// 1:1문의 답변 페이지_혜린
package personalQnA.model.vo;

import java.io.Serializable;

public class PersonalQnaReply implements Serializable	 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -15818897414227831L;
//	private int pqreNo;				// 1:1답변 번호(관리자)
	private String pqreId;			// 관리자 아이디
	private String pqreContent;		// 관리자 답변내용
	private String pqreDate;		// 관리자 답변날짜
	private int perQnaNo;			// 1:1문의 게시판 번호(클라이언트)
	public PersonalQnaReply() {
		super();
	}
	
	public PersonalQnaReply( int perQnaNo,String pqreId, String pqreContent) {
		super();
	
		this.perQnaNo = perQnaNo;
		this.pqreId = pqreId;
		this.pqreContent = pqreContent;
		
	}

	public PersonalQnaReply(String pqreId, String pqreContent, String pqreDate, int perQnaNo) {
		super();
		
		this.pqreId = pqreId;
		this.pqreContent = pqreContent;
		this.pqreDate = pqreDate;
		this.perQnaNo = perQnaNo;
	}
//	public int getPqreNo() {
//		return pqreNo;
//	}
//	public void setPqreNo(int pqreNo) {
//		this.pqreNo = pqreNo;
//	}
	public String getPqreId() {
		return pqreId;
	}
	public void setPqreId(String pqreId) {
		this.pqreId = pqreId;
	}
	public String getPqreContent() {
		return pqreContent;
	}
	public void setPqreContent(String pqreContent) {
		this.pqreContent = pqreContent;
	}
	public String getPqreDate() {
		return pqreDate;
	}
	public void setPqreDate(String pqreDate) {
		this.pqreDate = pqreDate;
	}
	public int getPerQnaNo() {
		return perQnaNo;
	}
	public void setPerQnaNo(int perQnaNo) {
		this.perQnaNo = perQnaNo;
	}
	@Override
	public String toString() {
		return "PersonalQnaReply [pqreNo=" +  ", pqreId=" + pqreId + ", pqreContent=" + pqreContent
				+ ", pqreDate=" + pqreDate + ", perQnaNo=" + perQnaNo + "]";
	}
	
	
}
