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





	@Override
	public String toString() {
		return "MemberPoint [rnum=" + rnum + ", pointNo=" + pointNo + ", pointDate=" + pointDate + ", oNo=" + oNo
				+ ", pointContent=" + pointContent + ", pointAmount=" + pointAmount + ", mNo=" + mNo + ", pointCate="
				+ pointCate + ", mPoint=" + mPoint + ", myPoint=" + myPoint + ", gradeName=" + gradeName + ", mName="
				+ mName + "]";
	}





	
	
	
}