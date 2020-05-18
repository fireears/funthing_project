package brand.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Brand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1624025395672996587L;

	private String bNo;
	private String bName;
	private String bCeo;
	private String bPhone;
	private String bAddress;
	private String bEmail;
	private Date bLchDate;
	private String bLchYn;
	public Brand() {
		super();
	}
	
	
	
	
	public Brand(String bName, String bCeo, String bPhone, String bAddress, String bEmail, Date bLchDate,
			String bLchYn) {
		this.bName = bName;
		this.bCeo = bCeo;
		this.bPhone = bPhone;
		this.bAddress = bAddress;
		this.bEmail = bEmail;
		this.bLchDate = bLchDate;
		this.bLchYn = bLchYn;
	}



	public Brand(String bNo, String bName, String bCeo, String bPhone, String bAddress, String bEmail, Date bLchDate,
			String bLchYn) {
		super();
		this.bNo = bNo;
		this.bName = bName;
		this.bCeo = bCeo;
		this.bPhone = bPhone;
		this.bAddress = bAddress;
		this.bEmail = bEmail;
		this.bLchDate = bLchDate;
		this.bLchYn = bLchYn;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbCeo() {
		return bCeo;
	}
	public void setbCeo(String bCeo) {
		this.bCeo = bCeo;
	}
	public String getbPhone() {
		return bPhone;
	}
	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}
	public String getbAddress() {
		return bAddress;
	}
	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}
	public String getbEmail() {
		return bEmail;
	}
	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}
	public Date getbLchDate() {
		return bLchDate;
	}
	public void setbLchDate(Date bLchDate) {
		this.bLchDate = bLchDate;
	}
	public String getbLchYn() {
		return bLchYn;
	}
	public void setbLchYn(String bLchYn) {
		this.bLchYn = bLchYn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Brand [bNo=" + bNo + ", bName=" + bName + ", bCeo=" + bCeo + ", bPhone=" + bPhone + ", bAddress="
				+ bAddress + ", bEmail=" + bEmail + ", bLchDate=" + bLchDate + ", bLchYn=" + bLchYn + "]";
	}
	
	
}
