package payment.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9136359375880192792L;

	private String o_no;
	private Date o_date;
	private String dstn_chk;
	private String rcv_name;
	private String rcv_adrs;
	private String rcv_phone;
	private String comment;
	private int total_price;
	private int point_use;
	private String pmnt_mthd;
	private String ship_price;
	private int pmnt_price;
	private int expt_point;
	private String m_no;
	
	
	public Payment() {
		super();
	}
	
	
	
	public Payment(String rcv_name, String rcv_adrs, String rcv_phone, String comment, int total_price,
			int point_use, String ship_price, int pmnt_price, int expt_point, String m_no) {
		super();
		this.rcv_name = rcv_name;
		this.rcv_adrs = rcv_adrs;
		this.rcv_phone = rcv_phone;
		this.comment = comment;
		this.total_price = total_price;
		this.point_use = point_use;
		this.ship_price = ship_price;
		this.pmnt_price = pmnt_price;
		this.expt_point = expt_point;
		this.m_no = m_no;
	}



	public Payment(String o_no, Date o_date, String dstn_chk, String rcv_name, String rcv_adrs, String rcv_phone,
			String comment, int total_price, int point_use, String pmnt_mthd, String ship_price, int pmnt_price,
			int expt_point, String m_no) {
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
	public String getRcv_phone() {
		return rcv_phone;
	}
	public void setRcv_phone(String rcv_phone) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Payment [o_no=" + o_no + ", o_date=" + o_date + ", dstn_chk=" + dstn_chk + ", rcv_name=" + rcv_name
				+ ", rcv_adrs=" + rcv_adrs + ", rcv_phone=" + rcv_phone + ", comment=" + comment + ", total_price="
				+ total_price + ", point_use=" + point_use + ", pmnt_mthd=" + pmnt_mthd + ", ship_price=" + ship_price
				+ ", pmnt_price=" + pmnt_price + ", expt_point=" + expt_point + ", m_no=" + m_no + "]";
	}

	
	
	
}
