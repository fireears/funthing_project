// 1:1문의 페이지_혜린,서윤
package personalQnA.model.vo;
 
import java.io.Serializable;

public class PersonalInsert implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6484841057229150732L;
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
	public PersonalInsert() {
		super();
	}
	public PersonalInsert(int perQnaNo, String perTitle, String perContents, String pNo, String pName, String bNo,
			String mId, String mName, String perReYn, String addFile, String oNo, String perCate) {
		super();
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
		return "PersonalInsert [perQnaNo=" + perQnaNo + ", perTitle=" + perTitle + ", perContents=" + perContents
				+ ", pNo=" + pNo + ", pName=" + pName + ", bNo=" + bNo + ", mId=" + mId + ", mName=" + mName
				+ ", PerReYn=" + PerReYn + ", AddFile=" + AddFile + ", oNo=" + oNo + ", perCate=" + perCate + "]";
	}
	
	
}
