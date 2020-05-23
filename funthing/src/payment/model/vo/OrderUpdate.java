package payment.model.vo;

import java.sql.Date;

public class OrderUpdate {

	private String o_no;		// 주문번호
	private Date o_date;		// 주문일자
	private String dstn_chk;	// 배송지확인
	private String rcv_name;	// 받으실분
	private String rcv_adrs;	// 받으실분 주소
	private int rcv_phone;		// 받으실분 전화번호
	private String comment;		// 남기실말
	private int total_price;	// 상품 합계 금액
	private int point_use;		// 적립금사용
	private String pmnt_mthd;	// 결제수단선택
	private String ship_price;	// 배송비유무
	private int pmnt_price;		// 최종결제 금액
	private int expt_point;		// 예정적립금
	private String m_no;		// 회원번호	
	// JUMUN table
	private String cancelYn;	// 취소여부
	// PRODUCT_ORDER table	
	private int oNum;			// 상품구매 수량
	
	public OrderUpdate() {
		super();
	}

	public OrderUpdate(String o_no, Date o_date, String dstn_chk, String rcv_name, String rcv_adrs, int rcv_phone,
			String comment, int total_price, int point_use, String pmnt_mthd, String ship_price, int pmnt_price,
			int expt_point, String m_no, String cancelYn, int oNum) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.dstn_chk = dstn_chk;
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		this.total_price = total_price;
		this.point_use = point_use;
		this.pmnt_mthd = pmnt_mthd;
		this.ship_price = ship_price;
		this.pmnt_price = pmnt_price;
		this.expt_point = expt_point;
		this.m_no = m_no;
		this.cancelYn = cancelYn;
		this.oNum = oNum;
	}

	
	public OrderUpdate(String o_no, Date o_date, String rcv_name, String rcv_adrs, int rcv_phone, String comment,
			int total_price, int pmnt_price, String m_no, String cancelYn, int oNum) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		this.total_price = total_price;
		this.pmnt_price = pmnt_price;
		this.m_no = m_no;
		this.cancelYn = cancelYn;
		this.oNum = oNum;
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

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
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
		return "OrderUpdate [o_no=" + o_no + ", o_date=" + o_date + ", dstn_chk=" + dstn_chk + ", rcv_name=" + rcv_name
				+ ", rcv_adrs=" + rcv_adrs + ", rcv_phone=" + rcv_phone + ", comment=" + comment + ", total_price="
				+ total_price + ", point_use=" + point_use + ", pmnt_mthd=" + pmnt_mthd + ", ship_price=" + ship_price
				+ ", pmnt_price=" + pmnt_price + ", expt_point=" + expt_point + ", m_no=" + m_no + ", cancelYn="
				+ cancelYn + ", oNum=" + oNum + "]";
	}
	
	
	
}
