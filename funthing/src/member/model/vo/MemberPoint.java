// 회원 적립금 내역(POINT_LIST)view를 기준으로 만든 클래스_희지

package member.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class MemberPoint implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1574523257688707877L;
	
	private int rnum;				// rownum번호
	private String pointNo;			// 적립금 번호
	private Date pointDate;			// 적립날짜
	private String oNo;				// 주문 번호
	private String pointContent;	// 적립금 내용
	private int pointAmount;		// 적립금액
	private String mNo;				// 회원번호
	private String pointCate;		// 적립금 유형
	private int mPoint;				// 회원 적립금 내역

	private int myPoint;			// 누적 적립금 내역
	private String gradeName;		// 등급 이름
	private String mName;			// 회원이름
	private String mId;				// 회원 아이디

	private double point_rate;		// 등급별 적립율
	private String grade_code;		// 회원 등급
	
	private int revNo;				// 리뷰 번호
	private String revTitle;		// 리뷰 제목
	private Date revDate;			// 리뷰 작성 날짜
	private String revCont;			// 리뷰 내용
	


	
	
	public MemberPoint() {
	}


	public MemberPoint(int rnum, Date pointDate, String oNo, String pointContent, int pointAmount, String mNo,
			String pointCate, int mPoint) {
		this.rnum = rnum;
		this.pointDate = pointDate;
		this.oNo = oNo;
		this.pointContent = pointContent;
		this.pointAmount = pointAmount;
		this.mNo = mNo;
		this.pointCate = pointCate;
		this.mPoint = mPoint;
	}



	public MemberPoint(int rnum, String pointNo, Date pointDate, String oNo, String pointContent, int pointAmount,
			String mNo, String pointCate, int mPoint, int myPoint) {
		this.rnum = rnum;
		this.pointNo = pointNo;
		this.pointDate = pointDate;
		this.oNo = oNo;
		this.pointContent = pointContent;
		this.pointAmount = pointAmount;
		this.mNo = mNo;
		this.pointCate = pointCate;
		this.mPoint = mPoint;
		this.myPoint = myPoint;
	}
	
	

	



	public MemberPoint(int rnum, String pointNo, Date pointDate, String oNo, String pointContent, int pointAmount,
			String mNo, String pointCate, int myPoint) {
		this.rnum = rnum;
		this.pointNo = pointNo;
		this.pointDate = pointDate;
		this.oNo = oNo;
		this.pointContent = pointContent;
		this.pointAmount = pointAmount;
		this.mNo = mNo;
		this.pointCate = pointCate;
		this.myPoint = myPoint;
	}


	public MemberPoint(int mPoint, String gradeName, String mName) {
		this.mPoint = mPoint;
		this.gradeName = gradeName;
		this.mName = mName;
	
	}
	

	public MemberPoint(int rnum, String pointNo, Date pointDate, String oNo, String pointContent, int pointAmount,
			String mNo, String pointCate, int mPoint, int myPoint, String gradeName, String mName, String mId,
			double point_rate, String grade_code) {
		this.rnum = rnum;
		this.pointNo = pointNo;
		this.pointDate = pointDate;
		this.oNo = oNo;
		this.pointContent = pointContent;
		this.pointAmount = pointAmount;
		this.mNo = mNo;
		this.pointCate = pointCate;
		this.mPoint = mPoint;
		this.myPoint = myPoint;
		this.gradeName = gradeName;
		this.mName = mName;
		this.mId = mId;
		this.point_rate = point_rate;
		this.grade_code = grade_code;
	}

	
	
	

	public MemberPoint(int rnum, String pointNo, Date pointDate, String oNo, String pointContent, int pointAmount,
			String mNo, String pointCate, int mPoint, int myPoint, String gradeName, String mName, String mId,
			double point_rate, String grade_code, int revNo, String revTitle, Date revDate, String revCont) {
		this.rnum = rnum;
		this.pointNo = pointNo;
		this.pointDate = pointDate;
		this.oNo = oNo;
		this.pointContent = pointContent;
		this.pointAmount = pointAmount;
		this.mNo = mNo;
		this.pointCate = pointCate;
		this.mPoint = mPoint;
		this.myPoint = myPoint;
		this.gradeName = gradeName;
		this.mName = mName;
		this.mId = mId;
		this.point_rate = point_rate;
		this.grade_code = grade_code;
		this.revNo = revNo;
		this.revTitle = revTitle;
		this.revDate = revDate;
		this.revCont = revCont;
	}

	
	
	

	public MemberPoint(int rnum, String pointNo, Date pointDate, String oNo, String pointContent, int pointAmount,
			String mNo, String pointCate, int myPoint, String gradeName, String mName, String mId, double point_rate,
			String grade_code) {
		this.rnum = rnum;
		this.pointNo = pointNo;
		this.pointDate = pointDate;
		this.oNo = oNo;
		this.pointContent = pointContent;
		this.pointAmount = pointAmount;
		this.mNo = mNo;
		this.pointCate = pointCate;
		this.myPoint = myPoint;
		this.gradeName = gradeName;
		this.mName = mName;
		this.mId = mId;
		this.point_rate = point_rate;
		this.grade_code = grade_code;
	}


	public int getRnum() {
		return rnum;

	}



	public void setRnum(int rnum) {
		this.rnum = rnum;
	}



	public String getPointNo() {
		return pointNo;
	}



	public void setPointNo(String pointNo) {
		this.pointNo = pointNo;
	}



	public Date getPointDate() {
		return pointDate;
	}



	public void setPointDate(Date pointDate) {
		this.pointDate = pointDate;
	}



	public String getoNo() {
		return oNo;
	}



	public void setoNo(String oNo) {
		this.oNo = oNo;
	}



	public String getPointContent() {
		return pointContent;
	}



	public void setPointContent(String pointContent) {
		this.pointContent = pointContent;
	}



	public int getPointAmount() {
		return pointAmount;
	}



	public void setPointAmount(int pointAmount) {
		this.pointAmount = pointAmount;
	}



	public String getmNo() {
		return mNo;
	}



	public void setmNo(String mNo) {
		this.mNo = mNo;
	}



	public String getPointCate() {
		return pointCate;
	}



	public void setPointCate(String pointCate) {
		this.pointCate = pointCate;
	}



	public int getmPoint() {
		return mPoint;
	}



	public void setmPoint(int mPoint) {
		this.mPoint = mPoint;
	}



	public int getMyPoint() {
		return myPoint;
	}



	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public double getPoint_rate() {
		return point_rate;
	}
	
	public void setPoint_rate(double point_rate) {
		this.point_rate = point_rate;
	}
	
	public String getGrade_code() {
		return grade_code;
	}
	
	public void setGrade_code(String grade_code) {
		this.grade_code = grade_code;
	}


	
	
	
	public String getGradeName() {
		return gradeName;
	}





	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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

	
	
	

	public int getRevNo() {
		return revNo;
	}


	public void setRevNo(int revNo) {
		this.revNo = revNo;
	}


	public String getRevTitle() {
		return revTitle;
	}


	public void setRevTitle(String revTitle) {
		this.revTitle = revTitle;
	}


	public Date getRevDate() {
		return revDate;
	}


	public void setRevDate(Date revDate) {
		this.revDate = revDate;
	}


	public String getRevCont() {
		return revCont;
	}


	public void setRevCont(String revCont) {
		this.revCont = revCont;
	}


	@Override
	public String toString() {
		return "MemberPoint [rnum=" + rnum + ", pointNo=" + pointNo + ", pointDate=" + pointDate + ", oNo=" + oNo
				+ ", pointContent=" + pointContent + ", pointAmount=" + pointAmount + ", mNo=" + mNo + ", pointCate="
				+ pointCate + ", mPoint=" + mPoint + ", myPoint=" + myPoint + ", gradeName=" + gradeName + ", mName="
				+ mName + ", mId=" + mId + ", point_rate=" + point_rate + ", grade_code=" + grade_code + ", revNo="
				+ revNo + ", revTitle=" + revTitle + ", revDate=" + revDate + ", revCont=" + revCont + "]";
	}


	
	

}