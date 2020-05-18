
// 1:1문의 페이지_혜린
package personalQnA.model.vo;

public class PersonalQnA {
	private int rownum;				// 댑변 게시판 번호
	private int perQnaNo;			// 1:1문의 게시판 번호
	private String perTitle;		// 게시판  제목
	private String perContents;		// 게시판 내용
	private String pNo;				// 상품 번호
	private String pName;			// 상품 이름
	private String bNo;				// 브랜드 번호
	private String mId;				// 회원 아이디
	private String mName;			// 회원 이름
	private String PerReYn;			// 관리자 답변 유무
	private String AddFile;			// 첨부파일
	private String oNo;				// 주문번호
	private String perCate;			// 문의유형
	public PersonalQnA() {
		super();
	}
	


	public PersonalQnA(int rownum, int perQnaNo, String mId, String perTitle, String perContents, String pNo,String pName, String perReYn,
			String addFile, String oNo, String perCate) {
		super();
		this.rownum = rownum;
		this.perQnaNo = perQnaNo;
		this.mId = mId;
		this.perTitle = perTitle;
		this.perContents = perContents;
		this.pNo = pNo;
		this.pName = pName;
		this.PerReYn = perReYn;
		this.AddFile = addFile;
		this.oNo = oNo;
		this.perCate = perCate;
	}



	public PersonalQnA(int rownum, int perQnaNo, String perTitle, String perContents, String pNo, String pName,
			String bNo, String mId, String mName, String perReYn, String addFile, String oNo, String perCate) {
		super();
		this.rownum = rownum;
		this.perQnaNo = perQnaNo;
		this.perTitle = perTitle;
		this.perContents = perContents;
		this.pNo = pNo;
		this.pName = pName;
		this.bNo = bNo;
		this.mId = mId;
		this.mName = mName;
		PerReYn = perReYn;
		AddFile = addFile;
		this.oNo = oNo;
		this.perCate = perCate;
	}



	public int getRownum() {
		return rownum;
	}



	public void setRownum(int rownum) {
		this.rownum = rownum;
	}



	public int getPerQnaNo() {
		return perQnaNo;
	}



	public void setPerQnaNo(int perQnaNo) {
		this.perQnaNo = perQnaNo;
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



	public String getPerReYn() {
		return PerReYn;
	}



	public void setPerReYn(String perReYn) {
		PerReYn = perReYn;
	}



	public String getAddFile() {
		return AddFile;
	}



	public void setAddFile(String addFile) {
		AddFile = addFile;
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



	@Override
	public String toString() {
		return "PersonalQnA [rownum=" + rownum + ", perQnaNo=" + perQnaNo + ", perTitle=" + perTitle + ", perContents="
				+ perContents + ", pNo=" + pNo + ", pName=" + pName + ", bNo=" + bNo + ", mId=" + mId + ", mName="
				+ mName + ", PerReYn=" + PerReYn + ", AddFile=" + AddFile + ", oNo=" + oNo + ", perCate=" + perCate
				+ "]";
	}




// 일대일 문의_희지
package personalQnA.model.vo;

import java.sql.Date;

public class PersonalQnA {

	private int perNo;
	private String perTitle;
	private String perContents;
	private String pNo;
	private String bNo;
	private String mNo;
	private String perReYn;
	private String addfile;
	private String oNo;
	private String perCate;
	private Date perDate;
	
	
	public PersonalQnA() {
	}


	public PersonalQnA(int perNo, String perTitle, String perContents, String pNo, String bNo, String mNo,
			String perReYn, String addfile, String oNo, String perCate, Date perDate) {
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


	@Override
	public String toString() {
		return "PersonalQnA [perNo=" + perNo + ", perTitle=" + perTitle + ", perContents=" + perContents + ", pNo="
				+ pNo + ", bNo=" + bNo + ", mNo=" + mNo + ", perReYn=" + perReYn + ", addfile=" + addfile + ", oNo="
				+ oNo + ", perCate=" + perCate + ", perDate=" + perDate + "]";
	}
	
	
	
	
	

}
