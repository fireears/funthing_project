// 배송지수정 및 주문취소 페이지_혜린
package payment.model.vo;

import java.sql.Date;

public class OrderUpdate {
	private int rNum;
	// PRODUCT
	private int pNo;			// 상품번호
	private String thumbnail;	// 대표이미지
	private String pName;		// 상품이름
	private String pColor;		// 상품색상
	private String pSize;		// 상품사이즈

	private int totalPrice;		// 상품가격(PAYMANT_INFO)
	// PAYMENT_IMFO table
	private String o_no;		// 주문번호
	private Date o_date;		// 주문일자
	private String dstn_chk;	// 배송지확인
	private String rcv_name;	// 받으실분
	private String rcv_adrs;	// 받으실분 주소
	private int rcv_phone;		// 받으실분 전화번호
	private String comment;		// 남기실말
//	private int total_price;	// 상품 합계 금액
	private int point_use;		// 적립금사용
	private String pmnt_mthd;	// 결제수단선택
	private String ship_price;	// 배송비유무
	private int pmnt_price;		// 최종결제 금액
	private int expt_point;		// 예정적립금
	private String m_no;		// 회원번호	
	// JUMUN table
	private String prcsStatus;	// 주문상태
	private String cancelYn;	// 취소여부
	// PRODUCT_ORDER table	
	private int oNum;			// 상품구매 수량
	
	public OrderUpdate() {
		super();
	}
	
	

	public OrderUpdate(String o_no, Date o_date,String pName, String pColor, String pSize, int oNum, String rcv_name, String rcv_adrs, int rcv_phone, String comment,int totalPrice, 
			 int point_use, String pmnt_mthd,String ship_price, int pmnt_price, int expt_point, String prcsStatus, String cancelYn) {
			
		super();
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.totalPrice = totalPrice;
		this.o_no = o_no;
		this.o_date = o_date;
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		this.point_use = point_use;
		this.pmnt_mthd = pmnt_mthd;
		this.ship_price = ship_price;
		this.pmnt_price = pmnt_price;
		this.expt_point = expt_point;
		this.prcsStatus = prcsStatus;
		this.oNum = oNum;
		this.cancelYn = cancelYn;
	}



	public OrderUpdate(String o_no, String cancelYn) {
		super();
		this.o_no = o_no;
		this.cancelYn = cancelYn;
	}



	public OrderUpdate(String o_no, String rcv_name, String rcv_adrs, int rcv_phone, String comment) {
		super();
		this.o_no = o_no;
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		
	}


	



	public OrderUpdate(String thumbnail, String pName, String pColor, String pSize, int totalPrice, String o_no, Date o_date,
			String rcv_name, String rcv_adrs, int rcv_phone, String comment, String m_no, String prcsStatus,
			String cancelYn, int oNum) {
		super();
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.totalPrice = totalPrice;
		this.o_no = o_no;
		this.o_date = o_date;
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		this.m_no = m_no;
		this.prcsStatus = prcsStatus;
		this.cancelYn = cancelYn;
		this.oNum = oNum;
	}
	

	protected OrderUpdate(int rNum, int pNo, String pName, String pColor, String pSize, int totalPrice, String o_no,
			Date o_date, String dstn_chk, String rcv_name, String rcv_adrs, int rcv_phone, String comment,
			int point_use, String pmnt_mthd, String ship_price, int pmnt_price, int expt_point, String m_no,
			String prcsStatus, String cancelYn, int oNum) {
		super();
		this.rNum = rNum;
		this.pNo = pNo;
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.totalPrice = totalPrice;
		this.o_no = o_no;
		this.o_date = o_date;
		this.dstn_chk = dstn_chk;
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		this.point_use = point_use;
		this.pmnt_mthd = pmnt_mthd;
		this.ship_price = ship_price;
		this.pmnt_price = pmnt_price;
		this.expt_point = expt_point;
		this.m_no = m_no;
		this.prcsStatus = prcsStatus;
		this.cancelYn = cancelYn;
		this.oNum = oNum;
	}
	
	
	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getO_no() {
		return o_no;
	}

	public void setO_no(String o_no) {
		this.o_no = o_no;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public String getDstn_chk() {
		return dstn_chk;
	}

	public void setDstn_chk(String dstn_chk) {
		this.dstn_chk = dstn_chk;
	}

	public String getRcv_name() {
		return rcv_name;
	}

	public void setRcv_name(String rcv_name) {
		this.rcv_name = rcv_name;
	}

	public String getRcv_adrs() {
		return rcv_adrs;
	}

	public void setRcv_adrs(String rcv_adrs) {
		this.rcv_adrs = rcv_adrs;
	}

	public int getRcv_phone() {
		return rcv_phone;
	}

	public void setRcv_phone(int rcv_phone) {
		this.rcv_phone = rcv_phone;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getPoint_use() {
		return point_use;
	}

	public void setPoint_use(int point_use) {
		this.point_use = point_use;
	}

	public String getPmnt_mthd() {
		return pmnt_mthd;
	}

	public void setPmnt_mthd(String pmnt_mthd) {
		this.pmnt_mthd = pmnt_mthd;
	}

	public String getShip_price() {
		return ship_price;
	}

	public void setShip_price(String ship_price) {
		this.ship_price = ship_price;
	}

	public int getPmnt_price() {
		return pmnt_price;
	}

	public void setPmnt_price(int pmnt_price) {
		this.pmnt_price = pmnt_price;
	}

	public int getExpt_point() {
		return expt_point;
	}

	public void setExpt_point(int expt_point) {
		this.expt_point = expt_point;
	}

	public String getM_no() {
		return m_no;
	}

	public void setM_no(String m_no) {
		this.m_no = m_no;
	}

	public String getPrcsStatus() {
		return prcsStatus;
	}

	public void setPrcsStatus(String prcsStatus) {
		this.prcsStatus = prcsStatus;
	}

	public String getCancelYn() {
		return cancelYn;
	}

	public void setCancelYn(String cancelYn) {
		this.cancelYn = cancelYn;
	}

	public int getoNum() {
		return oNum;
	}

	public void setoNum(int oNum) {
		this.oNum = oNum;
	}

	@Override
	public String toString() {
		return "OrderUpdate [rNum=" + rNum + ", pNo=" + pNo + ", pName=" + pName + ", pColor=" + pColor + ", pSize="
				+ pSize + ", totalPrice=" + totalPrice + ", o_no=" + o_no + ", o_date=" + o_date + ", dstn_chk="
				+ dstn_chk + ", rcv_name=" + rcv_name + ", rcv_adrs=" + rcv_adrs + ", rcv_phone=" + rcv_phone
				+ ", comment=" + comment + ", point_use=" + point_use + ", pmnt_mthd=" + pmnt_mthd + ", ship_price="
				+ ship_price + ", pmnt_price=" + pmnt_price + ", expt_point=" + expt_point + ", m_no=" + m_no
				+ ", prcsStatus=" + prcsStatus + ", cancelYn=" + cancelYn + ", oNum=" + oNum + "]";
	}


	
}
