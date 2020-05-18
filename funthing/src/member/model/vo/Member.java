package member.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4952932019676617041L;

	private int rnum;
	private String mNo;
	private String mId;
	private String mPwd;
	private String mName;
	private String bDay;
	private String mEmail;
	private Date joinDate;
	private String reference;
	private String gradeCode;
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

	public Member(String mName, String mEmail, String mTell) {
		super();
		this.mName = mName;
		this.mEmail = mEmail;
		this.mTell = mTell;
	}
	
	public Member(String mId, String mName, String mEmail, String mTell, String bDay, String mNo) {
		this.mId = mId;
		this.mName = mName;
		this.mEmail = mEmail;
		this.mTell = mTell;
		this.bDay = bDay;
		this.mNo = mNo;
	}
	
	public Member(String mId, String mPwd, String mName, String mEmail, String mTell, String bDay, String reference, String alarm_YN) {
		this.mId = mId;
		this.mPwd = mPwd;
		this.mName = mName;
		this.mEmail = mEmail;
		this.mTell = mTell;
		this.bDay = bDay;
		this.reference = reference;
		this.alarm_YN = alarm_YN;
		
	}

	public Member(String mNo, String mId, String mPwd, String mName, String bDay, String mEmail, Date joinDate,
			String reference, String gradeCode, String alarm_YN, String status_YN, int mPoint, String mTell,
			int hPoint) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.mName = mName;
		this.bDay = bDay;
		this.mEmail = mEmail;
		this.joinDate = joinDate;
		this.reference = reference;
		this.gradeCode = gradeCode;
		this.alarm_YN = alarm_YN;
		this.status_YN = status_YN;
		this.mPoint = mPoint;
		this.mTell = mTell;
		this.hPoint = hPoint;
	}
	public Member(int rnum, String mNo, String mId, String mName, String bDay, String mEmail, String mTell,
			Date joinDate, String reference, String alarm_YN, String gradeCode , int mPoint, int hPoint,
			String status_YN) {
		this.rnum = rnum;
		this.mNo = mNo;
		this.mId = mId;
		this.mName = mName;
		this.bDay = bDay;
		this.mEmail = mEmail;
		this.mTell = mTell;
		this.joinDate = joinDate;
		this.reference = reference;
		this.alarm_YN = alarm_YN;
		this.gradeCode = gradeCode;
		this.mPoint = mPoint;
		this.hPoint = hPoint;
		this.status_YN = status_YN;
	}

	public int getRnum()
	{
		return rnum;
	}
	public void setRnum(int rnum)
	{
		this.rnum = rnum;
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

	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradCode) {
		this.gradeCode = gradCode;
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
				+ gradeCode + ", alarm_YN=" + alarm_YN + ", status_YN=" + status_YN + ", mPoint=" + mPoint + ", mTell="
				+ mTell + ", hPoint=" + hPoint + "]";
	}
	
	
	
	
	
}
