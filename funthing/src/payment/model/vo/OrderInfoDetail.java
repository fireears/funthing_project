package payment.model.vo;

public class OrderInfoDetail {
	private String oDate;		// 주문일자
	private String rcvName;		// 받을사람 성함
	private String rcvAdrs;		// 주소
	private int rcvPhone;	// 전화번호
	private String commentt;	// 남기실 말
	private int exptPoint;		// 예정적립금
	private String pNo;			// 상품번호
	private int oNum;			// 상품수량
	private int totalPrice;		// 상품 총 합계
	private int pointUse;		// 적립금 사용
	private int pmntPrice;		// 최종 결제 금액
	private String oNo;			// 주문번호
	private String mId;			// 회원 아이디
	public OrderInfoDetail() {
		super();
	}
	public OrderInfoDetail(String oDate, String rcvName, String rcvAdrs, int rcvPhone, String commentt, int exptPoint,
			String pNo, int oNum, int totalPrice, int pointUse, int pmntPrice, String oNo, String mId) {
		super();
		this.oDate = oDate;
		this.rcvName = rcvName;
		this.rcvAdrs = rcvAdrs;
		this.rcvPhone = rcvPhone;
		this.commentt = commentt;
		this.exptPoint = exptPoint;
		this.pNo = pNo;
		this.oNum = oNum;
		this.totalPrice = totalPrice;
		this.pointUse = pointUse;
		this.pmntPrice = pmntPrice;
		this.oNo = oNo;
		this.mId = mId;
	}
	public String getoDate() {
		return oDate;
	}
	public void setoDate(String oDate) {
		this.oDate = oDate;
	}
	public String getRcvName() {
		return rcvName;
	}
	public void setRcvName(String rcvName) {
		this.rcvName = rcvName;
	}
	public String getRcvAdrs() {
		return rcvAdrs;
	}
	public void setRcvAdrs(String rcvAdrs) {
		this.rcvAdrs = rcvAdrs;
	}
	public int getRcvPhone() {
		return rcvPhone;
	}
	public void setRcvPhone(int rcvPhone) {
		this.rcvPhone = rcvPhone;
	}
	public String getCommentt() {
		return commentt;
	}
	public void setCommentt(String commentt) {
		this.commentt = commentt;
	}
	public int getExptPoint() {
		return exptPoint;
	}
	public void setExptPoint(int exptPoint) {
		this.exptPoint = exptPoint;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public int getoNum() {
		return oNum;
	}
	public void setoNum(int oNum) {
		this.oNum = oNum;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPointUse() {
		return pointUse;
	}
	public void setPointUse(int pointUse) {
		this.pointUse = pointUse;
	}
	public int getPmntPrice() {
		return pmntPrice;
	}
	public void setPmntPrice(int pmntPrice) {
		this.pmntPrice = pmntPrice;
	}
	public String getoNo() {
		return oNo;
	}
	public void setoNo(String oNo) {
		this.oNo = oNo;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	@Override
	public String toString() {
		return "OrderInfoDetail [oDate=" + oDate + ", rcvName=" + rcvName + ", rcvAdrs=" + rcvAdrs + ", rcvPhone="
				+ rcvPhone + ", commentt=" + commentt + ", exptPoint=" + exptPoint + ", pNo=" + pNo + ", oNum=" + oNum
				+ ", totalPrice=" + totalPrice + ", pointUse=" + pointUse + ", pmntPrice=" + pmntPrice + ", oNo=" + oNo
				+ ", mId=" + mId + "]";
	}
	
	
	
}
