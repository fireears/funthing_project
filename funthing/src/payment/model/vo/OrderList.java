package payment.model.vo;

import java.sql.Date;

public class OrderList {
	
	private int rNum;
	private int listNo;			// 게시판
	private String oNo;			// 주문번호
	private String pName;		// 상품명
	private String pColor;		// 상품색상
	private String pSize;		// 상품사이즈
	private int pPrice;			// 상품가격
	private int oNum;			// 상품수량
	private String prcsStatus;	// 주문상태
	private String mId;			// 회원아이디
	private Date oDate;			// 주문날짜
	private String mNo;		// 회원번호
	
	public OrderList() {
		super();
	}

	public OrderList(int rNum, int listNo, String oNo, String pName, String pColor, String pSize, int pPrice, int oNum,
			String prcsStatus, String mId, Date oDate, String mNo) {
		super();
		this.rNum = rNum;
		this.listNo = listNo;
		this.oNo = oNo;
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.pPrice = pPrice;
		this.oNum = oNum;
		this.prcsStatus = prcsStatus;
		this.mId = mId;
		this.oDate = oDate;
		this.mNo = mNo;
	}
	
	
	
	

	public OrderList(String oNo, String pName, String pColor, String pSize, int pPrice, int oNum, String prcsStatus,
			Date oDate, String mNo) {
		super();
		this.oNo = oNo;
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.pPrice = pPrice;
		this.oNum = oNum;
		this.prcsStatus = prcsStatus;
		this.oDate = oDate;
		this.mNo = mNo;
	}

	public OrderList(int rNum, String oNo, String pName, String pColor, String pSize, int pPrice, int oNum,
			String prcsStatus, Date oDate, String mNo) {
		super();
		this.rNum = rNum;
		this.oNo = oNo;
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.pPrice = pPrice;
		this.oNum = oNum;
		this.prcsStatus = prcsStatus;
		this.oDate = oDate;
		this.mNo = mNo;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	public int getListNo() {
		return listNo;
	}

	public void setListNo(int listNo) {
		this.listNo = listNo;
	}

	public String getoNo() {
		return oNo;
	}

	public void setoNo(String oNo) {
		this.oNo = oNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpColor() {
		return pColor;
	}

	public void setpColor(String pColor) {
		this.pColor = pColor;
	}

	public String getpSize() {
		return pSize;
	}

	public void setpSize(String pSize) {
		this.pSize = pSize;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getoNum() {
		return oNum;
	}

	public void setoNum(int oNum) {
		this.oNum = oNum;
	}

	public String getPrcsStatus() {
		return prcsStatus;
	}

	public void setPrcsStatus(String prcsStatus) {
		this.prcsStatus = prcsStatus;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public Date getoDate() {
		return oDate;
	}

	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}

	public String getmNo() {
		return mNo;
	}

	public void setmNo(String mNo) {
		this.mNo = mNo;
	}

	@Override
	public String toString() {
		return "OrderList [rNum=" + rNum + ", listNo=" + listNo + ", oNo=" + oNo + ", pName=" + pName + ", pColor="
				+ pColor + ", pSize=" + pSize + ", pPrice=" + pPrice + ", oNum=" + oNum + ", prcsStatus=" + prcsStatus
				+ ", mId=" + mId + ", oDate=" + oDate + ", mNo=" + mNo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
