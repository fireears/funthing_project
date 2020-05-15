	// admin 주문관리 페이지_혜린	
package payment.model.vo;

public class OrderInfo {

	private String oNo;			// 주문번호
	private String mId;			// 회원아이디
	private String pmntMthd;	// 결제방법
	private String painYn;		// 결제유무
	private String prcsStatus;	// 배송단계
	private int pmntPrice;		// 총 합계
	private String cancelYn;	// 취소여부
	private int rnum;			// view번호
	public OrderInfo() {
		super();
	}
	public OrderInfo(String oNo, String mId, String pmntMthd, String painYn, String prcsStatus, int pmntPrice,
			String cancelYn, int rnum) {
		super();
		this.oNo = oNo;
		this.mId = mId;
		this.pmntMthd = pmntMthd;
		this.painYn = painYn;
		this.prcsStatus = prcsStatus;
		this.pmntPrice = pmntPrice;
		this.cancelYn = cancelYn;
		this.rnum = rnum;
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
	public String getPmntMthd() {
		return pmntMthd;
	}
	public void setPmntMthd(String pmntMthd) {
		this.pmntMthd = pmntMthd;
	}
	public String getPainYn() {
		return painYn;
	}
	public void setPainYn(String painYn) {
		this.painYn = painYn;
	}
	public String getPrcsStatus() {
		return prcsStatus;
	}
	public void setPrcsStatus(String prcsStatus) {
		this.prcsStatus = prcsStatus;
	}
	public int getPmntPrice() {
		return pmntPrice;
	}
	public void setPmntPrice(int pmntPrice) {
		this.pmntPrice = pmntPrice;
	}
	public String getCancelYn() {
		return cancelYn;
	}
	public void setCancelYn(String cancelYn) {
		this.cancelYn = cancelYn;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	@Override
	public String toString() {
		return "OrderInfo [oNo=" + oNo + ", mId=" + mId + ", pmntMthd=" + pmntMthd + ", painYn=" + painYn
				+ ", prcsStatus=" + prcsStatus + ", pmntPrice=" + pmntPrice + ", cancelYn=" + cancelYn + ", rnum="
				+ rnum + "]";
	}
	
	
}
