package review.model.vo;

import java.io.Serializable;

public class Review implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -5555128744764844463L;

	/*
	 * REV_NO	NUMBER
		M_NO	NVARCHAR2(50 CHAR)
		REV_TITLE	NVARCHAR2(50 CHAR)
		P_NO	NVARCHAR2(50 CHAR)
		REV_CONTENTS	NVARCHAR2(1000 CHAR)
		REV_DATE	DATE
		VIEWS_NUM	NUMBER
		RATE	NUMBER
		REV_PIC_DIR	VARCHAR2(255 BYTE)*/
	
	private int revNo;				// 리뷰 게시판 번호
	private String mNo;				// 회원 번호
	private String revTitle;		// 리뷰 제목
	private String pNo;				// 품번
	private String revContents;		// 리뷰 내용
	private String revDate;			// 리뷰 작성 날짜
	private int viewsNum;			// 조회수
	private int rate;				// 별점
	private String revPic;			// 이미지
	
	private String rvmId;			// 회원 아이디
	private String rvName;			// 회원 이름
	private String rvThumb;			// 상품 사진
	private String rateStar;		// 별 모양 별점
	public Review() {
		super();
	}
	




	public Review(String pNo) {
		super();
		this.pNo = pNo;
	}





	public Review(String pNo, String rvmId) {
		super();
		this.pNo = pNo;
		this.rvmId = rvmId;
	}


	public Review(int revNo, String mNo, String revTitle, String pNo, String revContents, String revDate, int viewsNum,
			int rate, String revPic, String rvName, String rvThumb, String rateStar) {
		super();
		this.revNo = revNo;
		this.mNo = mNo;
		this.revTitle = revTitle;
		this.pNo = pNo;
		this.revContents = revContents;
		this.revDate = revDate;
		this.viewsNum = viewsNum;
		this.rate = rate;
		this.revPic = revPic;
		this.rvName = rvName;
		this.rvThumb = rvThumb;
		this.rateStar = rateStar;
	}
	
	
	public Review(int revNo, String mNo, String revTitle, String pNo, String revContents, String revDate, int viewsNum,
			int rate, String revPic, String rvName, String rvThumb) {
		super();
		this.revNo = revNo;
		this.mNo = mNo;
		this.revTitle = revTitle;
		this.pNo = pNo;
		this.revContents = revContents;
		this.revDate = revDate;
		this.viewsNum = viewsNum;
		this.rate = rate;
		this.revPic = revPic;
		this.rvName = rvName;
		this.rvThumb = rvThumb;
	}
	public int getRevNo() {
		return revNo;
	}
	public void setRevNo(int revNo) {
		this.revNo = revNo;
	}
	public String getmNo() {
		return mNo;
	}
	public void setmNo(String mNo) {
		this.mNo = mNo;
	}
	
	public String getRvmId() {
		return rvmId;
	}
	
	
	
	public void setRvmId(String rvmId) {
		this.rvmId = rvmId;
	}
	
	
	public String getRevTitle() {
		return revTitle;
	}
	public void setRevTitle(String revTitle) {
		this.revTitle = revTitle;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getRevContents() {
		return revContents;
	}
	public void setRevContents(String revContents) {
		this.revContents = revContents;
	}
	public String getRevDate() {
		return revDate;
	}
	public void setRevDate(String revDate) {
		this.revDate = revDate;
	}
	public int getViewsNum() {
		return viewsNum;
	}
	public void setViewsNum(int viewsNum) {
		this.viewsNum = viewsNum;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getRevPic() {
		return revPic;
	}
	public void setRevPic(String revPic) {
		this.revPic = revPic;
	}
	public String getRvName() {
		return rvName;
	}
	public void setRvName(String rvName) {
		this.rvName = rvName;
	}
	public String getRvThumb() {
		return rvThumb;
	}
	public void setRvThumb(String rvThumb) {
		this.rvThumb = rvThumb;
	}
	public String getRateStar() {
		return rateStar;
	}
	public void setRateStar(String rateStar) {
		this.rateStar = rateStar;
	}
	

	@Override
	public String toString() {
		return "Review [revNo=" + revNo + ", mNo=" + mNo + ", revTitle=" + revTitle + ", pNo=" + pNo + ", revContents="
				+ revContents + ", revDate=" + revDate + ", viewsNum=" + viewsNum + ", rate=" + rate + ", revPic="
				+ revPic + ", rvmId=" + rvmId + ", rvName=" + rvName + ", rvThumb=" + rvThumb + ", rateStar=" + rateStar
				+ "]";
	}

}
