// 일대일 문의 vo_희지
package personalQnA.model.vo;

import java.sql.Date;

public class PersonalQnA {


	private int rnum;
   private int perNo;            	// 1:1 문의 게시판 번호
   private String perTitle;      	// 게시판 제목
   private String perContents;      // 게시판 내용
   private String pNo;            	// 상품번호 
   private String pName;			// 상품이름
   private String bNo;            	// 브랜드번호
   private String mNo;            	// 회원번호
   private String mName;			// 회원이름
   private String mId;				// 회원 아이디
   private String perReYn;         	// 관리자 답변 유무
   private String addfile;         	// 첨부파일
   private String oNo;            	// 주문번호
   private String perCate;         	// 문의유형
   private Date perDate;         	// 문의날짜
   
   
   // 일대일 문의 답변 관련 테이블
   private String pqreId;			// 관리자 아이디
   private int pqNo;				// 답변 번호
   private String pqreContent;		// 관리자 답변내용
   private Date pqreDate;			// 관리자 답변 날짜
   
   
      
      public PersonalQnA() {
      }



	public PersonalQnA(int rnum, int perNo, String perTitle, String perContents, String pNo, String pName, String bNo,
			String mNo, String mName, String mId, String perReYn, String addfile, String oNo, String perCate,
			Date perDate, String pqreId, int pqNo, String pqreContent, Date pqreDate) {
		this.rnum = rnum;
		this.perNo = perNo;
		this.perTitle = perTitle;
		this.perContents = perContents;
		this.pNo = pNo;
		this.pName = pName;
		this.bNo = bNo;
		this.mNo = mNo;
		this.mName = mName;
		this.mId = mId;
		this.perReYn = perReYn;
		this.addfile = addfile;
		this.oNo = oNo;
		this.perCate = perCate;
		this.perDate = perDate;
		this.pqreId = pqreId;
		this.pqNo = pqNo;
		this.pqreContent = pqreContent;
		this.pqreDate = pqreDate;
	}



	public PersonalQnA(int perNo, String perTitle, String perContents, String pNo, String pName, String bNo, String mNo,
			String mName, String mId, String perReYn, String addfile, String oNo, String perCate, Date perDate,
			String pqreId, int pqNo, String pqreContent, Date pqreDate) {
		this.perNo = perNo;
		this.perTitle = perTitle;
		this.perContents = perContents;
		this.pNo = pNo;
		this.pName = pName;
		this.bNo = bNo;
		this.mNo = mNo;
		this.mName = mName;
		this.mId = mId;
		this.perReYn = perReYn;
		this.addfile = addfile;
		this.oNo = oNo;
		this.perCate = perCate;
		this.perDate = perDate;
		this.pqreId = pqreId;
		this.pqNo = pqNo;
		this.pqreContent = pqreContent;
		this.pqreDate = pqreDate;
	}

	
	


	public PersonalQnA(int rnum, int perNo, String perTitle, String perContents, String pNo, String bNo, String mNo,
			String perReYn, String addfile, String oNo, String perCate, Date perDate) {
		this.rnum = rnum;
		this.perNo = perNo;
		this.perTitle = perTitle;
		this.perContents = perContents;
		this.pNo = pNo;
		this.bNo = bNo;
		this.mNo = mNo;
		this.perReYn = perReYn;
		this.addfile = addfile;
		this.oNo = oNo;
		this.perCate = perCate;
		this.perDate = perDate;
	}



	public int getRnum() {
		return rnum;
	}



	public void setRnum(int rnum) {
		this.rnum = rnum;
	}



	public int getPerNo() {
		return perNo;
	}



	public void setPerNo(int perNo) {
		this.perNo = perNo;
	}



	public String getPerTitle() {
		return perTitle;
	}



	public void setPerTitle(String perTitle) {
		this.perTitle = perTitle;
	}



	public String getPerContents() {
		return perContents;
	}



	public void setPerContents(String perContents) {
		this.perContents = perContents;
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



	public String getmNo() {
		return mNo;
	}



	public void setmNo(String mNo) {
		this.mNo = mNo;
	}



	public String getmName() {
		return mName;
	}



	public void setmName(String mName) {
		this.mName = mName;
	}



	public String getmId() {
		return mId;
	}



	public void setmId(String mId) {
		this.mId = mId;
	}



	public String getPerReYn() {
		return perReYn;
	}



	public void setPerReYn(String perReYn) {
		this.perReYn = perReYn;
	}



	public String getAddfile() {
		return addfile;
	}



	public void setAddfile(String addfile) {
		this.addfile = addfile;
	}



	public String getoNo() {
		return oNo;
	}



	public void setoNo(String oNo) {
		this.oNo = oNo;
	}



	public String getPerCate() {
		return perCate;
	}



	public void setPerCate(String perCate) {
		this.perCate = perCate;
	}



	public Date getPerDate() {
		return perDate;
	}



	public void setPerDate(Date perDate) {
		this.perDate = perDate;
	}



	public String getPqreId() {
		return pqreId;
	}



	public void setPqreId(String pqreId) {
		this.pqreId = pqreId;
	}



	public int getPqNo() {
		return pqNo;
	}



	public void setPqNo(int pqNo) {
		this.pqNo = pqNo;
	}



	public String getPqreContent() {
		return pqreContent;
	}



	public void setPqreContent(String pqreContent) {
		this.pqreContent = pqreContent;
	}



	public Date getPqreDate() {
		return pqreDate;
	}



	public void setPqreDate(Date pqreDate) {
		this.pqreDate = pqreDate;
	}



	@Override
	public String toString() {
		return "PersonalQnA [rnum=" + rnum + ", perNo=" + perNo + ", perTitle=" + perTitle + ", perContents="
				+ perContents + ", pNo=" + pNo + ", pName=" + pName + ", bNo=" + bNo + ", mNo=" + mNo + ", mName="
				+ mName + ", mId=" + mId + ", perReYn=" + perReYn + ", addfile=" + addfile + ", oNo=" + oNo
				+ ", perCate=" + perCate + ", perDate=" + perDate + ", pqreId=" + pqreId + ", pqNo=" + pqNo
				+ ", pqreContent=" + pqreContent + ", pqreDate=" + pqreDate + "]";
	}



	
      
   
   }
