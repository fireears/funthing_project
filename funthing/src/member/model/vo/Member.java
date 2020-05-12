package member.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4952932019676617041L;

	private String mNo;
	private String mId;
	private String mPwd;
	private String mName;
	private String bDay;
	private String mEmail;
	private Date joinDate;
	private String reference;
	private String gradCode;
	private String alarm_YN;
	private String status_YN;
	private int mPoint;
	private String mTell;
	private int hPoint;
	
	public Member() {
	}
	
	public Member(String mId, String mPwd) {
		this.mId = mId;
		this.mPwd = mPwd;
	}

	public Member(String mNo, String mId, String mPwd, String mName, String bDay, String mEmail, Date joinDate,
			String reference, String gradCode, String alarm_YN, String status_YN, int mPoint, String mTell,
			int hPoint) {
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.mName = mName;
		this.bDay = bDay;
		this.mEmail = mEmail;
		this.joinDate = joinDate;
		this.reference = reference;
		this.gradCode = gradCode;
		this.alarm_YN = alarm_YN;
		this.status_YN = status_YN;
		this.mPoint = mPoint;
		this.mTell = mTell;
		this.hPoint = hPoint;
	}

	public String getmNo() {
		return mNo;
	}

	public void setmNo(String mNo) {
		this.mNo = mNo;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getGradCode() {
		return gradCode;
	}

	public void setGradCode(String gradCode) {
		this.gradCode = gradCode;
	}

	public String getAlarm_YN() {
		return alarm_YN;
	}

	public void setAlarm_YN(String alarm_YN) {
		this.alarm_YN = alarm_YN;
	}

	public String getStatus_YN() {
		return status_YN;
	}

	public void setStatus_YN(String status_YN) {
		this.status_YN = status_YN;
	}

	public int getmPoint() {
		return mPoint;
	}

	public void setmPoint(int mPoint) {
		this.mPoint = mPoint;
	}

	public String getmTell() {
		return mTell;
	}

	public void setmTell(String mTell) {
		this.mTell = mTell;
	}

	public int gethPoint() {
		return hPoint;
	}

	public void sethPoint(int hPoint) {
		this.hPoint = hPoint;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPwd=" + mPwd + ", mName=" + mName + ", bDay=" + bDay
				+ ", mEmail=" + mEmail + ", joinDate=" + joinDate + ", reference=" + reference + ", gradCode="
				+ gradCode + ", alarm_YN=" + alarm_YN + ", status_YN=" + status_YN + ", mPoint=" + mPoint + ", mTell="
				+ mTell + ", hPoint=" + hPoint + "]";
	}
	
	
	
	
	
}
